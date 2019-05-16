<%-- 
    Document   : ShoppingCart
    Created on : 30-04-2019, 10:15:23
    Author     : fskn
--%>

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
            <img src="https://media.licdn.com/dms/image/C4E0BAQGleVi1XAFxBg/company-logo_200_200/0?e=2159024400&v=beta&t=qQ2ebmGf9u4b45tNF9OyVrcy7NGpnwLXZkLrOky6ibM" alt="Fog" width="200" height="200">
        </div>

        <div class="topnav">
            <a href="index.jsp">Home</a>
        </div>

        <div class="row">
            <div class="column side">
                <h1></h1>
            </div>
            <div class="column middle">
                <form action= "FrontController" method="GET" > 
                    <table>
                        <input type="hidden" value="<%= lengths%>" name = "length">
                    <input type="hidden" value="<%= widths%>" name = "width">
                    <input type="hidden" value="<%= lengthShed%>" name = "lengthShed">
                    <input type="hidden" value="<%= widthShed%>" name = "widthShed">
                    <input type="hidden" value="<%= angle%>" name = "angle">
                    
                    

                    <button type="submit" class="btn btn-outline-dark" name="command" value="materialList"> MaterialList  </button> 
                    <button type="submit" class="btn btn-outline-dark" name="command" value="design"> See carport design  </button> 
                    </table>
                </form>
            </div>
                    <div class="column side">
                        
                    </div>
        </div>

    </div>
</body>
</html>
