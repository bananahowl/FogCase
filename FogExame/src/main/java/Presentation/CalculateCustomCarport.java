/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import DataLayer.Carport;
import Logic.CarportException;
import Logic.CarportFacade;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author emils
 */
public class CalculateCustomCarport extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws CarportException {
        int length = Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter("width"));
        int lengthShed = Integer.parseInt(request.getParameter("lengthShed"));
        int widthShed = Integer.parseInt(request.getParameter("widthShed"));
        int angle = Integer.parseInt(request.getParameter("angle"));
        if (angle == 0) {
            Carport ls = CarportFacade.createCarportFlatRoof(length, width, lengthShed, widthShed);
            request.getSession().setAttribute("flatCarport", ls);
            return "shoppingcart";
        } else {
            Carport ls = CarportFacade.createCarportAngleRoof(length, width, lengthShed, widthShed,angle);
            request.getSession().setAttribute("angleCarport", ls);
            return "shoppingcart";

        }

    }

}
