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
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href ="styling.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <% CarportFacade cf = new CarportFacade();%>    
        <h1></h1>
    <p2>The selected carport has a flat roof.</p2><br><br>
    <p2><b>Choose the size of your carport<b></p2>
        <form>
            <table class="table table-striped">
                <thead><tr><th>Height</th><th>Length</th><th>Width</th><th>Material</th><th></th></tr></thead>
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

                <td> <select name=materialName id="option">
                        <% for (int i = 1; i < cf.getmaxmatiralnum() + 1; i++) {
                        %><option value=2><%= cf.getMatiralName(i)%> </option>
                        <% }%>
                </td> 

                <td><input type="submit" name="action" value="Add Carport to shoppingcart"></td><td><span id="errorContainer"></span></td>
                </tr>
            </table>
        </form>
        <div class="back">
            <a type="button" class="btn btn-primary test" href ="FlatAngle.jsp">Back</a>
        </div>
    </body>
</html>
