<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>showMacro</title>
</head>
<body>
	<h1> showMacro </h1>
	 
	macro01 : ${myMacro.macro01}<br />
	macro02 : ${myMacro.macro02}<br />
	macro03 : ${myMacro.macro03}<br />
	macro04 : ${myMacro.macro04}<br />
	macro05 : ${myMacro.macro05}<br />
	
	
	<a href="/lec19/resources/html/test.html"> Go setMacro </a>
</body>
</html>