/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import DataLayer.Carport;
import DataLayer.MaterialList;
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
                + "<button type=\"submit\"  name=\"command\" value=\"Shoppingcart\" >Add to Shoppingcart</button>"
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
                + "<table id=\"carport\">"
                + "<tr><th>Carport  </th><th>Length   </th><th>Width    </th><th>Height    </th><th>Shed Length    </th><th>Shed Width    </th><th>Angle   </th><th>Price      </th></tr>"
                + "<tr><th>Size</th><th>" + carport.getLength() + "</th><th>" + carport.getWidth() + "</th><th>220</th><th>" + carport.getShed().getLength() + "</th><th>" + carport.getShed().getWidth() + "</th><th>" + carport.getRoofangle() + "</th><th>" + carport.getPrice() + "</th></tr>"
                + "</table>"
                + "<button type=\"submit\"  name=\"command\" value=\"Shoppingcart\" >Add to Shoppingcart</button>"
                + "</form>";
        return cartTable;

    }

    public static String printPartList(ArrayList<MaterialList> list) {

        String partlisttop = "<form action=\"FrontController\" method=\"GET\">"
                + "<table id=\"parlist\">";

        String partlistmid = "";
        for (int i = 0; i < list.size(); i++) {
            partlistmid += "<tr><th>Size</th><th>" + list.get(i).getDescription() + "</th><th> Legnth</th><th>" + list.get(i).getLength() + "</th><th>Amount</th><th>" + list.get(i).getAmount() + "</th></tr> <br>";
        }

        //"<tr><th>Size</th><th>" + list.get(i).getDescription()+ "</th><th>" + list.get(i).getLength() + "</th><th>" + list.get(i).getAmount() + "</th></tr>";
        String partlistbottom
                = "</table>"
                + "<br>"
                + "</form>";

        /*" <form action=\"FrontController\" method=\"GET\"> "
               /+ "<tr>" 
                + "<th> <p> Material: " + list.get(i).getDescription() + " </p> </th>"
                + "<th> <p>Lenght of material: " + list.get(i).getLength() + " </p> </th>"
                + "<th> <p>Amount of material: " + list.get(i).getAmount() + " </p> </th>"
                + "</tr>"    
               /* System.out.println("Lenght of material: " + list.get(i).getLength());
                System.out.println("Amount of material: " + list.get(i).getAmount());
                System.out.println("-------------");*/
        // TODO add the print part list mehtod here so that the part list can be shown on the jsp pages.
        String totalParts = partlisttop + partlistmid + partlistbottom;
        totalParts.replace("MaterialList -", "");
        return totalParts;
    }

}
