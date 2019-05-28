<%-- 
    Document   : ShoppingCart
    Created on : 30-04-2019, 10:15:23
    Author     : Frederikke, ahmed, emil 
--%>

<%@page import="Logic.Facade.CarportFacade"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href ="styling.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <%
            int lengths = Integer.parseInt(request.getParameter("length"));
            int widths = Integer.parseInt(request.getParameter("width"));
            int lengthShed = Integer.parseInt(request.getParameter("lengthShed"));
            int widthShed = Integer.parseInt(request.getParameter("widthShed"));
            int angle = Integer.parseInt(request.getParameter("angle"));
        %>
        <div class="header">
            <img src="Images/FogLogo.jpg" alt="logofog" width="30%" height="20%">
        </div>

        <div class="topnav">
            <a href="index.jsp">Home</a>
        </div>
        <div class="row">
            <div class="column side">
                <div class="card">
                    <h5></h5>
                </div>
            </div>
            <div class="column middle">
                <div class="card">
                    <h2>Recipt</h2>
                    <h5><b>Carport information:</b></h5>
                    ${table2}
                </div>
                <div class="card">
                    <form action= "FrontController" method="POST" > 
                        <table class="first">
                            <input type="hidden" value="<%= lengths%>" name = "length">
                            <input type="hidden" value="<%= widths%>" name = "width">
                            <input type="hidden" value="<%= lengthShed%>" name = "lengthShed">
                            <input type="hidden" value="<%= widthShed%>" name = "widthShed">
                            <input type="hidden" value="<%= angle%>" name = "angle">

                            <button type="submit" class="btn btn-success" name="command" value="materialList"> MaterialList  </button> 
                            <button type="submit" class="btn btn-success" name="command" value="design"> See carport design  </button> 
                        </table>
                </div>
            </div>
        </div>
    </body>
</html>
