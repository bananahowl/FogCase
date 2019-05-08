/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import DataLayer.Carport;
import Logic.CarportException;
import Logic.CarportFacade;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import DataLayer.MaterialList;
import Logic.CalcPartList;

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

        if (angle == 1) {
            int price = CarportFacade.NumbersFlatRoof(width, length, width, length);
            Carport ls = CarportFacade.createCarportFlatRoof(length, width, lengthShed, widthShed,price);
            String html = HtmlConverter.carportFlatRooftoHtml(ls);
            request.setAttribute("carport", ls); // the good stuff
            request.setAttribute("table", html);
            request.setAttribute("price", price);
            request.setAttribute("carportwidth", width);
            return "Shed";
        } else {
            int price = CarportFacade.NumbersAngleRoof(width, length, width, length, angle);
            Carport ls = CarportFacade.createCarportAngleRoof(length, width, lengthShed, widthShed, angle,price);
            String html = HtmlConverter.carportAnlgeRooftoHtml(ls);
            request.setAttribute("carport", ls);
            request.setAttribute("price", price);
            request.setAttribute("table", html);
            request.setAttribute("carportwidth", width);
            return "Shed";

        }

    }

}
