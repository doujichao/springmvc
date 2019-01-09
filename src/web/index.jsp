<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>firstjsp</title>
</head>
<body>
欢迎来到idea



<table border="1">
    <tr>
        <td>1</td>
        <td>2</td>
        <td rowspan="3">3</td>
    </tr>
    <tr>
        <td>1</td>
        <td>2</td>
    </tr>
    <tr>
        <td>1</td>
        <td>2</td>
    </tr>

</table>
<form>
    <input type="text" value="4" id="text">
    <input type="button" onclick="chick()" value="test"/>
</form>

<select id="select">
    <option value="1">男</option>
    <option value="2">女</option>
</select>

</body>
<script type="text/javascript">
    function chick() {
        var select=document.getElementById("select");
        var value=select.value;
        alert(value);
    }
</script>
</html>
