<%-- 
    Document   : yesShed
    Created on : 30-04-2019, 10:15:00
    Author     : fskn
--%>

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
        <form>
            <p2><b>Choose the mesurements here for your shed:<b></p2>
            <table class="table table-striped">
                <thead><tr><th>Heigth</th><th>Length</th><th>Width</th><th></th></tr></thead>
                <tbody><tr>
                        <td><select name=heigth id =option><option>220 cm</option></td>

                        <td><select name=length id="option">
                                <% for (int i = 1; i < cf.getMaxLength() + 1; i++) {%>
                                <option value=1><%= cf.getShedlength(i)%></option><% }%>
                        </td>                          

                        <td><select name=width id="option">
                                <% for (int i = 1; i < cf.getMaxWidth() + 1; i++) {%>
                                <option value=1><%= cf.getShedwidth(i)%></option><% }%>
                        </td>  

                        <td><a type="reset" class="btn btn-primary test" href ="Shoppingcart.jsp">Add to shoppingcart</a></td>
                    </tr>

            </table>

        </form>
        <div class="back">
            <a type="button" class="btn btn-primary test" href ="FlatAngle.jsp">Back</a>
        </div>  
    </body>
</html>
