package Presentation;

import Logic.Facade.CarportFacade;
import Logic.CarportException;
import DataLayer.User;
import Logic.Facade.CarportFacade;
import Logic.Facade.UserFacade;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegisterCommand extends Command {

    @Override
    String execute( HttpServletRequest request, HttpServletResponse response ) throws CarportException {
        
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String adress = request.getParameter("adress");
        String city = request.getParameter("city");
        int zipcode = Integer.parseInt(request.getParameter("zipcode"));
        int phone = Integer.parseInt(request.getParameter("phonenumber"));
        String email = request.getParameter( "email" );
        String password1 = request.getParameter( "password1" );
        String password2 = request.getParameter( "password2" );
        if ( password1.equals( password2 ) ) {
            User user = UserFacade.createUser(firstname, lastname, adress, city, zipcode, phone, email, password1);
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            return "CustomizeCarport";
        } else {
            throw new CarportException("The two passwords did not match" );
            
        }
    }

}
