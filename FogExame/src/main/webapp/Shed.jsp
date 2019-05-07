<%-- 
    Document   : Shed
    Created on : 26-04-2019, 11:27:29
    Author     : fskn
--%>

<%@page import="DataLayer.Carport"%>
<%@page import="DataLayer.DataMappers.DataMapper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CustomizeShed</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href ="styling.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
       
       X${table}X
       
        <form>
            <h1>Would you like ${carport.length} to add a shed to your carport?</h1>
                      
            
            <div class="shedYesNo">
        <a type="button" class="btn btn-primary test" href ="YesShed.jsp">Yes</a>
        <tr>
        <a type="button" class="btn btn-primary test" href ="ShoppingCart.jsp">No</a>
        </div>
        </form>
        <div class="back">
        <a type="button" class="btn btn-primary test" href ="FlatAngle.jsp">Back to start</a>
    </div>
        

</body>
</html>
