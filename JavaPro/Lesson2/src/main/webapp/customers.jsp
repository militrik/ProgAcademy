<%@ page import="java.util.List" %>
<%@ page import="com.example.lesson2.Customer" %>
<%@ page import="java.util.Arrays" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<style>
    table, td {
        text-align: center;
        padding: 2px;
        border: 1px solid black;
        border-collapse: collapse;
    }
    th {
        text-align: center;
        padding: 2px;
        border: 1px solid black;
        border-collapse: collapse;
        background-color: gray;
    }
</style>
<body>

<%
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("<table>");
    stringBuilder.append("<tbody>");
    stringBuilder.append("<tr>");
    Arrays.stream(Customer.class.getDeclaredFields())
            .forEach(field -> stringBuilder.append("<th>").append(field.getName()).append("</th>"));
    stringBuilder.append("</tr>");
    for (var customer : (List<Customer>) request.getAttribute("customerList")
    ) {
        stringBuilder.append("<tr>");
        for (var field : customer.getClass().getDeclaredFields()
        ) {
            field.setAccessible(true);
            try {
                stringBuilder.append("<td>").append(field.get(customer)).append("</td>");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        stringBuilder.append("</tr>");
    }
    stringBuilder.append("</tbody>");
    stringBuilder.append("</table>");

    response.getWriter().println(stringBuilder);
%>

</body>
</html>
