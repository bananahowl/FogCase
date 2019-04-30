<%-- 
    Document   : CustomizedCalculatedCarport
    Created on : 24-04-2019, 10:26:25
    Author     : emils
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DataLayer.DataMapper"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CustomizedCalculatedCarport</title>
    </head>

    <body>
        <div>
            <h1>Customize your very own Carport:</h1>
            <br>
            <div> 
                <%
                    DataMapper acc = new DataMapper();
                %>
                <p>Height is always 2 meter </p>
                <form id="addProduct" action="?action=order" method="POST">
                    <input type="hidden" name="action" value="order">
                    <table class="table table-striped">
                        <thead><tr><%//<th>Height</th>%><th>Length</th><th>Width</th><th>Material</th><th>Confirm</th><th></th></tr></thead>
                        <tbody>


                        <%--//<td><input type="text" name="height" placeholder="Height in cm" id="heightInput"></td>
                        
                        
                        <td><select name=length id="option">
                                <% for (int i = 1; i < acc.getMaxLength() + 1; i++) {%>
                                <option value=1><%= acc.getShedlength(i)%></option><% }%>
                        </td>                          

                        <td><select name=width id="option">
                                <% for (int i = 1; i < acc.getMaxWidth() + 1; i++) {%>
                                <option value=1><%= acc.getShedwidth(i)%></option><% }%>
                        </td>--%>
                        
                        <td><input type="text" name="length" placeholder="Length in cm" id="lengthInput"></td>
                        <td><input type="text" name="width" placeholder="Width in cm" id="withInput"></td>
                        <td> <select name=matiral id="option">
                                <% for (int i = 1; i < acc.getMaxMatiralNum() + 1; i++) {
                                %><option value=2><%= acc.getMaterialName(i)%> </option>
                            <% }%>
                        </td> 

                        <td><input type="submit" name="action" value="Add Carport to shoppingcart"></td><td><span id="errorContainer"></span></td>
                        </tr>
                    </table>
                </form>



            </div>

    </body>
</html>
x