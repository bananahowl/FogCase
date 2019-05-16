<%-- 
    Document   : Buying
    Created on : 16-05-2019, 11:41:32
    Author     : ahmed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="header">
            <img src="https://media.licdn.com/dms/image/C4E0BAQGleVi1XAFxBg/company-logo_200_200/0?e=2159024400&v=beta&t=qQ2ebmGf9u4b45tNF9OyVrcy7NGpnwLXZkLrOky6ibM" alt="Fog" width="200" height="200">
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
            <link href ="styling.css" rel="stylesheet" type="text/css"/>
        </div>
        <br>
        <h1>You have bout a carport here is the list of materials and a sketch!</h1>
        <br>
        
        <div class =" field">


            <br>
            Tree:
            ${mlist}
            <br>
            Metal:
            ${smlist}
            <br>
            <form method="get" action="index.jsp">
            <button type="submit" name="command" value="calculate"> Back to home</button>
            </form>

        </div>
        
        
        
    </body>
</html>
