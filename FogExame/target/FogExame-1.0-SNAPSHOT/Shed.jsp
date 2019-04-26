<%-- 
    Document   : Shed
    Created on : 26-04-2019, 11:27:29
    Author     : fskn
--%>

<%@page import="DataLayer.DataMapper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CustomizeShed</title>
        <link href ="styling.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <% DataMapper acc = new DataMapper(); %>
        <form>
            <h1>Would you like to add a shed to your carport?</h1>
            <table>
                <tr class="FormInput">
                <tr>
                    <td><input type="radio" name ="yes" value="1">Yes</td>
                    <td><input type="radio" name ="no" value="2">No</td>
                </tr>  
            </table>

            <h1>Choose measurements here: </h1>
            <table class="table table-striped">
                <thead><tr><th>Heigth</th><th>Length</th><th>Width</th><th></th></tr></thead>
                <tbody><tr>
                        <td><select name=heigth id =option><option>220 cm</option></td>

                        <td><select name=length id="option">
                                <% for (int i = 1; i < acc.getMaxLength() + 1; i++) {%>
                                <option value=1><%= acc.getShedlength(i)%></option><% }%>
                        </td>                          

                        <td><select name=width id="option">
                                <% for (int i = 1; i < acc.getMaxWidth() + 1; i++) {%>
                                <option value=1><%= acc.getShedwidth(i)%></option><% }%>
                        </td>  
                    
                <td><input type ='submit' name ="okbutton" value ="Check Out"></td>
                <td><input type ='submit' name ="calculate" value ="Calculate"></td>
                <td><input type ='submit' name ="reset" value ="Reset"></td>
                </tr>
            </table>
        </form>
</body>
</html>
