<%-- 
    Document   : CarportFlatRoof
    Created on : 26-04-2019, 20:28:13
    Author     : fskn
--%>

<%@page import="Logic.CarportFacade"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carport flat roof</title>
        <link href ="styling.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%CarportFacade cf = new CarportFacade(); %>

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
                <p1><b>Carport efter egne mål</b></p1><br><br>

                <p1>The chosen carport has flat roof.</p1><br>
                <p1>Vi gør vores kunder opmærksomhed på, at alle vores carporte leveres, som et byg-selv-sæt, usamlet og ubehandlet</p1><br><br>
                <hr>
                <br><p1><b>Choose the measurements for your carport</b></p1><br>
                <form name ="Shed" action="FrontController" method="hidden">
                    <input type="hidden" name="command" value="Shed">
                    <table class="table table-striped">
                        <thead><tr><th>Height</th><th>Length</th><th>Width</th><th></th></tr></thead>
                        <tbody><tr>


                            <tr><table>
                            <td>Height:</td><br>
                            <td>220 cm</td>
                        </table>

                        <table>
                            <td>Length:</td><br>
                            <td><select name=length id="option">                        
                                    <% for (int i = 1; i < cf.getMaxLength() + 1; i++) {%>
                                    <option value=<%=i%>><%=cf.getCarportLength(i)%></option><% }%>
                            </td> 

                        </table>

                        <table>
                            <td>Width:</td><br>
                            <td><select name=width id="option">
                                    <% for (int i = 1; i < cf.getMaxWidth() + 1; i++) {%>
                                    <option value=<%=i%>><%= cf.getCarportWidth(i)%></option><% }%></td>
                        </table>
                        </tr>

                        <hr>
                        <br><p1><b>Choose the measurements for your shed:</b></p1><br><br>

                        <tr>
                        <table>
                            <td>Height:</td><br>
                            <td>220 cm</td>
                        </table>

                        <table>
                            <td>Length:</td><br>
                            <td><select name=length id="option">
                                    <% for (int i = 1; i < cf.getMaxShedLength() + 1; i++) {%>
                                    <option value=<%=i%>><%= cf.getShedlength(i)%></option><% }%></td>                          
                        </table>

                        <table>
                            <td>Width:</td><br>
                            <td><select name=width id="option">
                                    <% for (int i = 1; i < cf.getMaxShedWidth() + 1; i++) {%>
                                    <option value=<%=i%>><%= cf.getShedwidth(i)%></option><% }%></td>
                        </table>
                        </tr>
                </form>
                <div class ="right">
                    <br><br><a type="button" href ="FlatAngle.jsp"> Back </a>
                    <a type="submit" float ="right" >Add to shoppingcart</a>
                </div>
            </div>
            <div class="footer">THIS IS A FOOTER </div>
        </div>
        <form id="Shed" action="FrontController" method="GET">
            <input type="hidden" name="command" value="Shed">
            <table class="table table-striped">
                <thead><tr><th>CPLength</th><th>CPWidth</th><th>ShedLength</th><th>ShedWitdth</th><th></th></tr></thead>
                <tbody>


                    <tr>  <td> <select name=length id="option">                        
                                <% for (int i = 1; i < cf.getMaxLength() + 1; i++) {%>
                                <option value=<%=i%>><%=cf.getCarportLength(i)%></option><% }%>

                                <td> <select name=width id="option">
                                        <% for (int i = 1; i < cf.getMaxWidth() + 1; i++) {%>
                                        <option value=<%=i%>><%= cf.getCarportWidth(i)%></option><% }%></td> 

                                <td><select name=lengthShed id="option">
                                        <% for (int i = 1; i < cf.getMaxShedLength() + 1; i++) {%>
                                        <option value=<%=i%>><%= cf.getShedlength(i)%></option><% }%></td>
                                <td><select name=widthShed id="option">
                                        <% for (int i = 1; i < cf.getMaxShedWidth() + 1; i++) {%>
                                        <option value=<%=i%>><%= cf.getShedwidth(i)%></option><% }%></td>
                                <td><select name=angle id="option">
                                        <% for (int i = 1; i < cf.getMaxShedWidth() + 1; i++) {%>
                                        <option value=<%=i%>><%= cf.getShedwidth(i)%></option><% }%></td>
                                <td><input type="submit" value="Shed"></td>
                                <td><span id="errorContainer"></span></td>
                    </tr>
            </table>
        </form>
        <form name ="Shed" action="FrontController" method="hidden">
            <input type="hidden" name="command" value="Shed">
            </body>
            </html>
