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
import static Logic.CalcPartList.totalpartlist;
import Logic.CalcPrice;
import Logic.CarportException;
import Logic.CreateCarport;
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
        
        int length = Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter("width"));
        int lengthShed = Integer.parseInt(request.getParameter("lengthShed"));
        int widthShed = Integer.parseInt(request.getParameter("widthShed"));
        int angle = Integer.parseInt(request.getParameter("angle"));
        ArrayList<Order> shoppingcart = new ArrayList();
        
        int price = CreateCarport.NumbersFlatRoof(width, length, width, length);
        Carport cp = CreateCarport.createCarportFlatRoof(length, width, lengthShed, widthShed, price);
        Shed sh = new Shed(lengthShed, 220, widthShed);
        Carport carp = new Carport(length, 220, width, sh, angle, 0);
        ArrayList<MaterialList> list = totalpartlist(carp);
        String slist = printPartList(list);
        
        CalcPrice lizz = new CalcPrice();
        ArrayList<MetalParts> mlist = lizz.metalParts(list);
        String smlist = printMetalPartList(mlist);
        
        request.setAttribute("mlist", slist);
        request.setAttribute("smlist", smlist);
        
        return "Buying";
        
        
    }

}
