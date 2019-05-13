/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import DataLayer.Carport;
import Logic.CarportException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import DataLayer.MaterialList;
import DataLayer.Order;
import DataLayer.User;
import Logic.CalcPartList;
import static Logic.CalcPartList.totalpartlist;
import Logic.CreateCarport;
import static Presentation.HtmlConverter.printPartList;
import java.util.ArrayList;

/**
 *
 * @author emils
 */
public class CalculateCarportCommand extends Command {
    
    
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws CarportException {
        int length = Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter("width"));
        int lengthShed = Integer.parseInt(request.getParameter("lengthShed"));
        int widthShed = Integer.parseInt(request.getParameter("widthShed"));
        int angle = Integer.parseInt(request.getParameter("angle"));
        HttpSession session = request.getSession();
        CalcPartList tsst = new CalcPartList();
        ArrayList<Order> shoppingcart = new ArrayList();
        User user = (User) request.getSession().getAttribute("user");
        if (angle == 1) {

            int price = CreateCarport.NumbersFlatRoof(width, length, width, length);
            Carport cp = CreateCarport.createCarportFlatRoof(length, width, lengthShed, widthShed,price);

            String html = HtmlConverter.carportFlatRooftoHtml(cp);
            ArrayList<MaterialList> list = totalpartlist(widthShed,lengthShed,width,length,angle);
            String  slist = printPartList(list);
            
            Order orders = CreateOrder(1,cp,user);
            shoppingcart.add(orders);
            String orderss = HtmlConverter.generateOrdersHTML(shoppingcart);
            request.setAttribute("carport", cp); // the good stuff
            request.setAttribute("mlist", slist);
            request.setAttribute("table", html);
            request.setAttribute("price", price);
            request.setAttribute("carportwidth", width);
            request.setAttribute("ordera", orders);
            return "Shed";
        } else {
            int price = CreateCarport.NumbersAngleRoof(width, length, width, length, angle);
            Carport cp = CreateCarport.createCarportAngleRoof(length, width, lengthShed, widthShed, angle,price);
            String html = HtmlConverter.carportAnlgeRooftoHtml(cp);
            ArrayList<MaterialList> list = totalpartlist(widthShed,lengthShed,width,length,angle);
            String  slist = printPartList(list);
            request.setAttribute("mlist", slist);
            request.setAttribute("carport", cp);
            request.setAttribute("price", price);
            request.setAttribute("table", html);
            request.setAttribute("carportwidth", width);
            return "Shed";

        }

    }

}
