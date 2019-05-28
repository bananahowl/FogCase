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
import DataLayer.MaterialList;
import static Logic.CalcPartList.totalpartlist;
import Logic.CreateCarport;
import static Presentation.HtmlConverter.printPartList;
import java.util.ArrayList;

/**
 *
 * @author Emil, frederik
 */
public class CalculateCarportCommand extends Command {
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
        int length = Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter("width"));
        int lengthShed = Integer.parseInt(request.getParameter("lengthShed"));
            if(lengthShed > length){
                throw new CarportException("The shed can't be bigger than the carport!");
            }
        int widthShed = Integer.parseInt(request.getParameter("widthShed"));
          if(widthShed > width){
                throw new CarportException("The shed can't be bigger than the carport!");
            }
        int angle = Integer.parseInt(request.getParameter("angle"));
        int price = CreateCarport.NumbersAngleRoof(length, width, widthShed, lengthShed, angle);
        Carport cp = CreateCarport.createCarportAngleRoof(length, width, widthShed, lengthShed, angle, price);
        String html = HtmlConverter.carportAnlgeRooftoHtml(cp);
        ArrayList<MaterialList> list = totalpartlist(cp);
        String slist = printPartList(list);
        request.setAttribute("mlist", slist);
        request.setAttribute("table", html);
        return "Order";
    }
}
