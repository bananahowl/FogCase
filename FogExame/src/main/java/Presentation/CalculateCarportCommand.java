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
import DataLayer.Shed;
import DataLayer.User;
import Logic.CalcPartList;
import static Logic.CalcPartList.totalpartlist;
import Logic.CreateCarport;
import Logic.Facade.OrderFacade;
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
        
            int price = CreateCarport.NumbersAngleRoof(length, width, widthShed, lengthShed, angle);
            Carport cp = CreateCarport.createCarportAngleRoof(length, width,  widthShed,lengthShed, angle, price);
            String html = HtmlConverter.carportAnlgeRooftoHtml(cp);            
            ArrayList<MaterialList> list = totalpartlist(cp);
            String slist = printPartList(list);
            request.setAttribute("mlist", slist);
            request.setAttribute("carport", cp);
            request.setAttribute("price", price);
            request.setAttribute("table", html);
            request.setAttribute("carportwidth", width);
            return "Shed";

        }

    

}
