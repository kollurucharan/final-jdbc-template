<%@ page language="java" import="springii.*,java.util.*"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>



<html>
<head>
<meta charset="UTF-8">

<title>master card</title>
<h1 style="text-align: center;">master card</h1>

<div id="d">

	<label for="m">mode</label> <input type="text" id="m">
</div>
<style>
#d2, #d3, #d4, #d5, #d7, #d8, #d9, #d {
	display: flex;
	justify-content: center;
	align-items: flex-end;
	height: 5vh;
}
</style>

</head>
<body>
	<div id="d1">
		<div id="d2">
			<lable for="l1">emp id</lable>
			<input type="text" id="t1">

		</div>
		<div id="d3">
			<lable for="l2">emp name</lable>
			<input type="text" id="t2">
		</div>
		<div id="d4">
			<lable for="l3">job</lable>
			<input type="text" id="t3">
		</div>
		<div id="d5">
			<lable for="l4">salary</lable>
			<input type="text" id="t4">
		</div>

		<br> <br> <br> <br>
		<div id="d7">
			<input type="button" value="first" id="b1" onclick="first()">
			<input type="button" value="prev" id="b2" onclick="prev()"> <input
				type="button" value="next" id="b3" onclick="next()"> <input
				type="button" value="last" id="b4" onclick="last()">
		</div>
		<div id="d8">
			<input type="button" value="del" id="b5" onclick="del()"> <input
				type="button" value="edit" id="b6" onclick="edit()"> <input
				type="button" value="add" id="b7" onclick="add()"> <input
				type="button" value="save" id="b8" onclick="save()">
		</div>
		<div id="d9">
			<input type="button" value="search" id="b9" onclick="search()">
			<input type="button" value="exit" id="b10" onclick="exit()">
			<input type="button" value="clear" id="b11">
		</div>


		<script>
			var current = 1;
			var length;
			var t1 = document.getElementById('t1');
			var t2 = document.getElementById('t2');
			var t3 = document.getElementById('t3');
			var t4 = document.getElementById('t4');
			var m = document.getElementById('m');

			function first() {
				m.value = "read1";
				var x = new XMLHttpRequest();
				var a = "first";
				current = 0;
				var baseUrl = "first";
				x.open("GET", baseUrl, true);
				x.onreadystatechange = function() {
					if (x.readyState == 4 && x.status == 200) {
						var jsonData = JSON.parse(x.responseText);
						console.log(jsonData);
						
						t1.value=jsonData.id;
						t2.value=jsonData.name;
						t3.value=jsonData.department;
						t4.value=jsonData.salary;
						

					}
				};

				x.send();
			}
		</script>
</html>
