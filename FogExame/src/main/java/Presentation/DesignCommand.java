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
 * @author ahmed
 */
public class DesignCommand extends Command {

    public DesignCommand() {
    }

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws CarportException {
        
        int length = Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter("width"));
        int lengthShed = Integer.parseInt(request.getParameter("lengthShed"));
        int widthShed = Integer.parseInt(request.getParameter("widthShed"));
        int angle = Integer.parseInt(request.getParameter("angle"));
        int price = CreateCarport.NumbersAngleRoof(width, length, width, length, angle);
        Carport carport = CreateCarport.createCarportAngleRoof(length, width, widthShed, lengthShed, angle, price);
        String design = HtmlConverter.makeDesign(carport);
        
        request.setAttribute("SVG", design);
        return "Design";
    }
    
}
