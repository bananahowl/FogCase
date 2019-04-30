<%-- 
    Document   : ConfirmPriceCalCarport
    Created on : 26-04-2019, 10:00:59
    Author     : emils
--%>


<%@page import="java.io.IOException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DataLayer.DataMapper"%>

<%
     DataMapper acc = new DataMapper();

    String length = request.getParameter("Length");
    String width = request.getParameter("Width");
   /* //int bot = Integer.parseInt(length);
    int top = Integer.parseInt(width);
    int quanti = Integer.parseInt(quant);
    String str = acc.getMatiralName(bot);
    String temp = acc.getMatiralName(top);
  //  int price = acc.getPriceBot(bot) + acc.getPriceTop(top);

 //   int total = quanti * price;
    String name = str.replace("6", "with ");
    String topp = temp.replace("6", "");
    String namee = name.replace("5", "with ");
    String toppp = topp.replace("5", "");
    String finish = namee + toppp;
    //acc.sendOrderToDB(bot, top, quanti);
*/
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <a href="ConfirmPriceCalCarport.jsp"></a>
    <body>
        <h1> <%=request.getParameter("length")%></h1>
        
        
    </body>
</html>
