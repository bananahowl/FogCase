/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import DataLayer.CustomCarport;
import Logic.CarportException;
import Logic.CarportFacade;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author emils
 */
public class CalculateCustomCarport extends Command{
 
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws CarportException {
        int length = Integer.parseInt(request.getParameter("length")) ;
        int width = Integer.parseInt(request.getParameter("width"));
        CustomCarport ls = CarportFacade.createCustomCarport(length, width);
        request.getSession().setAttribute("customcarport", ls);
        return "legohousepage";
    }

}