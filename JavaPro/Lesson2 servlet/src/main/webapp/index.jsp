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
<a href="/getCustomers?sortBy=getName">Get customers sorted by name</a>
<br/>
<a href="/getCustomers?sortBy=getName&sortBy=getAge">Get customers sorted by name and age</a>
<br/>
<a href="/getCustomers?sortBy=getGender&sortBy=getId">Get customers sorted by gender and id</a>
<br/>
</body>
</html>