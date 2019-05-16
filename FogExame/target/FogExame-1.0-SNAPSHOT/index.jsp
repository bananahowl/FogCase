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
            <img src="https://media.licdn.com/dms/image/C4E0BAQGleVi1XAFxBg/company-logo_200_200/0?e=2159024400&v=beta&t=qQ2ebmGf9u4b45tNF9OyVrcy7NGpnwLXZkLrOky6ibM" alt="Fog" width="200" height="200">
        </div>

        <div class="topnav">
            <a href="index.jsp">Home</a>
        </div>
        <div class="shadow-lg p-3 mb-5 bg-white rounded">
            <div class="leftcolumn">
                <div class="card">
                    <h2><b>Design your carport with your own measurements at Fogs</b></h2>
                    <h5>Hej</h5>

                    <p>BESKYT BILEN MED EN CARPORT</p>
                    <p>Det kan beskrives som en delvist lukket overdækning af bilen, som enten er fritstående eller bygget som en del af huset. For de fleste, og specielt dem der elsker biler, er den uundværlig. Med en carport kan du slappe helt af. Den beskytter nemlig din bil mod regn og slud. Det er derfor praktisk at lade bilen komme i læ under en overdækning. Du slipper for at skulle skrabe ruderne fri for is om vinteren, at vade igennem vandpytter om efteråret eller at sætte dig ind i en skoldhed bil om sommeren. Den er også hurtigere at opføre end en garage. Du kan derfor både hurtigt og nemt opføre den, og derved beskytte din bil efter kort tid. Det er en gevinst for huset, som får det til at fremstå færdigt. Alt andet vil være synd. En flot carport forøger husets værdi, og det vil have betydning, hvis du en dag skal sælge din bolig. Så gå på jagt og lad dig inspirere af vores store udvalg.
                    </p>
                        <button type="submit" class="btn btn-secondary btn-lg btn-block" value="customize">Customize Carport</button>
                    
                </div>
                <div class="card">
                    <h2><b>NYT INFO</b></h2>
                    <h5>EVT INFO</h5>
                    <p>NYT INFO</p>
                    <p> HER SKRIVES LILLE TEKST OM ET ELLER ANDET
                    </p>
                </div>
                <div class="card">
                    <h2><b>About us </b></h2>
                    <h5>EVT INFO</h5>
                    <p>NYT INFO</p>
                    <p>Her får du kvalificeret rådgivning til den bedste løsning.
                        Fog hjælper dig med at få overblik og komme i mål med dit byggeprojekt.
                        Lige fra hvad der er godt at vide til vejledning i valg af materialer
                        Johannes Fog består af et Bolig & Designhus og ni Trælast & Byggecenter-butikker fordelt i hele Nordsjælland – i Hørsholm, Fredensborg, Kvistgård, Helsinge, Lyngby, Ølstykke, Herlev og Farum. Vi har også en butik mere sydpå i Vordingborg, der også har stor ekspertise i salg af jern, stål og andre metaller.
                        I trælasten har vi træ og byggematerialer til alle slags opgaver. Vi har et stort udvalg, hvor du kan vælge mellem mange muligheder, både hvad angår størrelser og kvaliteter.
                        Byggecentrene har alt til hjemmet inden for bl.a. værktøj, maling, bad, beslag, el, lamper og pejseartikler. Fog kan hjælpe dig med valget af f.eks. en ny græsslåmaskine. Der er power til forskel, men det handler om at vælge værktøjet til lige præcis dit behov. Ordentlige haveredskaber og -møbler kan holde i rigtig mange år. Hos Fog får du kvalitet. Her er der forskellige slags havemøbler at vælge i mellem, parasoller der bare holder, terrassevarmere og meget andet, der bidrager til det hyggelige udeliv. Få kvalificeret rådgivning i Fog, så du nemt kan vælge.
                        Fog på Nørgaardsvej i Lyngby er helt speciel. Det er vores Bolig & Designhus. Her finder du udover de traditionelle byggecenter-varer også lækkert design og idéer til boligen indenfor køkken- og badudstyr, farve og tapeter, garderober, stort udvalg af havemøbler og Nordens største lampeafdeling med alle de kendte designlamper.</p>
                    </p>
                </div>

            </div>
            <div class="rightcolumn">
                <div class="card">
                    <form name="login" action="FrontController" method="GET">
                        <table class ="first">
                            <td>
                                <h2>Sign in here</h2>
                                <input type="hidden" name="command" value="login">
                                <div class="form-group"
                                     <p>Email:<br></p>
                                    <input type="text" name="email" value="emil@hotmail.com">
                                </div>
                                <div class="form-group"
                                     <p>Password:</p>
                                    <input type="password" name="password" value="1234">
                                </div>
                                <button type="submit" class="btn btn-outline-dark" value="Login">Sign in</button>
                            </td>
                        </table>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="Register.jsp">New around here? Register here</a>
                    </form>
                </div>
                <div class="card">
                    <h2>About Fog</h2>
                    <img src="https://f.nordiskemedier.dk/2a4on0lxc8g1816b.jpg" alt="Fog" width="362" height="280">
                </div>
            </div>
        </div>
        <div class="footer">
            <h2>Footer</h2>
        </div>
    </body>
</html>
