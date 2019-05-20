<%-- 
    Document   : Design
    Created on : 16-05-2019, 11:27:49
    Author     : ahmed
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
            CarportFacade cf = new CarportFacade();
            int width = cf.getCarportWidth(Integer.parseInt(request.getParameter("width")));
            int length = cf.getCarportLength(Integer.parseInt(request.getParameter("length")));
            int lengths = Integer.parseInt(request.getParameter("length"));
            int widths = Integer.parseInt(request.getParameter("width"));
            int lengthShed = Integer.parseInt(request.getParameter("lengthShed"));
            int widthShed = Integer.parseInt(request.getParameter("widthShed"));
            int angle = Integer.parseInt(request.getParameter("angle"));
        %>
        <form>
        <input type="hidden" value="<%= lengths%>" name = "length">
        <input type="hidden" value="<%= widths%>" name = "width">
        <input type="hidden" value="<%= lengthShed%>" name = "lengthShed">
        <input type="hidden" value="<%= widthShed%>" name = "widthShed">
        <input type="hidden" value="<%= angle%>" name = "angle">
        </form>
        <button type="button" name="back" onclick="history.back()">back</button> <!-- to got to prior page.-->
        
        
        ${SVG}
        
        <p> ----------------------------</p>
        <div class="row">
        <div class="column side">
            <h1></h1>
        </div>
            <div class="column middle">
                <div class="card">
                    <h5 style="text-align: center;"><b>Customized carport</b></h5>
                    <h5><b> Bird view:</b></h5>
                <svg height ="<%=width + 25%>" width ="<%=length + 25%>">
                
                <rect x="0" y="15" width="<%=length + 10%>" height="50" fill="#none"
                      style="stroke:rgb(0,0,0);stroke-width:3"/>

                <rect x="0" y="<%=width - 65%>" width="<%=length + 10%>" height="50" fill="#none"
                      style="stroke:rgb(0,0,0);stroke-width:3"/>

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
                <h5><%=length%> in cm</h5>
                </div>
                <div class="card">
                    <h5><b> Side view</b></h5>
                <svg height ="600" width ="<%=length + 25%>">
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
                <%if (angle != 1) {%>
                <rect x="0" y="70" width="<%=length + 10%>" height="100" fill="#none"
                      style="stroke:rgb(0,0,0);stroke-width:3"/>
                <%}%>

                </svg>   
                <h5><%=length%> in cm</h5>
                </div>
                <div class="card">
                <h5><b>Front view</b></h5>
                <svg height ="600" width ="<%=width + 25%>">

                %><rect x="0" y="180"  width="10" height="220" fill="none"
                        style="stroke:rgb(0,0,0);stroke-width:3"/>
                <rect x="<%=width - 10%>" y="180"  width="10" height="220" fill="none"
                      style="stroke:rgb(0,0,0);stroke-width:3"/>
                <rect x="10" y="<%=length + 10.5%>"  width="<%=length - 10%>" height="1" fill="#000000" />
                <%if (angle != 1) {%>
                <polygon points="<%=width / 2%>,0 <%=width%>, 170 0,170" fill="none"
                         style="stroke:rgb(0,0,0);stroke-width:3"/>
                <%}%>

                <rect x="0" y="170" width="<%=width%>" height="10" fill="#none"
                      style="stroke:rgb(0,0,0);stroke-width:3"/>

                </svg>   
                <h2><%=width%> in cm</h2>
                <hr>
            </div>
            </div>
        </div>
    </body>
</html>
