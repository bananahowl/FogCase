<%-- 
    Document   : Login
    Created on : 10-05-2019, 11:34:17
    Author     : emils
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>                   
        <form name="login" action="FrontController" method="GET">
            <input type="hidden" name="command" value="login">
            Email:<br>
            <input type="text" name="email" value="emil@gmail.com">
            <br>
            Password:<br>
            <input type="password" name="password" value="1234">
            <br>
            <input type="submit" value="Login">
        </form>
    </body>
</html>
