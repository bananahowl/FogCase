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
import Logic.CalcPartList;
import static Logic.CalcPartList.totalpartlist;
import Logic.CalcPrice;
import Logic.CarportException;
import Logic.CreateCarport;
import Logic.Facade.CarportFacade;
import Logic.Facade.OrderFacade;
import static Presentation.HtmlConverter.printMetalPartList;
import static Presentation.HtmlConverter.printPartList;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author emils
 */
public class ShoppingCartCommand extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws CarportException {
        HttpSession session = request.getSession();
        request.getSession().getAttribute("user");
        request.getSession().getAttribute("shoppingcart");
        request.getSession().getAttribute("order");
        request.setAttribute("order", request.getSession().getAttribute("order"));
        int length = Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter("width"));
        int lengthShed = Integer.parseInt(request.getParameter("lengthShed"));
        int widthShed = Integer.parseInt(request.getParameter("widthShed"));
        int angle = Integer.parseInt(request.getParameter("angle"));
        int price = CreateCarport.NumbersFlatRoof(width, length, width, length);
        
        //User user = (User) request.getSession().getAttribute("user");
        //Carport cp = CreateCarport.createCarportFlatRoof(length, width, lengthShed, widthShed, price);
        
        Shed sh = new Shed(lengthShed, 220, widthShed);
        Carport carp = new Carport(length, 220, width, sh, angle, 0);
        ArrayList<MaterialList> list = totalpartlist(carp);
        CalcPrice lizz = new CalcPrice();
        ArrayList<MetalParts> mlist = lizz.metalParts(list);
        String slist = printPartList(list);
        String smlist = printMetalPartList(mlist);
        
        /*
        Order orders = OrderFacade.createOrder(user.getUser_id(), cp);
        ArrayList<Order> shoppingcart = new ArrayList();
        shoppingcart.add(orders);
        String orderss = HtmlConverter.generateOrdersHTML(shoppingcart);
        */
        request.setAttribute("mlist", slist);
        request.setAttribute("smlist", smlist);
        /*
        request.setAttribute("shoppingcart", shoppingcart);
        request.setAttribute("order", orderss);
        */
        return "ShoppingCart";

    }

}
