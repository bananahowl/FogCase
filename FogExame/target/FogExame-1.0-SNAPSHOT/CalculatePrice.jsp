<%-- 
    Document   : CalculatePrice
    Created on : 07-05-2019, 09:44:33
    Author     : frizz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    int width = Integer.parseInt(request.getParameter("width"));
    String length = request.getParameter("length");

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>This is your order + svg</h1>
        <%= request.getAttribute("carport")%>
        <h1>This is your order + <%= width + length %> </h1>
        
    </body>
</html>
