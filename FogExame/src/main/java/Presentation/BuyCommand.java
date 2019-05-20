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
import DataLayer.Shed;
import DataLayer.User;
import static Logic.CalcPartList.totalpartlist;
import Logic.CalcPrice;
import Logic.CarportException;
import Logic.CreateCarport;
import Logic.Facade.OrderFacade;
import static Presentation.HtmlConverter.printMetalPartList;
import static Presentation.HtmlConverter.printPartList;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ahmed
 */
public class BuyCommand extends Command {

    public BuyCommand() {
    }

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws CarportException {
        if (request.getSession(true).getAttribute("user") == null) {
            String error = "You have to be logged in before you can finalize your order!";
            request.setAttribute("error", error);

            return "index";

        } else {
            
            int length = Integer.parseInt(request.getParameter("length"));
            int width = Integer.parseInt(request.getParameter("width"));
            int lengthShed = Integer.parseInt(request.getParameter("lengthShed"));
            int widthShed = Integer.parseInt(request.getParameter("widthShed"));
            int angle = Integer.parseInt(request.getParameter("angle"));
            
            int price = CreateCarport.NumbersAngleRoof(length, width, widthShed, lengthShed, angle);
            Carport cp = CreateCarport.createCarportAngleRoof(length, width, widthShed, lengthShed, angle, price);
            
            Carport cpp = CreateCarport.createCarportid(length, width, widthShed, lengthShed, angle, price);
            User user = (User) request.getSession().getAttribute("user");
            
            ArrayList<Order> shoppingcart = new ArrayList();
            Order orders = OrderFacade.createOrder(user.getUser_id(), cpp);
            shoppingcart.add(orders);
            String orderss = HtmlConverter.generateOrdersHTML(shoppingcart);
            ArrayList<MaterialList> list = totalpartlist(cp);
            String slist = printPartList(list);
            CalcPrice lizz = new CalcPrice();
            ArrayList<MetalParts> mlist = lizz.metalParts(list);
            String smlist = printMetalPartList(mlist);
            request.setAttribute("mlist", slist);
            request.setAttribute("smlist", smlist);
            String html = HtmlConverter.carportAnlgeRooftoHtml(cp);
            request.setAttribute("table2", html);
            request.setAttribute("mlist", slist);
            request.setAttribute("smlist", smlist);
            request.setAttribute("shoppingcart", shoppingcart);
            request.setAttribute("order", orderss);

            return "ShoppingCart";

        }
    }
}
