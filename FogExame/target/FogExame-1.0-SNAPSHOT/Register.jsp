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
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    </head>
    <body>
        <div class="header">
            <img src="https://media.licdn.com/dms/image/C4E0BAQGleVi1XAFxBg/company-logo_200_200/0?e=2159024400&v=beta&t=qQ2ebmGf9u4b45tNF9OyVrcy7NGpnwLXZkLrOky6ibM" alt="Fog" width="200" height="200">
        </div>
        <div class="topnav">
            <a href="index.jsp">Home</a>
        </div>
        <div class="shadow-lg p-3 mb-5 bg-white rounded">
        <div class="leftcolumn">
            <div class="card">
                <form action="FrontController" method="GET">
                    <table class="first">
                        <td>
                             
                                <h1><b>Register here</b></h1><br>

                                <label for="3" class="col-sm-2 col-form-label">Firstname</label>
                                <input type="text" name="firstname" value="Frederikke" id="1">
                                <br>
                                <label for="2" class="col-sm-2 col-form-label">Lastname</label>
                                <input type="text" name="lastname" value="Nilsson" id="2">
                                <br>
                                <label for="3" class="col-sm-2 col-form-label">Adress</label>
                                <input type="text" name="adress" value="Mosen 1" id="3">
                                <br>
                                <label for="4" class="col-sm-2 col-form-label">City</label>
                                <input type="text" name="city" value="Greve" id="4">
                                <br>
                                <label for="5" class="col-sm-2 col-form-label">Zipcode</label>
                                <input type="text" name="zipcode" value="2670" id="5">
                                <br>
                                <label for="6" class="col-sm-2 col-form-label">Phone</label>
                                <input type="text" name="phonenumber" value="12345678" id="6">
                                <br>
                                <label for="7" class="col-sm-2 col-form-label">Email</label>
                                <input type="text" name="email" value="frede@hotmail.com" id="7">
                                <br>
                                <label for="8" class="col-sm-2 col-form-label">Password</label>
                                <input type="password" name="password1" value="1234" id="8">
                                <br>
                                <label for="9" class="col-sm-2 col-form-label">Retype password</label>
                                <input type="password" name="password2" value="1234" id="9">
                                <br><br>
                                <button type="submit" class="btn btn-outline-dark" name="command" value="register">Register</button>
                            
                    </table>
                </form>
            </div>
        </div>
        
        <div class="rightcolumn">
            <img src="https://media.licdn.com/dms/image/C4E0BAQGleVi1XAFxBg/company-logo_200_200/0?e=2159024400&v=beta&t=qQ2ebmGf9u4b45tNF9OyVrcy7NGpnwLXZkLrOky6ibM" alt="Fog" width="200" height="200">
            <img src="https://media.licdn.com/dms/image/C4E0BAQGleVi1XAFxBg/company-logo_200_200/0?e=2159024400&v=beta&t=qQ2ebmGf9u4b45tNF9OyVrcy7NGpnwLXZkLrOky6ibM" alt="Fog" width="200" height="200">
        </div>
        </div>
    </body>
</html>
