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
            <img src="https://media.licdn.com/dms/image/C4E0BAQGleVi1XAFxBg/company-logo_200_200/0?e=2159024400&v=beta&t=qQ2ebmGf9u4b45tNF9OyVrcy7NGpnwLXZkLrOky6ibM" alt="Fog" width="200" height="200">
        </div>

        <div class="row">
            <div class="col-3 col-s-3 menu">
                <ul>
                    <li><a href="index.jsp">Home</a></li>
                    <li style="float:right"><a class="active" href="Register.jsp">Register</a></li>
                    <li><a href="CustomizeCarport.jsp">Customize</a></li>
                    <li style="float:right"><a class="active" href="#about">Log in</a></li>
                </ul>
            </div>
        </div>

        <div class ="grid-container">
                <form action="FrontController" method="GET">
                    <table>
                        <td>
                            <h1>Please register to order a carport</h1>
                        <p1>Firstname:<br></p1>
                        <input type="text" name="firstname" value="Frederikke">
                        <br>
                        <p1>Lastname:<br></p1>
                        <input type="text" name="lastname" value="Nilsson">
                        <br>
                        <p1>Adress:<br></p1>
                        <input type="text" name="adress" value="Mosen 1">
                        <br>
                        <p1>City:<br></p1>
                        <input type="text" name="city" value="Greve">
                        <br>
                        <p1>Phone:<br></p1>
                        <input type="text" name="phonenumber" value="12345678">
                        <br>
                        <p1>Email:<br></p1>
                        <input type="text" name="email" value="frede@hotmail.com">
                        <br>
                        <p1>Password:<br></p1>
                        <input type="password" name="password1" value="1234">
                        <br>
                        <p1>Retype Password:<br></p1>
                        <input type="password" name="password2" value="1234">
                        <br><br>
                        <button type="submit"  name="command" value="register">Register</button>
                        </tr>
                    </table>
                </form>
        </div>
    </td>

    <div class="footer">THIS IS A FOOTER </div>
</body>
</html>
