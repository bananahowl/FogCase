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
 * The BuyCommand is used with realtion with the frontcontroller to work,
 * this class returns as the basic always a string <br>
 * it can also certain values which is sent to the with the setAttribute method, and is sent to the jsp the command returns to redirect to.
 * the string is return to the frontcontroller, which it use to redirect to certain jsp page with string name, 
 * and the values instanced in the command class get send there too with a setAttribute of the values.
 * @author ahmed, Emil
 */
public class BuyCommand extends Command {

    public BuyCommand() {
    }
    /**
     *
     * This execute class return as a minimum a string value which it returns to frontcontroller uses to direct to the JSP page of that name. <br>
     * There can also here that cetain attributes gets set, these values are either string of values.
     * These values is gotton from makeing intances of method from the logic layer. <br>
     * @param request servlet request
     * @param response servlet response
     * @throws CarportException
     * @return a string value of the jsp page which the frontcontroller recirect to.
     */
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws CarportException {
        if (request.getSession(true).getAttribute("user") == null) {
            String error = "You have to be logged in before you can finalize your order!";
            request.setAttribute("errors", error);
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
