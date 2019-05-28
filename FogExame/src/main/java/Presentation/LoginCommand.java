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
        HttpSession session = request.getSession();
        session.getAttribute("user");
        if (request.getSession().getAttribute("user") == null) {
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            User user = Logic.Facade.UserFacade.getUser(email, password);
            String html = HtmlConverter.showLoggedInUser(user);
            session.setAttribute("user", user);
            session.setAttribute("userbox", html);
            return "CustomizeCarport";
        }
        return "index";
    }
}
