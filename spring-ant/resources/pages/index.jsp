<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url var="resources" value="/resources" scope="request" />

<html>
<head>
<link href="${resources}/css/main.css" rel="stylesheet">
</head>
<body>
    <h1>Ant + Spring MVC Web Project Example</h1>

    <p>Message : ${message}</p>
</body>
</html>