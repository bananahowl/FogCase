<%-- 
    Document   : SVGCarport
    Created on : 29-04-2019, 10:49:05
    Author     : fskn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<%
    int width = Integer.parseInt(request.getParameter("w"));


%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <svg height ="1000mm" width ="1000mm">

        <rect x="0" y="0" width="<%=width%>mm" height="10mm" fill="#0000ff" />

        <rect x="0" y="100mm" width="<%=width%>mm" height="10mm" fill="#0000ff" />

        <% for (int i = 0; i < 1000; i++) {
                if (width >= -0) {
        %><rect x="<%=width%>mm" y="0"  width="10mm" height="110mm" fill="#ff0000" />
        <rect x="10mm" y="115mm"  width="<%=width-10%>mm" height="1mm" fill="#000000" /> <%
                width = width -50;
            }
else{
break;
}
    }
        %>
    </body>
</html>
