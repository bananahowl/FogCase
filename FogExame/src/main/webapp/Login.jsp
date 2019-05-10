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
        
        <div class="header">
            <img src="https://media.licdn.com/dms/image/C4E0BAQGleVi1XAFxBg/company-logo_200_200/0?e=2159024400&v=beta&t=qQ2ebmGf9u4b45tNF9OyVrcy7NGpnwLXZkLrOky6ibM" alt="Fog" width="200" height="200">
        </div>

        <div class="row">
            <div class="col-3 col-s-3 menu">
                <ul>
                    <li><a href="index.jsp">Home</a></li>
                    <li style="float:right"><a class="active" href="Register.jsp">Register</a></li>
                    <li><a href="CustomizeCarport.jsp">Customize</a></li>
                    <li style="float:right"><a class="active" href="Login.jsp">Log in</a></li>
                </ul>
            </div>
        </div>

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
