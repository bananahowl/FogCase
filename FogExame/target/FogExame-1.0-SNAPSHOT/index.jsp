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
        <title>Front page</title>
        <link href ="styling.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    </head>
    <body>
        <div class="header">
            <img src="https://hr-skyen.dk/hr/image.php?companyid=226&id=5973" alt="Fog" width="500" heigth ="100">
        </div>

        <div class="topnav">
            <a href="index.jsp">Home</a>
        </div>

        <div class="row">
            <div class="column side">
                <h1></h1>
            </div>
            <div class="column middle">
                <div class="card">
                    <h2><b>Protect your car with a carport</b></h2>
                    <h5>Tekst</h5>

                    <form action="FrontController" method="GET">
                    <button type="submit" class="btn btn-secondary btn-lg btn-block" name="command" value="customize">Customize Carport</button>
                        
                    </form>

                </div>
                <div class="card">
                    <h2><b>About us </b></h2>
                    <h5>Tekst</h5>
                </div>
            </div>
            <div class="column side">
                <div class="card">
                    <form name="login" action="FrontController" method="GET">
                        <table>
                            <h5><b>Sign in</b></h5>
                            <td>
                                <input type="hidden" name="command" value="login">
                                <div class="form-group"
                                     <p>Email:<br></p>
                                    <input type="text" name="email" value="emil@hotmail.com">
                                </div>
                                <div class="form-group"
                                     <p>Password:</p>
                                    <input type="password" name="password" value="1234">
                                </div>
                                <button type="submit" class="btn btn-outline-dark" value="Login">Sign in</button>
                            </td>
                        </table>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="Register.jsp">New around here? Register here</a>

                    </form>
                </div>
                <div class="card">

                </div>
            </div>
        </div>
        <div class ="footer">
            <div class="row">
                <div class="column side">
                    <div class="card">
                        <h2>TEST TEST</h2>
                        </div>
                    </div>
                    <div class="column middle">
                        <div class="card">
                            <h2>TEST TEST</h2>
                        </div>
                    </div>
                    <div class="column side">
                        <div class="card">
                            <h2>TEST TEST</h2>
                        </div>
                    </div>
                </div>
            </div>

    </body>
</html>
