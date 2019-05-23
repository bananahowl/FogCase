<%-- 
    Document   : Shed
    Created on : 26-04-2019, 11:27:29
    Author     : fskn
--%>

<%@page import="Logic.Facade.CarportFacade"%>
<%@page import="DataLayer.Carport"%>
<%@page import="DataLayer.DataMappers.CarportMapper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CustomizeShed</title>
        <link href ="styling.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    </head>
    <body>  
        <%
            CarportFacade cf = new CarportFacade();
            int width = cf.getCarportWidth(Integer.parseInt(request.getParameter("width")));
            int length = cf.getCarportLength(Integer.parseInt(request.getParameter("length")));
            //${mlist}
        %>
        <div class="header">
            <img src="Images/FogLogo.jpg" alt="logofog" width="30%" height="20%">
        </div>

        <div class="topnav">
            <a href="index.jsp">Home</a>
        </div>
        <div class="row">
            <div class="column side">
                <h1></h1>
            </div>
            <div class="column middle">
                <div class="card">
                    <h5><b>Carport information:</b></h5>
                    ${table}

                </div>
                <div class="card">
                    <form action= "FrontController" method="GET" > 
                        <table class="first">
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

                            <button type="submit" class="btn btn-outline-dark" name="command" value="buy">Create Order</button>
                            <button type="submit" class="btn btn-outline-dark" name="command" value="design"> See carport design  </button>
                            <button type="submit" class="btn btn-outline-dark" name="command" value="materialList">See material list</button> 
                        </table>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
