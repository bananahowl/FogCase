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
 * @author ahmed
 */
public class MaterialListCommand extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws CarportException {
        int length = Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter("width"));
        int lengthShed = Integer.parseInt(request.getParameter("lengthShed"));
        int widthShed = Integer.parseInt(request.getParameter("widthShed"));
        int angle = Integer.parseInt(request.getParameter("angle"));

        /*
        ArrayList<Order> shoppingcart = new ArrayList();
        User user = (User) request.getSession().getAttribute("user");
         */
        int price = CreateCarport.NumbersAngleRoof(length, width, widthShed, lengthShed, angle);
        Carport cp = CreateCarport.createCarportAngleRoof(length, width, lengthShed, widthShed,angle, price);
        ArrayList<MaterialList> list = totalpartlist(cp);
        String slist = printPartList(list);
        
        CalcPrice lizz = new CalcPrice();
        ArrayList<MetalParts> mlist = lizz.metalParts(list);
        String smlist = printMetalPartList(mlist);
        /*
        Order orders = OrderFacade.createOrder(1, cp, user);
        shoppingcart.add(orders);
         */
        request.setAttribute("mlist", slist);
        request.setAttribute("smlist", smlist);

        return "MaterialList";


    }

}
