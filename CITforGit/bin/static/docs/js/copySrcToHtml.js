var htmlEscape = function (str) {
  str = str.replace(/&/g, '&amp;');
  str = str.replace(/>/g, '&gt;');
  str = str.replace(/</g, '&lt;');
  str = str.replace(/©/g, '&amp;copy;');
  return str;
};

var editor = [];
$(".copy-distination").hide();

$(function () {

  $("#pagetop").on("click", ".showHtml",
    function () {
      var selectedIndex = $("#pagetop").find($(".showHtml")).index(this);
      $(".copy-source").eq(selectedIndex).hide();
      $(".copy-distination").eq(selectedIndex).show();
      var htmlExample = $(".copy-source").eq(selectedIndex).html();
      var indentSpaces = htmlExample.match(/^ +/m);
      var re = new RegExp("^" + indentSpaces, "gm");
      htmlExample = htmlExample.replace(re, "");
      htmlExample = htmlExample.replace(/\n +$/g, '');
      $(".copy-distination").eq(selectedIndex).html('<textarea id="' + $(".copy-source").eq(selectedIndex).attr('id') + '-text' + '">' + htmlEscape(htmlExample) + '</textarea>');
      editor[selectedIndex] = CodeMirror.fromTextArea(document.getElementById($(".copy-source").eq(selectedIndex).attr('id') + "-text"), {mode: "htmlmixed", tabMode: "indent", readOnly: "true", lineNumbers: true });
    }
  );

  $("#pagetop").on("click", ".showExample",
    function () {
      var selectedIndex = $("#pagetop").find($(".showExample")).index(this);
      $(".copy-source").eq(selectedIndex).show();
      $(".copy-distination").eq(selectedIndex).hide();
    }
  );

  $("#pagetop").on("dblclick", ".copy-distination",
    function () {
      var selectedIndex =  $("#pagetop").find($(".copy-distination")).index(this);
      editor[selectedIndex].setSelection({line: -1}, {line: editor[selectedIndex].lastLine()});
    }
  );
});
