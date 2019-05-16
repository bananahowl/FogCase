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
        <div class="header">
            <img src="https://media.licdn.com/dms/image/C4E0BAQGleVi1XAFxBg/company-logo_200_200/0?e=2159024400&v=beta&t=qQ2ebmGf9u4b45tNF9OyVrcy7NGpnwLXZkLrOky6ibM" alt="Fog" width="200" height="200">
        </div>

        <div class="topnav">
            <a href="index.jsp">Home</a>
        </div>
        <div class="shadow-lg p-3 mb-5 bg-white rounded">
            <div class="leftcolumn">
                <div class="card">
                    <form action= "FrontController" method="GET" > 

                        <%
                            int lengths = Integer.parseInt(request.getParameter("length"));
                            int widths = Integer.parseInt(request.getParameter("width"));
                            int lengthShed = Integer.parseInt(request.getParameter("lengthShed"));
                            int widthShed = Integer.parseInt(request.getParameter("widthShed"));
                            int angle = Integer.parseInt(request.getParameter("angle"));
                        %>
                        <input type="hidden" value="<%= lengths%>" name = "length">
                        <input type="hidden" value="<%= widths%>" name = "width">
                        <input type="hidden" value="<%= lengthShed%>" name = "lengthShed">
                        <input type="hidden" value="<%= widthShed%>" name = "widthShed">
                        <input type="hidden" value="<%= angle%>" name = "angle">
                        <br>

                        <button type="submit" class="btn btn-outline-dark" name="command" value="materialList"> MaterialList  </button> 
                        <button type="submit" class="btn btn-outline-dark" name="command" value="design"> See carport design  </button> 

                    </form>
                </div></div>
                    
            <div class="rigthcolumn">
                <div class="card">
                    
                </div></div>
                    
                    <div class="footer">
                        <h2>Footer</h2>
                    </div>
                    </body>
                    </html>
