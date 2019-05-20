/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import DataLayer.Carport;
import DataLayer.MaterialList;
import DataLayer.MetalParts;
import DataLayer.Order;
import DataLayer.User;
import java.util.ArrayList;

/**
 *
 * @author emils
 */
public class HtmlConverter {

    public static String carportFlatRooftoHtml(Carport carport) {
        String cartTable = "<form action=\"FrontController\" method=\"GET\">"
                + "<table id=\"carport\">"
                + "<tr><th>Carport  </th><th>Length   </th><th>Width    </th><th>Height    </th><th>Shed Length    </th><th>Shed Width    </th><th>Angle   </th><th>Price      </th></tr>"
                + "<tr><th>Size</th><th>" + carport.getLength() + "</th><th>" + carport.getWidth() + "</th><th>220</th><th>" + carport.getShed().getLength() + "</th><th>" + carport.getShed().getWidth() + "</th><th>none</th><th>" + carport.getPrice() + "</th></tr>"
                + "</table>"
                //+ "<button type=\"submit\"  name=\"command\" value=\"Shoppingcart\" >Add to Shoppingcart</button>"
                + "</form>";
        return cartTable;

//                 <table class=table table-striped><thead><tr><th>Name</th><th>Quantity</th><th>Price</th>
//                    <th>Total</th></tr></thead><tbody><tr>
//                    <td>  <%=finish%></td><td> <%=quant%></td><td> <%=price%></td><td class=lineprice><%= total%></td><td><form action=Control method=POST>
//                            <input type=hidden name=origin value=removeLine><input type=hidden name=lineId value=473>
//                        </form></td></tr><tr><td></td><td></td><td></td>
//                    <td>
//                        <form id="checkoutForm" action=Control method=POST><input type=hidden name=origin value=submitInvoice/>
//                            <input type=submit value=Check out your order></form></td></tr>
//            </tbody>
//        </table>
    }

    public static String carportAnlgeRooftoHtml(Carport carport) {
        String cartTable = "<form action=\"FrontController\" method=\"GET\">"
                + "<table class=first>"
                + "<thead class=dark><tr>"
                + "      <th scope=\"col\"><b>#</b></th>"
                + "      <th scope=\"col\">Value</th>"
                + "    </tr></thread>"
                + "<tbody>"
                + "<tr>"
                + "<th scope=\"col\"><b>Length</b></th>"
                + "      <th scope=\"col\">" + carport.getLength() + "</th>"
                + "</tr>"
                + "<tr>"
                + "<th scope=\"col\"><b>Width</b></th>"
                + "      <th scope=\"col\">" + carport.getWidth() + "</th>"
                + "</tr>"
                + "<tr>"
                + "<th scope=\"col\"><b>Heigth</b></th>"
                + "      <th scope=\"col\">" + 220 + "</th>"
                + "</tr>"
                + "<tr>"
                + "<th scope=\"col\"><b>Shed Length</b></th>"
                + "      <th scope=\"col\">" + carport.getShed().getLength() + "</th>"
                + "</tr>"
                + "<tr>"
                + "<th scope=\"col\"><b>Shed Width</b></th>"
                + "      <th scope=\"col\">" + carport.getShed().getWidth() + "</th>"
                + "</tr>"
                + "<tr>"
                + "<th scope=\"col\"><b>Roof-angle</b></th>"
                + "      <th scope=\"col\">" + carport.getRoofangle() + "</th>"
                + "</tr>"
                + "<tr>"
                + "<th scope=\"col\"><b>Price</b></th>"
                + "      <th scope=\"col\">" + carport.getPrice() + ",-" + "</th>"
                + "</tr></tbody>"
                + "</table>"
                + "</form>"
                + "</div></div>";
        return cartTable;

    }

    public static String printPartList(ArrayList<MaterialList> list) {

        String partlisttop = "<form action=\"FrontController\" method=\"GET\">"
                + "<table class=first>"
                + "<tr> <th>Description </th> <th>Length </th> <th> Amount</th> </tr>";

        String partlistmid = "";
        for (int i = 0; i < list.size(); i++) {
            partlistmid
                    += "<tr> <th> " + list.get(i).getDescription().toUpperCase()
                    + " </th><th> " + list.get(i).getLength()
                    + "</th> <th> " + list.get(i).getAmount() + "</th></tr>";
        }
        String partlistbottom
                = "</table>"
                + "<br>"
                + "</form>";

        String totalParts = partlisttop + partlistmid + partlistbottom;

        return totalParts;
    }

    public static String printMetalPartList(ArrayList<MetalParts> list) {

        String partlisttop = "<form action=\"FrontController\" method=\"GET\">"
                + "<table class=first>"
                + "<tr> <th>Description </th> <th>Price </th> <th> Amount</th> </tr>";

        String partlistmid = "";
        for (int i = 0; i < list.size(); i++) {
            partlistmid += "<tr> <th> " + list.get(i).getName()
                    + " </th><th>  " + list.get(i).getPrice()
                    + "</th> <th> " + list.get(i).getAmount() + "</th></tr>";
        }
        //"<tr><th>Size</th><th>" + list.get(i).getDescription()+ "</th><th>" + list.get(i).getLength() + "</th><th>" + list.get(i).getAmount() + "</th></tr>";
        String partlistbottom
                = "</table>"
                + "<br>"
                + "</form>";

        String totalParts = partlisttop + partlistmid + partlistbottom;
        return totalParts;
    }

    public static String generateOrdersHTML(ArrayList<Order> orders) {
        String cartTable = "<table class =second>"
                + "<tr><th>Order ID </th><th>Length </th><th>Width </th><th>Shed length </th><th>Shed width </th><th>User </th><th>Shipped\t</th></tr>";
        for (int i = 0; i < orders.size(); i++) {
            cartTable += "<tr><td>" + orders.get(i).getOrder_id() + " </td>"
                    + "<td>" + orders.get(i).getCarport().getLength() + " </td>"
                    + "<td>" + orders.get(i).getCarport().getWidth() + " </td>"
                    + "<td>" + orders.get(i).getCarport().getShed().getLength() + " </td>"
                    + "<td>" + orders.get(i).getCarport().getShed().getWidth() + " </td>"
                    + "<td>" + orders.get(i).getOrder_id() + " </td>"
                    + "<td>" + orders.get(i).isShipped() + " </td></tr>";
        }
        return cartTable;
    }

    public static String showLoggedInUser(User user) {
        String table = "<form action=\"FrontController\" method=\"GET\">"
                + "<table class=\"table\">\n"
                + "  <thead class=\"thead-light\">\n"
                + "    <tr>\n"
                + "      <th scope=\"col\">#</th>\n"
                + "      <th scope=\"col\">Profile:</th>"
                + "      <th scope=\"col\">Information</th>"
                + "    </tr>\n"
                + "  </thead><tbody>\n"
                + "    <tr>\n"
                + "      <th scope=\"row\"></th>\n"
                + "      <td>ID:</td>\n"
                + "      <td>" + user.getUser_id() + "</td>\n"
                + "    </tr>\n"
                + "    <tr>\n"
                + "      <th scope=\"row\"></th>\n"
                + "      <td>Firstname</td>\n"
                + "      <td>" + user.getFirstname() + "</td>\n"
                + "    </tr>\n"
                + "    <tr>\n"
                + "      <th scope=\"row\"></th>\n"
                + "      <td>Lastname</td>\n"
                + "      <td>" + user.getLastname() + "</td>\n"
                + "    </tr>\n"
                + "    <tr>\n"
                + "      <th scope=\"row\"></th>\n"
                + "      <td>Adress</td>\n"
                + "      <td>" + user.getAdress() + "</td>\n"
                + "    </tr>\n"
                + "    <tr>\n"
                + "      <th scope=\"row\"></th>\n"
                + "      <td>City</td>\n"
                + "      <td>" + user.getCity() + "</td>\n"
                + "    </tr>\n"
                + "    <tr>\n"
                + "      <th scope=\"row\"></th>\n"
                + "      <td>Zipcode</td>\n"
                + "      <td>" + user.getZipcode() + "</td>\n"
                + "    </tr>\n"
                + "    <tr>\n"
                + "      <th scope=\"row\"></th>\n"
                + "      <td>Phone</td>\n"
                + "      <td>" + user.getPhone() + "</td>\n"
                + "    </tr>\n"
                + "    <tr>\n"
                + "      <th scope=\"row\"></th>\n"
                + "      <td>Email</td>\n"
                + "      <td>" + user.getEmail() + "</td>\n"
                + "    </tr>\n"
                + "  </tbody>\n"
                + "</table>"
                + "</form>";
        return table;
    }

    public static String makeDesign(Carport carport) {
        
        String printpart = " <div class =\"grid-container\">\n"
                + "            <div class ='center'>\n"
                + "                <h1> Bird view</h1>\n"
                + "                <svg height =\"" + carport.getWidth() + " + 25\" width =\"" + carport.getLength() + " + 25\">\n"
                + "\n"
                + "                <rect x=\"0\" y=\"15\" width=\"" + carport.getLength() + "  + 10\" height=\"50\" fill=\"#none\"\n"
                + "                      style=\"stroke:rgb(0,0,0);stroke-width:3\"/>\n"
                + "\n"
                + "                <rect x=\"0\" y=\"" + carport.getWidth() + " - 65\" width=\"" + carport.getLength() + "  + 10\" height=\"50\" fill=\"#none\"\n"
                + "                      style=\"stroke:rgb(0,0,0);stroke-width:3\"/>	\n"
                + "\n";
        
        
        String printpart1 = "";
        for (int i = 0; i < 1000; i++) {
            int temp = carport.getLength();
            if (temp >= -0) {
                printpart1 +=  "<rect x=\"10\" y=\"" + carport.getLength() + "  + 10.5\"  width=\"" + temp + " - 10\" height=\"1\" fill=\"#000000\" /> \n";
                temp = temp - 30;
            } else {
                break;    
            }
            return printpart1;
        } 
        String printpart2 = 
           "    </svg>\n"
                + "                <h2><%=" + carport.getLength() + " %> in cm</h2>\n"
                + "                <br>\n"
                + "                <h2> Side view</h2>\n"
                + "                <svg height =\"100\" width =\"<%=" + carport.getLength() + " + 25%>\">\n"
                + "\n";
                String printpart3 = "";
                 int tempp = carport.getLength(); 
                 for (int i = 0; i < 1000; i++) {
                    if (tempp >= -0) {
                printpart3 += "<rect x=\"<%=tempp%>\" y=\"180\"  width=\"10\" height=\"220\" fill=\"none\"\n"
                + "                      style=\"stroke:rgb(0,0,0);stroke-width:3\"/>\n"
                + "           \n";
                tempp = tempp - 120;
                    }
                else {
                 break;
                }
                return printpart3;
                 }
                String printpart4 =  "\n"
                + "                <rect x=\"0\" y=\"170\" width=\"" + carport.getLength() +" " + "10\" height=\"10\" fill=\"#none\"\n"
                + "                      style=\"stroke:rgb(0,0,0);stroke-width:3\"/>\n";
                if(carport.getRoofangle() != 1){ 
                printpart4 +=            "<rect x=\"0\" y=\"70\" width=\"<%=" + carport.getLength() + "  + 10%>\" height=\"100\" fill=\"#none\"\n"
                + "                      style=\"stroke:rgb(0,0,0);stroke-width:3\"/>\n";
                }
                
                
                printpart4 +=" </svg>   \n";
                
                String printpart5 =
                "                <h2><%=" + carport.getLength() + " %> in cm</h2>\n"
                + "                <br>\n"
                + "\n"
                + "                <h1> Front view</h1>\n"
                + "                <svg height =\"100\" width =\"<%=" + carport.getWidth() + " + 25%>\">\n"
                + "\n"
                + "                %><rect x=\"0\" y=\"180\"  width=\"10\" height=\"220\" fill=\"none\"\n"
                + "                        style=\"stroke:rgb(0,0,0);stroke-width:3\"/>\n"
                + "                <rect x=\"<%=" + carport.getWidth() + " - 10%>\" y=\"180\"  width=\"10\" height=\"220\" fill=\"none\"\n"
                + "                      style=\"stroke:rgb(0,0,0);stroke-width:3\"/>\n"
                + "          \n";
                
                if(carport.getRoofangle() != 1){ 
                printpart5 +="                <polygon points=\"<%=" + carport.getWidth() + " / 2%>,0 <%=" + carport.getWidth() + "%>, 170 0,170\" fill=\"none\"\n"
                + "                         style=\"stroke:rgb(0,0,0);stroke-width:3\"/>\n";
                }
                        
                printpart5 +=
                 "                <rect x=\"0\" y=\"170\" width=\"<%=" + carport.getWidth() + "%>\" height=\"10\" fill=\"#none\"\n"
                + "                      style=\"stroke:rgb(0,0,0);stroke-width:3\"/>\n"
                + "\n"
                + "\n"
                + "                </svg>   \n"
                + "                <h2><%=" + carport.getWidth() + "%> in cm</h2>\n"
                + "            </div>\n"
                + "        </div>";
               String print = printpart + printpart1 + printpart2 + printpart3 + printpart4 + printpart5;
        return print; // this should return a string which can then show the svg design on the page.
    }

}
