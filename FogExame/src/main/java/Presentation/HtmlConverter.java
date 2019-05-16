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
        String cartTable =  "<form action=\"FrontController\" method=\"GET\">"
                + "<table>"
                + "<thead class=dark><tr>"
                + "      <th scope=\"col\">Length</th>"
                + "      <th scope=\"col\">" + carport.getLength() + "</th>"
                + "    </tr></thread>"
                + "<tbody>"
                + "<tr>"
                + "<th scope=\"col\">Width</th>"
                + "      <th scope=\"col\">" + carport.getWidth() + "</th>"
                + "</tr>"
                 + "<tr>"
                + "<th scope=\"col\">Heigth</th>"
                + "      <th scope=\"col\">" + 220 + "</th>"
                + "</tr>"
                 + "<tr>"
                + "<th scope=\"col\">Shed Length</th>"
                + "      <th scope=\"col\">" + carport.getShed().getLength() + "</th>"
                + "</tr>"
                 + "<tr>"
                + "<th scope=\"col\">Shed Width</th>"
                + "      <th scope=\"col\">" + carport.getShed().getWidth() + "</th>"
                + "</tr>"
                 + "<tr>"
                + "<th scope=\"col\">Roof-angle</th>"
                + "      <th scope=\"col\">" + carport.getRoofangle() + "</th>"
                + "</tr>"
                 + "<tr>"
                + "<th scope=\"col\">Price</th>"
                + "      <th scope=\"col\">" + carport.getPrice() + "</th>"
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
                + "<table class =first>"
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
                + "<table class =table table-hover table-dark>"
                + "<thead class=dark><tr>"
                + "      <th scope=\"col\">#</th>"
                + "      <th scope=\"col\"><b>Contact Information</b></th>"
                + "    </tr></thread>"
                + "<tbody>"
                + "<tr>"
                + "<th scope=\"col\"><b>ID</b></th>"
                + "      <th scope=\"col\">" + user.getUser_id() + "</th>"
                + "</tr>"
                + "<tr>"
                + "<th scope=\"col\"><b>Firstname</b></th>"
                + "      <th scope=\"col\">" + user.getFirstname() + "</th>"
                + "</tr>"
                 + "<tr>"
                + "<th scope=\"col\"><b>Lastname</b></th>"
                + "      <th scope=\"col\">" + user.getLastname() + "</th>"
                + "</tr>"
                 + "<tr>"
                + "<th scope=\"col\"><b>Adress</b></th>"
                + "      <th scope=\"col\">" + user.getAdress() + "</th>"
                + "</tr>"
                 + "<tr>"
                + "<th scope=\"col\"><b>City</b></th>"
                + "      <th scope=\"col\">" + user.getCity() + "</th>"
                + "</tr>"
                 + "<tr>"
                + "<th scope=\"col\"><b>Zipcode</b></th>"
                + "      <th scope=\"col\">" + user.getZipcode() + "</th>"
                + "</tr>"
                 + "<tr>"
                + "<th scope=\"col\"><b>Phone</b></th>"
                + "      <th scope=\"col\">" + user.getPhone() + "</th>"
                + "</tr>"
                + "<tr>"
                + "<th scope\"col\"><b>Email</b></th>"
                + "         <th scope=\"col\">" + user.getEmail() + "</th>"
                + "</tr></tbody>"
                + "</table>"
                + "</form>"
                + "</div></div>";
        return table;
    }
    
    public static String makeDesign(Carport carport){
    
    String print = " <div class =\"grid-container\">\n" +
"            <div class ='center'>\n" +
"                <h1> Bird view</h1>\n" +
"                <svg height =\""+carport.getWidth()+" + 25\" width =\""+carport.getLength()+" + 25\">\n" +
"\n" +
"                <rect x=\"0\" y=\"15\" width=\""+carport.getLength()+"  + 10\" height=\"50\" fill=\"#none\"\n" +
"                      style=\"stroke:rgb(0,0,0);stroke-width:3\"/>\n" +
"\n" +
"                <rect x=\"0\" y=\""+carport.getWidth()+" - 65\" width=\""+carport.getLength()+"  + 10\" height=\"50\" fill=\"#none\"\n" +
"                      style=\"stroke:rgb(0,0,0);stroke-width:3\"/>	\n" +

"\n" +
"                <% int temp = "+carport.getLength()+";\n" +
"                    for (int i = 0; i < 1000; i++) {\n" +
"                        if (temp >= -0) {\n" +
"                %><rect x=\"=temp\" y=\"0\"  width=\"10\" height=\""+carport.getWidth()+" \" fill=\"none\"\n" +
"                      style=\"stroke:rgb(0,0,0);stroke-width:3\"/>\n" +
"                <rect x=\"10\" y=\""+carport.getLength()+"  + 10.5\"  width=\"temp - 10\" height=\"1\" fill=\"#000000\" /> <%\n" +
"                            temp = temp - 30;\n" +
"                        } else {\n" +
"                            break;\n" +
"                        }\n" +
"                    }\n" +
"                %>\n" +
"                </svg>\n" +
"                <h2><%="+carport.getLength()+" %> in cm</h2>\n" +
"                <br>\n" +
"                <h2> Side view</h2>\n" +
"                <svg height =\"600\" width =\"<%="+carport.getLength()+" + 25%>\">\n" +
"\n" +
"                <% int tempp = "+carport.getLength()+" ;\n" +
"                    for (int i = 0; i < 1000; i++) {\n" +
"                        if (tempp >= -0) {\n" +
"                %><rect x=\"<%=tempp%>\" y=\"180\"  width=\"10\" height=\"220\" fill=\"none\"\n" +
"                      style=\"stroke:rgb(0,0,0);stroke-width:3\"/>\n" +
"                <rect x=\"10\" y=\"<%="+carport.getLength()+"  + 10.5%>\"  width=\"<%=tempp - 10%>\" height=\"1\" fill=\"#000000\" /> <%\n" +
"                            tempp = tempp - 120;\n" +
"                        } else {\n" +
"                            break;\n" +
"                        }\n" +
"                    }\n" +
"                %>\n" +
"\n" +
"                <rect x=\"0\" y=\"170\" width=\"<%="+carport.getLength()+"  + 10%>\" height=\"10\" fill=\"#none\"\n" +
"                      style=\"stroke:rgb(0,0,0);stroke-width:3\"/>\n" +
"                <%if(angle != 1){ %>\n" +
"                <rect x=\"0\" y=\"70\" width=\"<%="+carport.getLength()+"  + 10%>\" height=\"100\" fill=\"#none\"\n" +
"                      style=\"stroke:rgb(0,0,0);stroke-width:3\"/>\n" +
"                <%}%>\n" +
"\n" +
"\n" +
"                </svg>   \n" +
"                <h2><%="+carport.getLength()+" %> in cm</h2>\n" +
"                <br>\n" +
"\n" +
"                <h1> Front view</h1>\n" +
"                <svg height =\"600\" width =\"<%="+carport.getWidth()+" + 25%>\">\n" +

"\n" +
"                %><rect x=\"0\" y=\"180\"  width=\"10\" height=\"220\" fill=\"none\"\n" +
"                        style=\"stroke:rgb(0,0,0);stroke-width:3\"/>\n" +
"                <rect x=\"<%="+carport.getWidth()+" - 10%>\" y=\"180\"  width=\"10\" height=\"220\" fill=\"none\"\n" +
"                      style=\"stroke:rgb(0,0,0);stroke-width:3\"/>\n" +
"                <rect x=\"10\" y=\"<%="+carport.getLength()+"  + 10.5%>\"  width=\"<%="+carport.getLength()+"  - 10%>\" height=\"1\" fill=\"#000000\" />\n" +
"                <%if(angle != 1){ %>\n" +
"                <polygon points=\"<%="+carport.getWidth()+" / 2%>,0 <%="+carport.getWidth()+"%>, 170 0,170\" fill=\"none\"\n" +
"                         style=\"stroke:rgb(0,0,0);stroke-width:3\"/>\n" +
"                <%}%>\n" +
"\n" +
"                <rect x=\"0\" y=\"170\" width=\"<%="+carport.getWidth()+"%>\" height=\"10\" fill=\"#none\"\n" +
"                      style=\"stroke:rgb(0,0,0);stroke-width:3\"/>\n" +
"\n" +
"\n" +
"                </svg>   \n" +
"                <h2><%="+carport.getWidth()+"%> in cm</h2>\n" +
"            </div>\n" +
"        </div>";
    
    return print;
    }

}
