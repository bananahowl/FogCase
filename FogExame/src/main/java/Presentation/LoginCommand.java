/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import DataLayer.User;
import Logic.CarportException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author fskn
 */
public class LoginCommand extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws CarportException {
        HttpSession session = request.getSession();
        session.getAttribute("user");
        if (request.getSession().getAttribute("user") == null) {
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            User user = Logic.Facade.UserFacade.getUser(email, password);

            User uuser = new User("Knud", "Mogensen", "Gattet 7", "Lyngby", 2800, 12345678, "Knud@hotmail.dk", "KnudDenStore");
            session.setAttribute("user", user);
            return "CustomizeCarport";
        }
        return "index";
    }
}
