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
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    </head>
    <body>
        <%CarportFacade cf = new CarportFacade(); %>
        <div class="header">
            <img src="https://media.licdn.com/dms/image/C4E0BAQGleVi1XAFxBg/company-logo_200_200/0?e=2159024400&v=beta&t=qQ2ebmGf9u4b45tNF9OyVrcy7NGpnwLXZkLrOky6ibM" alt="Fog" width="200" height="200">
        </div>

        <div class="topnav">
            <a href="index.jsp">Home</a>
        </div>
        <div class="shadow-lg p-3 mb-5 bg-white rounded">
                <form action="FrontController" method="GET">
                    <div class ="leftcolumn">
                        <div class ="card">
                            <table class="first">
                            <h2><b>Design your own carport - with your measurements</b></h2>
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
                                                    <% for (int i = 1; i < cf.getMaxAngles() + 1; i++) {%>
                                                    <option value=<%=i%>><%= cf.getRoofAngle(i)%></option><% }%></td>
                                            
                                            <td><button type="submit" class="btn btn-outline-dark" name="command" value="calculate">Calculate </button></td>
                                            <td><span id="errorContainer"></span></td>
                                </tr>
                            </table>
                </form>
                <div class="rightcolumn">
                        ${userbox}
                </div>
                     </div>
    </body>
</html>
