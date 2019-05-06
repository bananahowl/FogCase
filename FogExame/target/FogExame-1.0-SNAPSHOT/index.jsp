<%-- 
    Document   : index
    Created on : 02-05-2019, 14:08:38
    Author     : emils
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
               <link href ="styling.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <% // response.sendRedirect("FlatAngle.jsp"); %>
        <br><br><a type="button" href ="FlatAngle.jsp"> Next </a>
         <table>
            <tr><td>Login</td>
                <td>
                    <form name="login" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="login">
                        Email:<br>
                        <input type="text" name="email" value="fog@carportmail.com">
                        <br>
                        Password:<br>
                        <input type="password" name="password" value="1234">
                        <br>
                        <input type="submit" value="Login">
                    </form>
                </td>
                <td>Or Register</td>
                <td>
                    <form name="register" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="register">
                        Email:<br>
                        <input type="text" name="email" value="someone@nowhere.com">
                        <br>
                        Password:<br>
                        <input type="password" name="password1" value="sesam">
                        <br>
                        Retype Password:<br>
                        <input type="password" name="password2" value="sesam">
                        <br>
                        <input type="submit" value="Register">
                    </form>
                </td>
            </tr>
        </table>
         <% String error = (String) request.getAttribute( "error");
           if ( error != null) { 
               out.println("<H2>Error!!</h2>");
               out.println(error);
           }
        %>
<!--        <button onclick="window.location.href = '/FogExame/FrontController/FlatAngle';">Works</button>-->

    </body>
</html>
