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
        if (angle == 1) {
            Carport ls = CarportFacade.createCarportFlatRoof(length, width, lengthShed, widthShed);
            request.getSession().setAttribute("carport", ls);
            return "Shed";
        } else {
            Carport ls = CarportFacade.createCarportAngleRoof(length, width, lengthShed, widthShed,angle);
            request.getSession().setAttribute("carport", ls);
            return "Shed";

        }

    }

}
