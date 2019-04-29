<%-- 
    Document   : custom_roof
    Created on : 24-04-2019, 09:52:18
    Author     : fskn
--%>

<%@page import="Logic.CarportFacade"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customize carport</title>
        <link href ="styling.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%CarportFacade cf = new CarportFacade(); %>

        <form id="addRoof" action ="Frontcontroller" method="POST">
            <input type="hidden" name="action" value="order">
            <table class ="table table-striped">
                <h1>Roof:<h1>
                        <thred><tr><th>Roof Type </th><th>Angle</th><th>Material/color</th></tr></thred>
                        <tr>  
                            <td><select name=flat id="option">
                                    <option value=flat></option><option value=flat>Flat</option><option value=" flat">Angle</option>
                            </td>

                            <td><select name=angle id="option">
                                    <% for (int i = 1; i < cf.getMaxAngles() + 1; i++) {%>
                                    <option value=2><%= cf.getRoofAngle(i)%></option><% }%>
                            </td>  

                            <td><select name=rmaterials id="option">
                                    <% for (int i = 1; i < cf.getMaxRoofMaterial() + 1; i++) {
                                    %> <option value=2><%= cf.getRoofMaterial(i)%></option><% }%>
                            </td>       
                            <td><input type ='submit' name ="okbutton" value ="Check Out"></td>
                            <td><input type ='submit' name ="calculate" value ="Calculate"></td>
                            <td><input type ='submit' name ="reset" value ="Reset"></td>
                        </tr>
                        </table>
                        </form>
                        </body>
                        </html>
