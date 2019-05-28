<%-- 
    Document   : CarportFlatRoof
    Created on : 26-04-2019, 20:28:13
    Author     : Frederikke, Emil
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
            <img src="Images/FogLogo.jpg" alt="logofog" width="30%" height="20%">
        </div>

        <div class="topnav">
            <a href="index.jsp">Home</a>
        </div>
        <div class="shadow-lg p-3 mb-5 bg-white rounded">
            <div class="row">
                <div class="column side">
                    ${userbox}
                </div>
                <div class="column middle">
                    <div class="card">
                        <h2><b>PLEASE FILL OUT THE SECTION BELOW:</b></h2>
                        <br><br>
                        <form action="FrontController" method="POST">
                            <table class="table">
                                <thead class="thead-light">
                                    <tr>
                                        <th scope="col">#</th>
                                        <th scope="col">Carport length</th>
                                        <th scope="col">Carport width </th>
                                        <th scope="col">Shed Length</th>
                                        <th scope="col">Shed Width</th>
                                        <th scope="col">Roof angle</th>
                                    </tr>
                                <tbody>
                                    <tr>
                                        <th scope="row">Value</th>
                                        <td> <select name=length id="option">                        
                                                <% for (int i = 1; i < cf.getMaxLength() + 1; i++) {%>
                                                <option value=<%=i%>><%=cf.getCarportLength(i)%></option><% }%></td>
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

                                        <td><button type="submit" class="btn btn-success" name="command" value="calculate">Calculate </button></td>
                                        <td><span id="errorContainer"></span></td>
                                    </tr>
                                </tbody>
                            </table>
                        </form>
                    </div>
                </div>
            </div>
    </body>
</html>
