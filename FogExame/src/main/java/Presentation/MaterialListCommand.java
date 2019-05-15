/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import DataLayer.Carport;
import DataLayer.MaterialList;
import DataLayer.Order;
import DataLayer.Shed;
import DataLayer.User;
import Logic.CalcPartList;
import static Logic.CalcPartList.totalpartlist;
import Logic.CarportException;
import Logic.CreateCarport;
import Logic.Facade.OrderFacade;
import static Presentation.HtmlConverter.printPartList;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ahmed
 */
public class MaterialListCommand extends Command{
    
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
        int price = CreateCarport.NumbersFlatRoof(width, length, width, length);
        Carport cp = CreateCarport.createCarportFlatRoof(length, width, lengthShed, widthShed, price);
        Shed sh = new Shed(lengthShed, 220, widthShed);
        Carport carp = new Carport(length, 220, width, sh, angle, 0);
        ArrayList<MaterialList> list = totalpartlist(carp);
        String slist = printPartList(list);
        /*
        Order orders = OrderFacade.createOrder(1, cp, user);
        shoppingcart.add(orders);
*/
        request.setAttribute("mlist", slist);

        return "MaterialList";
    }

}
