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
 * This class is used to make methods which can be used to eaisly be able to
 * make java code work with html. And its better code wise to make the java as
 * little as possible shown in the presentation layer. that is why this method
 * has been made, to take care of that part without having java code on the JSP
 * pages.
 *
 * @author emils, ahmed 
 */
public class HtmlConverter {

    /**
     * This method creates a string which has html code that displays a flaat
     * roof carport with the values lenght, width, shed lenght, shed width and
     * angle.
     *
     * @param carport a instance of the Carport class (a custom class)
     * @return a string with HTML code for displaying a carport.
     */
    public static String carportFlatRooftoHtml(Carport carport) {
        String cartTable = "<form action=\"FrontController\" method=\"GET\">"
                + "<table id=\"carport\">"
                + "<tr><th>Carport  </th><th>Length   </th><th>Width    </th><th>Height    </th><th>Shed Length    </th><th>Shed Width    </th><th>Angle   </th><th>Price      </th></tr>"
                + "<tr><th>Size</th><th>" + carport.getLength() + "</th><th>" + carport.getWidth() + "</th><th>220</th><th>" + carport.getShed().getLength() + "</th><th>" + carport.getShed().getWidth() + "</th><th>none</th><th>" + carport.getPrice() + "</th></tr>"
                + "</table>"
                + "</form>";
        return cartTable;

    }

    /**
     * This method creates a string which has html code that displays a flaat
     * roof carport with the values lenght, width, shed lenght, shed width and
     * angle.
     *
     * @param carport a instance of the Carport class (a custom class)
     * @return a string with HTML code for displaying a carport.
     */
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

    /**
     * This method creates a string which has html code that displays a material
     * list for that wood parts of the carport, it shows in a table format a
     * list of all the wood parts needed to make a carport.
     *
     * @param list a arraylist of the MaterialList class (a custom class)
     * @return a string html code for a table with wood carport parts.
     */
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

    /**
     * This method creates a string which has html code that displays a material
     * list for that wood parts of the carport, it shows in a table format a
     * list of all the metal parts needed to make a carport.
     *
     * @param list a arraylist of the metalparts (a custom class)
     * @return a string html code for a table with metal carport parts.
     */
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
        String partlistbottom
                = "</table>"
                + "<br>"
                + "</form>";

        String totalParts = partlisttop + partlistmid + partlistbottom;
        return totalParts;
    }

    /**
     * This method creates a string with html code that displays a order of
     * the carport from the inserted carport.
     *
     * @param orders : is a arraylist of the Order class 
     * @return a string html code for displaying a order.
     */
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
    /** 
     *This method creates a string with hmtl code which displays the information 
     * of the user from the inserted paramter.
     * @param user a instance of the User class (a custom class)
     * @return String with HTML code.
     */
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
}
