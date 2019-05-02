<%-- 
    Document   : testDesign
    Created on : 02-05-2019, 11:32:35
    Author     : fskn
--%>

<%@page import="Logic.CarportFacade"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href ="styling.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%CarportFacade cf = new CarportFacade(); %>

        <div class="header">
            <h1>FOG - OVERSKRIFT //</h1>
        </div>

        <div class="row">
            <div class="col-3 col-s-3 menu">
                <ul>
                    <li><a href="index.html">Home</a></li>
                    <li><a href="Profile.jsp">Profile</a></li>
                    <li><a href="FlatAngle">Customize</a></li>
                    <li style="float:right"><a class="active" href="#about">BRUG TIL LOG IN/LOG UD</a></li>
                </ul>
            </div>
        </div>
        <div class ="grid-container">
            <div class ='main'>
                <p1><b>Carport efter egne mål</b></p1><br><br>

                <p1>Den valgte carport har Angle tag</p1><br>
                <p1>Vi gør vores kunder opmærksomhed på, at alle vores carporte leveres, som et byg-selv-sæt, usamlet og ubehandlet</p1><br><br>
                <hr>
                <br><p1><b>Choose the measurements for your carport</b></p1><br>

                <form name ="withAngle" action="FrontController" method="POST">

                    <tr><table>
                        <td>Height:</td><br>
                        <td>220 cm</td>
                    </table>

                    <table>
                        <td>Length:</td><br>
                        <td><select name=length id="option">                        
                                <% for (int i = 1; i < cf.getMaxLength() + 1; i++) {%>
                                <option value=1><%=cf.getCarportLength(i)%></option><% }%></td>                          
                    </table>

                    <table>
                        <td>Width:</td><br>
                        <td><select name=width id="option">
                                <% for (int i = 1; i < cf.getMaxWidth() + 1; i++) {%>
                                <option value=1><%= cf.getCarportWidth(i)%></option><% }%></td>
                    </table>

                    <table>
                        <td>Angel:</td><br>
                        <td><select name=angle id="option">
                                <% for (int i = 1; i < cf.getMaxAngles() + 1; i++) {%>
                                <option value=2><%= cf.getRoofAngle(i)%></option><% }%></td>  
                    </table>

                    <table>
                        <td>Roof Material:</td><br>
                        <td><select name=rmaterials id="option">
                                <% for (int i = 1; i < cf.getMaxRoofMaterial() + 1; i++) {
                                %> <option value=2><%= cf.getRoofMaterial(i)%></option><% }%></td> 
                    </table>
                    </tr>
                </form>
                    <hr>
                    <br><p1><b>Choose the measurements for your shed:</b></p1><br><br>
                <form name ="shed" action="FrontController" method="POST">
                    <tr>
                    <table>
                        <td>Height:</td><br>
                        <td>220 cm</td>
                    </table>

                    <table>
                        <td>Length:</td><br>
                        <td><select name=length id="option">
                                <% for (int i = 1; i < cf.getMaxShedLength() + 1; i++) {%>
                                <option value=1><%= cf.getShedlength(i)%></option><% }%></td>                          
                    </table>

                    <table>
                        <td>Width:</td><br>
                        <td><select name=width id="option">
                                <% for (int i = 1; i < cf.getMaxShedWidth() + 1; i++) {%>
                                <option value=1><%= cf.getShedwidth(i)%></option><% }%></td>
                    </table>
                    </tr>
                </form>
                        <br><br><a type="button" float="left" href ="FlatAngle.jsp"> Back </a>
                <a type="button" float ="right" href ="ShoppingCart.jsp">Add to shoppingcart</a>
                    
            </div>
            <div class="footer">THIS IS A FOOTER </div>
        </div>
    </body>
</html>
