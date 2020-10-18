<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url var="resources" value="/resources" scope="request" />
<html>
    <head>
        <link rel="stylesheet" href="${resources}/styles/index.css">
    </head>
    <body>
        <h1>Message: ${message}</h1>
        <p>${resources}</p>
    </body>
</html>
