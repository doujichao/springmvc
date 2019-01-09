<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>register</title>
</head>
<body>
    <h1>Register</h1>
     <sf:form  method="post" commandName="spitter">
         First Name:<sf:input path="firstName"/><br>
         Last Name:<sf:input path="lastName"/><br>
         Username:<sf:input path="email" type="email"/><br>
         Username:<sf:input path="username"/><br>
         Password:<sf:password path="password"/><br>
         <input type="submit" value="Register">
     </sf:form>
</body>
</html>
