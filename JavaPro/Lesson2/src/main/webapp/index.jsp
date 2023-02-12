<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello Customers!" %>
</h1>
<br/>
<a href="/getCustomers">Get customers unsorted</a>
<br/>
<a href="/getCustomers?sortingMethod=name">Get customers sorted by name</a>
<br/>
<a href="/getCustomers?sortingMethod=name&sortingMethod=gender">Get customers sorted by surname and gender</a>
<br/>
</body>
</html>