<%--
  Created by IntelliJ IDEA.
  User: Michael
  Date: 2020/8/22
  Time: 12:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FileUpload</title>
</head>
<body>
<form action="upload.do" method="post" enctype="multipart/form-data">
    file:<input type="file" name="file"/> <br/>
    <input type="submit" value="upload" />
</form>
</body>
</html>
