/* =============================================================================
 * sparkplug.js v2.0.0 WIP
 * ============================================================================= */

// setup
;(function (global, $){
  'use strict';

  $(function () {
    // placeholder attribute polyfill for IE8-9
    if ($.fn.placeholder) {
      $('input[placeholder], textarea[placeholder]').placeholder();
    }

    // autofocus attribute polyfill for IE8-9
    var $focusEl = $('[autofocus]:not(:focus)').eq(0);
    if ($focusEl.length) {
      $focusEl.focus();
    }

    // tooltipのopt-in機能を有効化
    $('[data-toggle="tooltip"]').tooltip({
      container: 'body',
      delay: { show: 500, hide: 100 }
    });

    // popoverのopt-in機能を有効化
    $('[data-toggle="popover"]').each(function (index, el) {
      var $el = $(el);
      var options = {
        container: 'body',
      };
      if (isDelayRequired($el)) {
        options.delay = { show: 500, hide: 100 };
      }
      $el.popover(options);
    });

    function isDelayRequired($el) {
      var data = $el.data('trigger');
      if (data) {
        return data.indexOf('hover') !== -1;
      }
      return false;
    }
  });
}(window, jQuery));


// TODO: Modularization
;(function (global, $) {
  'use strict';

  $(function () {
    // subnavの上部固定用。subnavが存在しない場合はスキップ。
    var $nav = $('#subnav');
    if ($nav.size() > 0) {
      //navの位置
      var navTop = $nav.offset().top;
      //スクロールするたびに実行
      $(global).scroll(function () {
        var currentTop = $(this).scrollTop();
        //スクロール位置がnavの位置より下だったらクラスsp-subnav-fixedを追加（ヘッダーの分の41pxを追加）
        if ((currentTop + 41) >= navTop) {
          $nav.addClass('sp-subnav-fixed');
        } else if ((currentTop - 41) <= navTop) {
          $nav.removeClass('sp-subnav-fixed');
        }
      });
    }

    // 画面下端にはりつく「ページの先頭へ」ボタン
    var $topBtn = $('.sp-btn-sticky-bottom');
    $topBtn.hide();
    $(global).scroll(function () {
      if ($(this).scrollTop() > 80) {
        $topBtn.fadeIn('fast');
      } else {
        $topBtn.fadeOut('fast');
      }
    });
    //スクロールしてトップ
    $topBtn.click(function () {
      $('body,html').animate({ scrollTop: 0 }, 200);
      return false;
    });
  });
}(window, jQuery));


// Datagrid
;(function (global, $) {
  'use strict';

  var Datagrid = function (el, options) {
    this.initialize.apply(this, arguments);
  };

  Datagrid.prototype = {
    initialize: function (el, options) {
      this.options = $.extend({}, $.fn.spDatagrid.defaults, options);
      var $el = this.$el = $(el);
      // theadに配置された親チェックボックス
      var $parent = this.$parent = $el.find('.table thead th.sp-row-selector input[type=checkbox]');
      // tbodyの各行に配置された子チェックボックス
      var $children = this.$children = $el.find('table tbody td.sp-row-selector input[type=checkbox]');

      // 複数回呼ばれた時のメモリリーク、意図しない挙動の回避のため、イベントリスナをクリア
      $el.off('click.sp.datagrid');

      if (!this.options.enabled) { // 機能を無効化
        // ハイライトを除去
        $children.closest('tr').removeClass('sp-row-selected');
        return;
      }

      var that = this;

      // インスタンス生成時のデータグリッドのチェックボックスにチェックがあるケースに対応
      $children.each(function () {
        that.parentIntegrity(this);
      });
      this.highlightToggles();

      // データグリッドまで伝搬したクリックイベントで一元的に制御
      $el.on('click.sp.datagrid', function (e) {
        var src = e.target;

        if (src === that.$parent[0]) { // 親チェックボックスをクリックした時
          that.childrenToggle();
        } else if (src === that.$parent.closest('th')[0]) { // 親チェックボックスのセルをクリックした時
          that.$parent.prop('checked', !that.$parent.prop('checked'));
          that.childrenToggle();
        }

        that.$children.each(function () {
          if (src === this) { // 子チェックボックスをクリックした時
            that.parentIntegrity(this);
            that.highlightToggle(this);
            return false;
          } else if (src === $(this).closest('td')[0]) { // 子チェックボックスのセルをクリックした時
            $(this).prop('checked', !$(this).prop('checked'));
            that.parentIntegrity(this);
            that.highlightToggle(this);
            return false;
          }
        });
      });
    },
    childrenToggle: function () { // 全ての子チェックボックスをトグル
      this.$children.prop('checked', this.$parent.prop('checked'));
      this.highlightToggles();
    },
    highlightToggle: function (child) { // 選択行のハイライトをトグル
      if (this.options.highlight) {
        $(child).closest('tr').toggleClass('sp-row-selected', $(child).prop('checked'));
      }
    },
    highlightToggles: function () { // 全ての行(ヘッダ除く)のハイライトをトグル
      var that = this;
      this.$children.each(function () {
        that.highlightToggle(this);
      });
    },
    parentIntegrity: function (child) { // 親チェックボックスの整合性をとる
      var $child = $(child);
      if (!$child.prop('checked')) {
        this.$parent.prop('checked', false);
        return;
      }
      var that = this;
      this.$parent.prop('checked', true);
      // 子チェックボックスが全てチェックされているか走査し、一つでもチェックが無ければ親チェックボックスのチェックを外す
      this.$children.each(function () {
        if (!$(this).prop('checked')) {
          that.$parent.prop('checked', false);
        }
      });
    }
  };

  // jQueryのプラグインとして定義
  $.fn.spDatagrid = function (options) {
    // true or falseの指定による機能の有効、無効の切り替えも可能とする
    var ops = typeof options === 'object' ? options : {};
    ops.enabled = typeof options === 'boolean' ? options : true;

    this.each(function () { // 指定したオプションで複数のデータグリッドに対して処理
      new Datagrid(this, ops);
      return this;
    });
  };

  // オプションのデフォルト値
  $.fn.spDatagrid.defaults = {
    highlight: true // 選択された行をハイライトするかどうか
  };

  // data-api
  $(function () {
    var $el = $('.sp-datagrid[data-sp-toggle=sp-datagrid]');
    if ($el.length) {
      $el.each(function () { // データ属性に指定したオプションで個別にプラグイン実行
        var data = $(this).data();
        var ops = {};

        if (typeof data.spToggleHighlight === 'boolean') { // データ属性からオプション値を取得
          ops.highlight = data.spToggleHighlight;
        }
        $(this).spDatagrid(ops);
      });
    }
  });
}(window, jQuery));


// Panel
;(function (global, $) {
  'use strict';

  var Panel = function (el, options) {
    this.initialize.apply(this, arguments);
  };

  Panel.prototype = {
    initialize: function (el, options) {
      this.options = $.extend({}, $.fn.spPanel.defaults, options);
      var $el = this.$el = $(el);
      var $header = this.$header = $el.find('.panel-heading');
      var $body = this.$body = this.$header.nextAll();

      // headerにtabindexを指定し、フォーカス可能にする
      $header.attr('tabindex', 0);

      // 複数回呼ばれた時のメモリリークや意図しない挙動の回避のため、イベントリスナをクリア
      $header.off('click.sp.panel');
      $header.off('mousedown.sp.panel');
      $header.off('keydown.sp.panel');
      $header.off('blur.sp.panel');

      if (!options.enabled || !$body.length) { // 機能を無効化
        if (this.isCollapse()) { // タイトルボックスが閉じていれば開く
          this.toggle();
        }
        $header.attr('tabindex', ''); // tabindexを解除
        return;
      }

      var that = this;
      $header.on('click.sp.panel', function () {
        that.toggle(); // タイトルボックスをトグル
      });

      $header.on('mousedown.sp.panel', function (e) {
        $(this).css('outline', 0); // クリック時にフォーカスのborderを表示させないための対応
      });

      $header.on('keydown.sp.panel', function (e) {
        if (e.keyCode === 13) { // Enterキー押下時にタイトルボックスをトグル
          $(this).click();
        }
      });

      $header.on('blur.sp.panel', function (e) {
        $(this).css('outline', ''); // フォーカスアウトでフォーカスのborderをデフォルトに戻す
      });
    },
    isCollapse: function () {
      return this.$el.hasClass('collapsed');
    },
    toggle: function () { // タイトルボックスのbodyをトグル
      var that = this;
      if (that.isCollapse()) {
        that.$header
          .find('.fa-caret-right')
          .removeClass('fa-caret-right')
          .addClass('fa-caret-down', this.options.speed);
      } else {
        that.$header
          .find('.fa-caret-down')
          .removeClass('fa-caret-down')
          .addClass('fa-caret-right', this.options.speed);
      }
      this.$body.slideToggle(this.options.speed).promise().done(function () {
        that.$el.toggleClass('collapsed');
      });
    }
  };

  // jQueryのプラグインとして定義
  $.fn.spPanel = function (options) {
    // true or falseの指定による機能の有効、無効の切り替えも可能とする
    var ops = typeof options === 'object' ? options : {};
    ops.enabled = typeof options === 'boolean' ? options : true;

    this.each(function () { // 指定したオプションで複数のタイトルボックスに対して処理
      new Panel(this, ops); // Panelクラスのインスタンスを生成して初期化処理を実行
      return this;
    });
  };

  // オプションのデフォルト値
  $.fn.spPanel.defaults = {
    speed: 'fast' // トグルのスピード
  };

  // data-api
  $(function () {
    var $el = $('.panel[data-sp-toggle=panel]');
    if ($el.length) {
      $el.each(function () { // データ属性に指定したオプションで個別にプラグイン実行
        var data = $(this).data();
        var ops = {};

        if (typeof data.spToggleSpeed === 'string') { // データ属性からオプション値を取得
          ops.speed = data.spToggleSpeed;
        }
        $(this).spPanel(ops);
      });
    }
  });
}(window, jQuery));
