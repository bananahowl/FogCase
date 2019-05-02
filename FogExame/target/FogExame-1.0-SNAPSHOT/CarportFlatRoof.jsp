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

    <p2><b>Carport efter egne mål</b></p2><br><br>

    <p1>Den valgte carport har flat tag</p1>
    <br>
    <p1>Vi gør vores kunder opmærksomhed på, at alle vores carporte leveres, som et byg-selv-sæt, usamlet og ubehandlet</p1>
    <br><br><br><br>

    <p2>Choose the size of your carport:</p2>

    <form name ="Shed" action="FrontController" method="hidden">
        <!--<input type="hidden" name="command" value="Shed">-->
        <table class="table table-striped">
            <thead><tr><th>Height</th><th>Length</th><th>Width</th><th></th></tr></thead>
            <tbody><tr>

                    <td>220 cm</td>

                    <td><select name=length id="option">                        
                            <% for (int i = 1; i < cf.getMaxLength() + 1; i++) {%>
                            <option value=<%=i%>><%=cf.getCarportLength(i)%></option><% }%>
                    </td>                          

                    <td><select name=width id="option">
                            <% for (int i = 1; i < cf.getMaxWidth() + 1; i++) {%>

                            <option value=<%=i%>><%=cf.getCarportWidth(i)%></option><% }%>
                    </td> 
                </tr>

            <h1>Shed:</h1>
        </table>
        <table class="table table-striped">
            <a href="CarportFlatRoof.jsp"></a>
            <thead><tr><th>Heigth</th><th>Length</th><th>Width</th><th></th></tr></thead>
            <tbody><tr>
                    <td>220 cm</td>

                    <td><select name=lengthShed id="option">
                            <% for (int i = 1; i < cf.getMaxShedLength() + 1; i++) {%>
                            <option value=<%=i%>><%= cf.getShedlength(i)%></option><% }%>
                    </td>                          

                    <td><select name=widthShed id="option">
                            <% for (int i = 1; i < cf.getMaxShedWidth() + 1; i++) {%>
                            <option value=<%=i%>><%= cf.getShedwidth(i)%></option><% }%>
                    </td>  
                    <td><input type="submit" class="btn btn-primary test" value="Add to shoppingcart"></td>
                </tr>
        </table>
    </form>
    <div class="back">
        <a type="button" class="btn btn-primary test" href ="FlatAngle.jsp">Back</a>
    </div>
</body>
</html>
