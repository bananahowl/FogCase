<%-- 
    Document   : CarportFlatRoof
    Created on : 26-04-2019, 20:28:13
    Author     : fskn
--%>

<%@page import="Logic.Facade.CarportFacade"%>
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
            <div class ='center'>
                <p1><b>Design your own carport - with your measurements</b></p1><br><br>
                <form action="FrontController" method="GET">
            <table>
                <thead><tr><th>Carport length</th><th>Carport width</th><th>Shed length</th><th>Shed width</th><th>Roof angle</th></tr></thead>
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
                                        <% for (int i = 1; i < cf.getMaxAngles()+ 1; i++) {%>
                                        <option value=<%=i%>><%= cf.getRoofAngle(i)%></option><% }%></td>
                                <td><button type="submit" name="command" value="calculate">Calculate </button></td>
                                <td><span id="errorContainer"></span></td>
                    </tr>
            </table>
        </form>
            </div>
            <div class="footer">Adresse: Firskovvej 20, 2800 Kongens Lyngby        tlf: 45 87 10 01</div>
        </div>
        
            </body>
            </html>
