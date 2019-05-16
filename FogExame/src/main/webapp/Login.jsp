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
        <link href ="styling.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        
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
        <div class ="grid-container">
        <form name="login" action="FrontController" method="GET">
            <table class ="first">
                <td>
                    <h1>Log in here to create a order</h1>
                    <input type="hidden" name="command" value="login">
                <p1>Email:<br></p1>
                <input type="text" name="email" value="emil@hotmail.com">
                <br>
                <p1>Password:<br></p1>
                <input type="password" name="password" value="1234">
                <br><br>
                <button type="submit" value="Login">Login</button>
                </td>
            </table>
        </form>
        </div>
    </body>
</html>
