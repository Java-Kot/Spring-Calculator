<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form method="post">
    <input type="number" name="num" size="30" />
    <input type="number" name="num" size="30" />
    <input type="submit" value="Addition(+)" name="choose" />
    <input type="submit" value="Subtraction(-)" name="choose" />
    <input type="submit" value="Multiplication(X)" name="choose" />
    <input type="submit" value="Division(/)" name="choose" />
</form>
<h1>${n}</h1>
</body>
</html>
