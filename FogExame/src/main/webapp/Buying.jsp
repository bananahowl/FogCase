<%-- 
    Document   : Buying
    Created on : 16-05-2019, 11:41:32
    Author     : ahmed
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
            <form method="get" action="index.jsp">
                <button type="submit" class="btn btn-light" name="command" value="calculate">Home</button>
            </form>
        </div>
        <div class="shadow-lg p-3 mb-5 bg-white rounded">
            <div class="leftcolumn">
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
        <div class="rightcolumn">

            <div class="card">
                <h2>About Fog</h2>
                <img src="https://f.nordiskemedier.dk/2a4on0lxc8g1816b.jpg" alt="Fog" width="362" height="280">
            </div>
        </div>
    <div class="footer">
        <h2>Footer</h2>
    </div>
</body>
</html>
