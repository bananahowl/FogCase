/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import DataLayer.Carport;
import DataLayer.MaterialList;
import DataLayer.MetalParts;
import static Logic.CalcPartList.totalpartlist;
import Logic.CalcPrice;
import Logic.CarportException;
import Logic.CreateCarport;
import static Presentation.HtmlConverter.printMetalPartList;
import static Presentation.HtmlConverter.printPartList;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Emil
 */
public class ShoppingCartCommand extends Command {
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
        int price = CreateCarport.NumbersAngleRoof(width, length, width, angle,length);
        Carport cp = CreateCarport.createCarportAngleRoof(length, width, widthShed, lengthShed, angle, price);
        ArrayList<MaterialList> list = totalpartlist(cp);
        CalcPrice lizz = new CalcPrice();
        ArrayList<MetalParts> mlist = lizz.metalParts(list);
        String slist = printPartList(list);
        String smlist = printMetalPartList(mlist);
        request.setAttribute("mlist", slist);
        request.setAttribute("smlist", smlist);
        return "ShoppingCart";

    }

}
