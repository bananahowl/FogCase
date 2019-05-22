<%-- 
    Document   : index
    Created on : 02-05-2019, 14:08:38
    Author     : emils
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Front page</title>
        <link href ="styling.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    </head>
    <body>
        <div class="header">

            <img src="Images/FogLogo.jpg" alt="logofog" width="30%" height="20%">

            <!--<img src="https://hr-skyen.dk/hr/image.php?companyid=226&id=5973" alt="Fog" width="500" heigth ="100"> -->
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
                    <h2><b>PROTECT THE CAR WITH A CARPORT</b></h2>
                    <br><p1>It can be described as a partially closed cover of the car, which is either free standing or built as part of the house. </p1>
                    <p1>For most, and especially those who love cars, it is indispensable. With a carport you can completely relax.</p1>
                    <p1>It protects your car from rain and sleet. It is therefore convenient to let the car come under shelter during a cover.</p1>
                    <p1>You don't have to scrape the windows free of ice in the winter, to wade through puddles in the fall or to put you in a scalding car in the summer. It is also faster to build than a garage.</p1>
                    <p1>You can therefore build it quickly and easily, thus protecting your car after a short while. It is a win for the house, which makes it appear finished. </p1>
                    <p1>Everything else will be sin. A nice carport increases the value of the house, and it will be important if one day you have to sell your home. </p1>
                    <p1>So go hunting and be inspired by our great selection.</p1>
                    <br>
                    <h2><b>YOU MUST TAKE INTO CONSIDERATION:</b></h2>
                    <br><p1>It is one of the first things your guests see when they meet the house.</p1>
                    <p1>Therefore, there is reason to consider how it looks and ensure that it fits the house's architecture.</p1>
                    <p1>It must be more than just functional, it must also be built in good materials and have a nice design. </p1>
                    <p1>Let it complement your home rather than damaging the visual expression. So you can park your car in beautiful surroundings.</p1>
                    <p1>The carport does not necessarily have to match the specific housing style and be built of the same materials. </p1>
                    <p1>However, it is still essential that there is a connection between the two buildings. The possibilities are many. </p1>
                    <p1>You should therefore consider the type of carport that best suits your needs. </p1>
                    <p1>Start by putting a budget on how much money you want to sacrifice on it, and decide on what you prioritize the most.</p1>
                    <p1>It is a good idea to assess whether you need a utility room where you can store bicycles, garden tools and the like. </p1>
                    <p1>It is nice to have the opportunity to put things away in a locked room.</p1>
                    <br><br><br>
                    <h5>${error}</h5>
                    <form action="FrontController" method="GET">
                        <button type="submit" class="btn btn-secondary btn-lg btn-block" name="command" value="customize">Customize Carport</button>

                    </form>

                </div>
                <div class="card">
                    <h2><b>WHAT BUILDING BUILDINGS REQUIRE CONTRUCTION PERMIT?</b></h2>
                    <br><p1>All buildings over 50 m² require building permission.</p1>
                    <p1>If the total area of ​​outbuildings, garages, carport covers etc. more than 35m² (for terraced houses 20 m²), the area must be included in the calculation of the building percentage.</p1>
                    <p1>This means that in some cases, a building permit and in other cases an exemption must be sought.</p1>
                    <p1>When building a garage, a carport or an outbuilding that is integrated into the existing building, a building permit must be applied for, regardless of whether the construction is below 50 m².</p1>
                    <p1>Unheated and heated conservatories or winter gardens always require an application for a building permit.</p1>
                    <p1>Actual extensions always require an application for a building permit.</p1>
                    <p1>If a building increases the living space, a building permit must always be sought.</p1>
                    <br>
                    <h2><b>WHAT BUILDINGS ONLY REQUIRE REPORT?</b></h2>
                    <br><p1>Buildings that are at least 35 m² and at most 50 m² require notification to the municipality. You must have ensured that the building percentage is not exceeded exceeded with the building.</p1>
                    <br><p1>If the building is erected on a plot where a row or cluster house is located, the requirement for notification applies, however, if the new building is between 20-50 m².</p1>
                    <p1>The municipality has a deadline of 14 days plus shipping time to process your review. If you have not received an answer when the deadline expires, you can start the project.</p1>
                    <br>
                    <h2><b>WHAT BUILDINGS DO NOT REQUIRE BUILDING AUTHORIZATION OR REPORT?</b></h2>
                    <br><p1>On the same grounds, up to 2 small buildings (eg utility sheds, playhouses, greenhouses and the like) can be erected up to a maximum of 10 m² each, without a building permit or notification, as long as the following are met:</p1>
                    <br><p1>The distance to other buildings on the ground and the mutual distance of the small buildings must be at least 2.5 meters.</p1>
                    <p1>No parts of the building's constructions, ie. walls or roof must be over 2.5 meters high.</p1>
                    <p1>If the above requirements are met, the two small buildings will not be counted in the building percentage.</p1>

                    <br><br><br><img src="Images/Fog.png" alt="logofog" width="10%" height="10%">                
                </div>
            </div>
            <div class="column side">
                <div class="card">
                    <form name="login" action="FrontController" method="GET">
                        <table>
                            <h5><b>Sign in</b></h5>
                            <td>
                                <input type="hidden" name="command" value="login">
                                <div class="form-group"
                                     <p>Email:<br></p>
                                    <input type="text" name="email" value="emil@hotmail.com">
                                </div>
                                <div class="form-group"
                                     <p>Password:</p>
                                    <input type="password" name="password" value="1234">
                                </div>
                                <button type="submit" class="btn btn-success" value="Login">Sign in</button>
                            </td>
                        </table>
                        <div class="dropdown-divider"></div>

                        <a class="dropdown-item" href="Register.jsp">New around here? Register here</a>


                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
