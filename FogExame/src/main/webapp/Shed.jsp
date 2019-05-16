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
        <div class="header">
            <img src="https://media.licdn.com/dms/image/C4E0BAQGleVi1XAFxBg/company-logo_200_200/0?e=2159024400&v=beta&t=qQ2ebmGf9u4b45tNF9OyVrcy7NGpnwLXZkLrOky6ibM" alt="Fog" width="200" height="200">
        </div>

        <div class="row" >
            <div class="col-3 col-s-3 menu">
                <ul>
                    <li><a href="index.jsp">Home</a></li>
                    <li style="float:right"><a class="active" href="Register.jsp">Register</a></li>
                    <li><a href="CustomizeCarport.jsp">Customize</a></li>
                    <li style="float:right"><a class="active" href="Login.jsp">Log in</a></li>
                </ul>
            </div>
        </div>

        <%
            CarportFacade cf = new CarportFacade();
            int width = cf.getCarportWidth(Integer.parseInt(request.getParameter("width")));
            int length = cf.getCarportLength(Integer.parseInt(request.getParameter("length")));
            //${mlist}
        %>
        ${table}
        <form action= "FrontController" method="GET" > 
            <%
                int lengths = Integer.parseInt(request.getParameter("length"));
                int widths = Integer.parseInt(request.getParameter("width"));
                int lengthShed = Integer.parseInt(request.getParameter("lengthShed"));
                int widthShed = Integer.parseInt(request.getParameter("widthShed"));
                int angle = Integer.parseInt(request.getParameter("angle"));
            %>
            <input type="hidden" value="<%= lengths %>" name = "length">
            <input type="hidden" value="<%= widths %>" name = "width">
            <input type="hidden" value="<%= lengthShed %>" name = "lengthShed">
            <input type="hidden" value="<%= widthShed %>" name = "widthShed">
            <input type="hidden" value="<%= angle %>" name = "angle">
            <button type="submit" name="command" value="buy">Pay for the carport</button> 

            <button type="submit"  name="command" value="shoppingcart"> Go to shoppingcart </button>

        </form>

        <br>

        X${shoppingcart}X
        ${order}X

        <div class ="grid-container">
            <div class ='center'>
                <h1> Bird view</h1>
                <svg height ="<%=width + 25%>" width ="<%=length + 25%>">

                <rect x="0" y="15" width="<%=length + 10%>" height="50" fill="#none"
                      style="stroke:rgb(0,0,0);stroke-width:3"/>

                <rect x="0" y="<%=width - 65%>" width="<%=length + 10%>" height="50" fill="#none"
                      style="stroke:rgb(0,0,0);stroke-width:3"/>	

<!--        <line x1="0" y1="<%=length + 10.5%>" x2="10" y2="<%=length + 5.5%>"
style="stroke:rgb(0,0,0);stroke-width:1"/>
<line x1="0" y1="<%=length + 10.5%>" x2="10" y2="<%=length + 15.5%> "
style="stroke:rgb(0,0,0);stroke-width:1"/>

<line x1="<%=length + 10%>" y1="<%=width + 10.5%>" x2="<%=length%>" y2="<%=width + 5.5%>"
style="stroke:rgb(0,0,0);stroke-width:1"/>
<line x1="<%=length + 10%>" y1="<%=width + 10.5%>" x2="<%=length%>" y2="<%=width + 15.5%>"
style="stroke:rgb(0,0,0);stroke-width:1"/>  -->

                <% int temp = length;
                    for (int i = 0; i < 1000; i++) {
                        if (temp >= -0) {
                %><rect x="<%=temp%>" y="0"  width="10" height="<%=width%>" fill="none"
                      style="stroke:rgb(0,0,0);stroke-width:3"/>
                <rect x="10" y="<%=length + 10.5%>"  width="<%=temp - 10%>" height="1" fill="#000000" /> <%
                            temp = temp - 30;
                        } else {
                            break;
                        }
                    }
                %>
                </svg>
                <h2><%=length%> in cm</h2>
                <br>
                <h2> Side view</h2>
                <svg height ="600" width ="<%=length + 25%>">


<!--        <line x1="0" y1="<%=length + 10.5%>" x2="10" y2="<%=length + 5.5%>"
style="stroke:rgb(0,0,0);stroke-width:1"/>
<line x1="0" y1="<%=length + 10.5%>" x2="10" y2="<%=length + 15.5%> "
style="stroke:rgb(0,0,0);stroke-width:1"/>

<line x1="<%=width + 10%>" y1="<%=length + 10.5%>" x2="<%=width%>" y2="<%=length + 5.5%>"
style="stroke:rgb(0,0,0);stroke-width:1"/>
<line x1="<%=width + 10%>" y1="<%=length + 10.5%>" x2="<%=width%>" y2="<%=length + 15.5%>"
style="stroke:rgb(0,0,0);stroke-width:1"/>  -->

                <% int tempp = length;
                    for (int i = 0; i < 1000; i++) {
                        if (tempp >= -0) {
                %><rect x="<%=tempp%>" y="180"  width="10" height="220" fill="none"
                      style="stroke:rgb(0,0,0);stroke-width:3"/>
                <rect x="10" y="<%=length + 10.5%>"  width="<%=tempp - 10%>" height="1" fill="#000000" /> <%
                            tempp = tempp - 120;
                        } else {
                            break;
                        }
                    }
                %>

                <rect x="0" y="170" width="<%=length + 10%>" height="10" fill="#none"
                      style="stroke:rgb(0,0,0);stroke-width:3"/>
                <rect x="0" y="70" width="<%=length + 10%>" height="100" fill="#none"
                      style="stroke:rgb(0,0,0);stroke-width:3"/>


                </svg>   
                <h2><%=length%> in cm</h2>
                <br>

                <h1> Front view</h1>
                <svg height ="600" width ="<%=width + 25%>">


<!--    ½    <line x1="0" y1="<%=length + 10.5%>" x2="10" y2="<%=length + 5.5%>"
style="stroke:rgb(0,0,0);stroke-width:1"/>
<line x1="0" y1="<%=length + 10.5%>" x2="10" y2="<%=length + 15.5%> "
style="stroke:rgb(0,0,0);stroke-width:1"/>

<line x1="<%=width + 10%>" y1="<%=length + 10.5%>" x2="<%=width%>" y2="<%=length + 5.5%>"
style="stroke:rgb(0,0,0);stroke-width:1"/>
<line x1="<%=width + 10%>" y1="<%=length + 10.5%>" x2="<%=width%>" y2="<%=length + 15.5%>"
style="stroke:rgb(0,0,0);stroke-width:1"/>  -->


                %><rect x="0" y="180"  width="10" height="220" fill="none"
                        style="stroke:rgb(0,0,0);stroke-width:3"/>
                <rect x="<%=width - 10%>" y="180"  width="10" height="220" fill="none"
                      style="stroke:rgb(0,0,0);stroke-width:3"/>
                <rect x="10" y="<%=length + 10.5%>"  width="<%=length - 10%>" height="1" fill="#000000" />
                <polygon points="<%=width / 2%>,0 <%=width%>, 170 0,170" fill="none"
                         style="stroke:rgb(0,0,0);stroke-width:3"/>

                <rect x="0" y="170" width="<%=width%>" height="10" fill="#none"
                      style="stroke:rgb(0,0,0);stroke-width:3"/>


                </svg>   
                <h2><%=width%> in cm</h2>
            </div>
        </div>
    </body>
</html>
