<%-- 
    Document   : yesShed
    Created on : 30-04-2019, 10:15:00
    Author     : fskn
--%>

<%@page import="Logic.CalcPartList"%>
<%@page import="Logic.CarportFacade"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href ="styling.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <% CarportFacade cf = new CarportFacade(); %>
        <%CalcPartList cpl = new CalcPartList(); %>
        <form name ="withShed" action="FrontController" method="POST">
            <p2><b>Choose the measurements here for your shed:<b></p2>
                        <table class="table table-striped">
                            <thead><tr><th>Heigth</th><th>Length</th><th>Width</th><th></th></tr></thead>
                            <tbody><tr>
                                    <td>220 cm</td>

                                    <td><select name=length id="option">
                                            <% for (int i = 1; i < cf.getMaxShedLength() + 1; i++) {%>
                                            <option value=1><%= cf.getShedlength(i)%></option><% }%>
                                    </td>                          

                                    <td><select name=width id="option">
                                            <% for (int i = 1; i < cf.getMaxShedWidth() + 1; i++) {%>
                                            <option value=1><%= cf.getShedwidth(i)%></option><% }%>
                                    </td>  
                                    <td><a type="button" class="btn btn-primary test" href ="Shoppingcart.jsp">Add to shoppingcart</a></td>
                                </tr>

                        </table>
                                    
                                            <p2><input type ="text" name="price" value="<%= cpl. %> "></p2>
                        <td><a type="button" class="btn btn-primary test">Calculate total price</a></td>
                        </form>
                        <div class="back">
                            <a type="button" class="btn btn-primary test" href ="FlatAngle.jsp">Back to start</a>
                        </div>
                        </body>
                        </html>
