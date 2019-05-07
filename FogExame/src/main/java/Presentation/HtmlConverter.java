/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;


import DataLayer.Carport;
import java.util.ArrayList;

/**
 *
 * @author emils
 */
public class HtmlConverter {

    public static String carportFlatRooftoHtml(Carport carport) {
        String cartTable = "<table id=\"carport\">"
                + "<tr><th>Carport</th><th>Length = </th><th>Width = </th><th>Height = 220</th></tr>"
                + "<tr><th>Size</th><th>" + carport.getLength() + "</th><th>" + carport.getWidth() + "</th></tr>"
                + "";
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
            return null;
//        String cartTable = "<table id=\"orders\">"
//                + "<tr><th>Order ID </th><th>Length </th><th>Width </th><th>Height </th><th>User </th><th>Shipped\t</th></tr>";
//        for (int i = 0; i < orders.size(); i++) {
//            cartTable += "<tr><td>" + orders.get(i).getOrder_id() + " </td>"
//                    + "<td>" + orders.get(i).getLength() + " </td>"
//                    + "<td>" + orders.get(i).getWidth() + " </td>"
//                    + "<td>" + orders.get(i).getHeight() + " </td>"
//                    + "<td>" + orders.get(i).getUser().toString() + " </td>"
//                    + "<td>" + orders.get(i).isShipped() + " </td></tr>";
//        }
//        return cartTable;
    }

}
