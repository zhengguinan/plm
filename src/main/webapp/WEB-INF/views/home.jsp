<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<meta content="text/html; charset=utf-8" http-equiv="content-type" />
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>
	<h1>接口规范</h1>
	接口包括给

	<a href="##" onclick="switchLang('zh')">中文2</a>
	<a href="##" onclick="switchLang('en')">英文</a>

	<h1>接口规范</h1>
	接口包括给
	<script type="text/javascript">
		function switchLang(lang) {

		}
	</script>
	<script src="resources/lib/jquery.min.1.4.2.js"></script>
	<script src="resources/lib/jquery.cookie.js"></script>
</body>
</html>
