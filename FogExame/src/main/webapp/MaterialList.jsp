<%-- 
    Document   : SVGCarport
    Created on : 29-04-2019, 10:49:05
    Author     : fskn
--%>

<%@page import="Logic.Facade.CarportFacade"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<%
    CarportFacade cf = new CarportFacade();
    int width = cf.getCarportWidth(Integer.parseInt(request.getParameter("width")));
    int length = cf.getCarportLength(Integer.parseInt(request.getParameter("length")));
    // this is a test method to work on the code
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MaterialList Page</title>
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
        
        <div class="row">
        <div class="column side">
            <h1></h1>
        </div>
            <div class="column middle">
                <div class="card">
                    <h2><b>Material list Tree</b></h2>
            ${mlist}
                </div>
                <div class="card">
                    <h2><b>Material list Metal:</b></h2>
            ${smlist}
                </div>
            </div>
            
        </div>
    </body>
</html>
