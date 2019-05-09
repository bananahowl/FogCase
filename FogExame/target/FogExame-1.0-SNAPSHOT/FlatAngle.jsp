<%-- 
    Document   : FlatAngle
    Created on : 26-04-2019, 19:57:15
    Author     : fskn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Flat or angle </title>
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
        <div class ="grid-container">
            <div class ='main'>
                <p1><b>Customize your own carport here!</b></p1><br><br><br>
                <form action="FrontController" method="GET">
                    <button type="submit"  name="command" value="carportflatroof" >FlatRoof</button>
                    <form action="FrontController" method="GET">
                        <button type="submit"  name="command" value="carportwithangle" >WithAngle</button>
                        <!--<a type="button" href ="CarportFlatRoof.jsp"> Carport with flat roof </a>-->
                        <!--<a type="button" href ="CarportWithAngle.jsp"> Carport with angle </a>-->

                        </div>
                        </div>
                        <div class="footer">THIS IS A FOOTER </div>
                        </body>
                        </html>
