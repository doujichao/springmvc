<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page session="false" %>
<html>
    <head>
        <title>Spittr</title>
        <link rel="stylesheet" type="text/css"
            href="<s:url value='/resource/style.css'>">
    </head>
    <body>
    <%--插入头部--%>
        <div id="header">
            <t:insertAttribute name="header"/>
        </div>
    <%--插入主题内容--%>
        <div id="content">
        <t:insertAttribute name="content"/>
        </div>
    <%--插入底部--%>
        <div id="footer">
        <t:insertAttribute name="footer"/>
        </div>
    </body>
</html>