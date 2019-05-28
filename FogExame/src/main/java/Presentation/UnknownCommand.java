/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Logic.CarportException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *This clss is used if the command is not used or set in the froncontroller this called on.
 * @author emils
 */

public class UnknownCommand extends Command {
    /**
     * If the command is not used or set in the froncontroller this called on.
     * @return a custom exception.
     */
    @Override
    String execute( HttpServletRequest request, HttpServletResponse response ) throws CarportException {
        String msg = "Unknown command. Contact IT";
        throw new CarportException(msg);
    }

}