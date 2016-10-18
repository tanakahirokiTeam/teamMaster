	function makeEnquete(id) {
			id = "form" + id;
			var target = document.getElementById(id);
			target.submit();
		}
	function methodStart(name) {
		myRet = confirm("公開してよろしいですか");
		if (myRet == true) {
			//alert(name);
			name = "start" + name;
			var target = document.getElementById(name);
			target.submit();
		} else {
			alert("キャンセルしました");
		}
	}
	function methodFinish(name) {
		myRet = confirm("公開終了してよろしいですか");
		if (myRet == true) {
			name = "finish" + name;
			var target = document.getElementById(name);
			target.submit();
		} else {
			alert("キャンセルしました");
		}
	}
	function methodDelete(name) {
		myRet = confirm("削除してよろしいですか");
		if (myRet == true) {
			name = "delete" + name;
			var target = document.getElementById(name);
			target.submit();
		} else {
			alert("キャンセルしました");
		}
	}
	function methodAnswer(name) {
			name = "answer" + name;
			var target = document.getElementById(name);
			target.submit();
	}
	function methodAnswerConfirm(name) {
		name = "answerConfirm" + name;
		var target = document.getElementById(name);
		target.submit();
	}
	function methodResult(name) {
		name = "result" + name;
		var target = document.getElementById(name);
		target.submit();
	}
	function selectedTab1() {
		var tab1 = document.getElementById("tab1");
		var tab2 = document.getElementById("tab2");
		var tab3 = document.getElementById("tab3");
		tab2.removeAttribute("class");
		tab3.removeAttribute("class");
		tab1.setAttribute("class", "active");
		var innerTab1 = document.getElementById("innerTab1");
		var innerTab2 = document.getElementById("innerTab2");
		var innerTab3 = document.getElementById("innerTab3");
		innerTab1.removeAttribute("class");
		innerTab2.removeAttribute("class");
		innerTab3.removeAttribute("class");
		innerTab1.setAttribute("class", "selectedTag");
		innerTab2.setAttribute("class", "nonSelectedTag");
		innerTab3.setAttribute("class", "nonSelectedTag");

	}
	function selectedTab2() {
		var tab1 = document.getElementById("tab1");
		var tab2 = document.getElementById("tab2");
		var tab3 = document.getElementById("tab3");
		tab1.removeAttribute("class");
		tab3.removeAttribute("class");
		tab2.setAttribute("class", "active");
		var innerTab1 = document.getElementById("innerTab1");
		var innerTab2 = document.getElementById("innerTab2");
		var innerTab3 = document.getElementById("innerTab3");
		innerTab1.removeAttribute("class");
		innerTab2.removeAttribute("class");
		innerTab3.removeAttribute("class");
		innerTab2.setAttribute("class", "selectedTag");
		innerTab1.setAttribute("class", "nonSelectedTag");
		innerTab3.setAttribute("class", "nonSelectedTag");
	}
	function selectedTab3() {
		var tab1 = document.getElementById("tab1");
		var tab2 = document.getElementById("tab2");
		var tab3 = document.getElementById("tab3");
		tab1.removeAttribute("class");
		tab2.removeAttribute("class");
		tab3.setAttribute("class", "active");
		var innerTab1 = document.getElementById("innerTab1");
		var innerTab2 = document.getElementById("innerTab2");
		var innerTab3 = document.getElementById("innerTab3");
		innerTab1.removeAttribute("class");
		innerTab2.removeAttribute("class");
		innerTab3.removeAttribute("class");
		innerTab3.setAttribute("class", "selectedTag");
		innerTab1.setAttribute("class", "nonSelectedTag");
		innerTab2.setAttribute("class", "nonSelectedTag");
	}
	function selectedTab4() {
		var tab4 = document.getElementById("tab4");
		var tab5 = document.getElementById("tab5");
		tab5.removeAttribute("class");
		tab4.setAttribute("class", "active");
		var innerTab4 = document.getElementById("innerTab4");
		var innerTab5 = document.getElementById("innerTab5");
		innerTab4.removeAttribute("class");
		innerTab5.removeAttribute("class");
		innerTab4.setAttribute("class", "activeTab");
		innerTab5.setAttribute("class", "non-activeTab");
	}
	function selectedTab5() {
		var tab4 = document.getElementById("tab4");
		var tab5 = document.getElementById("tab5");
		tab4.removeAttribute("class");
		tab5.setAttribute("class", "active");
		var innerTab4 = document.getElementById("innerTab4");
		var innerTab5 = document.getElementById("innerTab5");
		innerTab4.removeAttribute("class");
		innerTab5.removeAttribute("class");
		innerTab5.setAttribute("class", "activeTab");
		innerTab4.setAttribute("class", "non-activeTab");
	}
	function selectedTab6() {
		var tab6 = document.getElementById("tab6");
		var tab7 = document.getElementById("tab7");
		var tab8 = document.getElementById("tab8");
		tab7.removeAttribute("class");
		tab8.removeAttribute("class");
		tab6.setAttribute("class", "active");
		var innerTab6 = document.getElementById("innerTab6");
		var innerTab7 = document.getElementById("innerTab7");
		var innerTab8 = document.getElementById("innerTab8");
		innerTab6.removeAttribute("class");
		innerTab7.removeAttribute("class");
		innerTab8.removeAttribute("class");
		innerTab6.setAttribute("class", "selectedTag");
		innerTab7.setAttribute("class", "nonSelectedTag");
		innerTab8.setAttribute("class", "nonSelectedTag");

	}
	function selectedTab7() {
		var tab6 = document.getElementById("tab6");
		var tab7 = document.getElementById("tab7");
		var tab8 = document.getElementById("tab8");
		tab6.removeAttribute("class");
		tab8.removeAttribute("class");
		tab7.setAttribute("class", "active");
		var innerTab6 = document.getElementById("innerTab6");
		var innerTab7 = document.getElementById("innerTab7");
		var innerTab8 = document.getElementById("innerTab8");
		innerTab6.removeAttribute("class");
		innerTab7.removeAttribute("class");
		innerTab8.removeAttribute("class");
		innerTab7.setAttribute("class", "selectedTag");
		innerTab6.setAttribute("class", "nonSelectedTag");
		innerTab8.setAttribute("class", "nonSelectedTag");
	}
	function selectedTab8() {
		var tab6 = document.getElementById("tab6");
		var tab7 = document.getElementById("tab7");
		var tab8 = document.getElementById("tab8");
		tab6.removeAttribute("class");
		tab7.removeAttribute("class");
		tab8.setAttribute("class", "active");
		var innerTab6 = document.getElementById("innerTab6");
		var innerTab7 = document.getElementById("innerTab7");
		var innerTab8 = document.getElementById("innerTab8");
		innerTab6.removeAttribute("class");
		innerTab7.removeAttribute("class");
		innerTab8.removeAttribute("class");
		innerTab8.setAttribute("class", "selectedTag");
		innerTab6.setAttribute("class", "nonSelectedTag");
		innerTab7.setAttribute("class", "nonSelectedTag");
	}