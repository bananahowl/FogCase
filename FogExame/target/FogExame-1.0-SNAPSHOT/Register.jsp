<%-- 
    Document   : Register
    Created on : 08-05-2019, 12:00:22
    Author     : fskn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
        <link href ="styling.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="header">
            <h1>Fog</h1>
        </div>

        <div class="row">
            <div class="col-3 col-s-3 menu">
                <ul>
                    <li><a href="index.jsp">Home</a></li>
                    <li><a href="Profile.jsp">Profile</a></li>
                    <li><a href="FlatAngle.jsp">Customize</a></li>
                    <li style="float:right"><a class="active" href="#about">BRUG TIL LOG IN/LOG UD</a></li>
                </ul>
            </div>
        </div>
        <table>
            <td>
                <div class ="grid-container">
                    <div class ='center'>
                        <form name="register" action="Frontcontroller" method="POST">
                            <input type="hidden" name="command" value="register">
                            <h1>Please register to order a carport</h1>
                            <p1>Firstname:<br></p1>
                            <input type="text" name="email" value="">
                            <br>
                            <p1>Lastname:<br></p1>
                            <input type="text" name="email" value="">
                            <br>
                            <p1>Address:<br></p1>
                            <input type="text" name="email" value="">
                            <br>
                            <p1>City:<br></p1>
                            <input type="text" name="email" value="">
                            <br>
                            <p1>Phone:<br></p1>
                            <input type="text" name="email" value="8 numbers">
                            <br>
                            <p1>Email:<br></p1>
                            <input type="text" name="email" value="">
                            <br>
                            <p1>Password:<br></p1>
                            <input type="password" name="password1" value="">
                            <br>
                            <p1>Retype Password:<br></p1>
                            <input type="password" name="password2" value="">
                            <br>
                            <input type="submit" value="Register">
                        </form>
                    </div>
                </div>
            </td>
        </tr>
    </table>
    <div class="footer">THIS IS A FOOTER </div>
</body>
</html>
