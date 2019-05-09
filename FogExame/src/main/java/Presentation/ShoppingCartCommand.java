/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import DataLayer.Carport;
import Logic.CarportException;
import Logic.Facade.CarportFacade;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author emils
 */
public class ShoppingCartCommand extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws CarportException {
        return "ShoppingCart";

    }

}
