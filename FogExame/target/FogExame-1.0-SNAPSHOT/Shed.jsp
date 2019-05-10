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
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href ="styling.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <% 
        CarportFacade cf = new CarportFacade();
        int width = cf.getCarportWidth(Integer.parseInt(request.getParameter("width")));
        int length = cf.getCarportLength(Integer.parseInt(request.getParameter("length")));
        %>

        
        <div class="header">
            <img src="https://media.licdn.com/dms/image/C4E0BAQGleVi1XAFxBg/company-logo_200_200/0?e=2159024400&v=beta&t=qQ2ebmGf9u4b45tNF9OyVrcy7NGpnwLXZkLrOky6ibM" alt="Fog" width="200" height="200">
        </div>

        <div class="row">
            <div class="col-3 col-s-3 menu">
                <ul>
                    <li><a href="index.jsp">Home</a></li>
                    <li style="float:right"><a class="active" href="Register.jsp">Register</a></li>
                    <li><a href="CustomizeCarport.jsp">Customize</a></li>
                    <li style="float:right"><a class="active" href="#about">Log in</a></li>
                </ul>
            </div>
        </div>
       X${table}X   
       
        <svg height ="120mm" width ="1000mm">

       X${table}X
       <br>
       
       ${mlist}
       <br>
        <form>
       
       <h2> bird view</h2>
        <svg height ="<%=length+25%>" width ="<%=width+25%>">

        <rect x="0" y="15" width="<%=width+10%>" height="50" fill="#none"
              style="stroke:rgb(0,0,0);stroke-width:3"/>

        <rect x="0" y="<%=length-65%>" width="<%=width+10%>" height="50" fill="#none"
              style="stroke:rgb(0,0,0);stroke-width:3"/>	
                
        <line x1="0" y1="<%=length+10.5%>" x2="10" y2="<%=length+5.5%>"
              style="stroke:rgb(0,0,0);stroke-width:1"/>
        <line x1="0" y1="<%=length+10.5%>" x2="10" y2="<%=length+15.5%> "
              style="stroke:rgb(0,0,0);stroke-width:1"/>

        <line x1="<%=width + 10%>" y1="<%=length+10.5%>" x2="<%=width%>" y2="<%=length+5.5%>"
              style="stroke:rgb(0,0,0);stroke-width:1"/>
        <line x1="<%=width+10%>" y1="<%=length+10.5%>" x2="<%=width%>" y2="<%=length+15.5%>"
              style="stroke:rgb(0,0,0);stroke-width:1"/>  

        <% int temp = width;
            for (int i = 0; i < 1000; i++) {
                if (temp >= -0) {
        %><rect x="<%=temp%>" y="0"  width="10" height="<%=length%>" fill="none"
              style="stroke:rgb(0,0,0);stroke-width:3"/>
        <rect x="10" y="<%=length+10.5%>"  width="<%=temp-10%>" height="1" fill="#000000" /> <%
                    temp = temp - 30;
                } else {
                    break;
                }
            }
        %>
        </svg>        

</body>
</html>
