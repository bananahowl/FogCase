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
        <% int widthh = Integer.parseInt(request.getParameter("width"));
        CarportFacade cf = new CarportFacade();
        int width = cf.getCarportWidth(widthh);
        %>
       X${table}X   
       
        <svg height ="120mm" width ="1000mm">

        <rect x="0" y="0" width="<%=width+5.5%>mm" height="10mm" fill="#none"
              style="stroke:rgb(0,0,255);stroke-width:1mm"/>

        <rect x="0" y="100mm" width="<%=width+5.5%>mm" height="10mm" fill="#none"
              style="stroke:rgb(0,0,255);stroke-width:1mm"/>	
                
        <line x1="0" y1="115mm" x2="10mm" y2="110mm "
              style="stroke:rgb(0,0,0);stroke-width:1mm "/>
        <line x1="0" y1="115mm" x2="10mm" y2="120mm "
              style="stroke:rgb(0,0,0);stroke-width:1mm"/>

        <line x1="<%=width + 10%>mm" y1="115mm" x2="<%=width%>mm" y2="111mm "
              style="stroke:rgb(0,0,0);stroke-width:1mm"/>
        <line x1="<%=width+10%>mm" y1="115mm" x2="<%=width%>mm" y2="119mm "
              style="stroke:rgb(0,0,0);stroke-width:1mm"/>  

        <% for (int i = 0; i < 1000; i++) {
                if (width >= -0) {
        %><rect x="<%=width%>mm" y="0"  width="5.5mm" height="110mm" fill="none"
              style="stroke:rgb(255,0,0);stroke-width:1mm"/>
        <rect x="10mm" y="115mm"  width="<%=width-10%>mm" height="1mm" fill="#000000" /> <%
                    width = width - 50;
                } else {
                    break;
                }
            }
        %>
        </svg>
        <h2> 1:10</h2>
        

</body>
</html>
