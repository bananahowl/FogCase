<%-- 
    Document   : custom_roof
    Created on : 24-04-2019, 09:52:18
    Author     : fskn
--%>

<%@page import="DataLayer.DataMapper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>createOrder</title>
    </head>
    <body>
        <%DataMapper acc = new DataMapper(); %>
        
        <form id="addRoof" action ="Frontcontroller" method="POST">
            <input type="hidden" name="action" value="order">
            <table class ="table table-striped">
                <h1>Roof:<h1>
                <thred><tr><th>Flat or angle </th><th>Angle</th><th>Roof-type/color</th></tr></thred>
                <tr>  
                    <td><select name=flat id="option">
                            <option value=flat></option><option value=flat>Flat</option><option value=" flat">Angle</option></td>
                    
                    <td><select name=angle id="option">
                            <% for(int i = 1; i < acc.getMaxAngles() + 1; i++)  {%>
                           <option value=2><%= acc.getRoofAngle(i) %></option><% }%></td>  
                    
                    <td><select name=rmaterials id="option">
                            <% for(int i = 1; i < acc.getMaxRoofMaterial() + 1; i++)  {
                            %> <option value=2><%= acc.getRoofMaterial(i) %></option>
                            <% }%>
                    </td>          
                </tr>
                </table><hr>
                <tr><tr><tr>
            <h1>Shed:</h1>
            <table>
            <tr class="FormInput">
                    <th>Shed</th>
                    <td>
                        <select name="title">
                            <option value="yes">Yes.</option>
                            <option value="no">No.</option>
                        </select>
                    </td><tr></table>
        </tr><hr>
                <h1>Shed details:</h1>
                    <table class="table table-striped">
                <thead><tr><th>Heigth</th><th>Length</th><th>Width</th><th></th></tr></thead>
                <tbody><tr>
                          
                        <td><select name=heigth id =option><option>220 cm</option></td>
                        
                        <td><select name=length id="option">
                            <% for(int i = 1; i < acc.getMaxLength() + 1; i++)  {%>
                            <option value=1><%= acc.getShedlength(i) %></option><% }%></td>  
                        
                        <td><select name=width id="option">
                            <% for(int i = 1; i < acc.getMaxWidth()+ 1; i++)  {%>
                            <option value=1><%= acc.getShedwidth(i) %></option><% }%></td>  
                        
                        <td><select name=rmaterials id="option">
                            <% for(int i = 1; i < acc.getMaxRoofMaterial() + 1; i++)  {%>
                           <option value=1><%= acc.getRoofAngle(i) %></option><% }%></td>     
                </tr>

            </table>
        </form>
         <td><input type ='submit' name ="okbutton" value ="Check Out"></td>
                    <td><input type ='submit' name ="calculate" value ="Calculate"></td>
                    <td><input type ='submit' name ="reset" value ="Reset"></td><td><span id="errorContainer"></span></td>
    </body>
</html>
