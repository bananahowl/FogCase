/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import DataLayer.Carport;
import Logic.CarportException;
import Logic.CreateCarport;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author emils
 */
public class CreateSVG extends Command{
        @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws CarportException {
        int length = Integer.parseInt(request.getParameter("length")) ;
        int width = Integer.parseInt(request.getParameter("width"));
        int angle = Integer.parseInt(request.getParameter("angle"));
        
        if(angle == 0){
        Carport ls = CreateCarport.createCarportFlatRoof(length, width,0,0,0);
        
        request.getSession().setAttribute("customcarport", ls);
        }
        else{
        Carport ls = CreateCarport.createCarportAngleRoof(length, width, 0, 0, angle, 0);
        
        request.getSession().setAttribute("customcarport", ls);
        }
        return "shoppingcart";
    }

}
