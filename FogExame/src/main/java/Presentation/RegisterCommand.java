package Presentation;


import Logic.CarportException;
import DataLayer.User;
import Logic.Facade.UserFacade;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author frederik, Emil
 */
public class RegisterCommand extends Command {
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
        int zipcode = 0;
        int phone = 0;
        String firstname = request.getParameter("firstname");
        if (!firstname.matches("[a-zA-Z]+")){
          throw new CarportException("Name can only contain letters");  
        };
        String lastname = request.getParameter("lastname");
         if (!lastname.matches("[a-zA-Z]+")){
          throw new CarportException("Name can only contain letters");  
        };
        String adress = request.getParameter("adress");
        
        String city = request.getParameter("city");
         if (!city.matches("[a-zA-Z]+")){
          throw new CarportException("City can only contain letters");  
        };
        try{
        zipcode += Integer.parseInt(request.getParameter("zipcode"));
        }catch (NumberFormatException ex) {
        throw new CarportException("There can only be numbers in zipcodes!");
        }
        try{
        phone = Integer.parseInt(request.getParameter("phonenumber"));
        }catch (NumberFormatException ex) {
        throw new CarportException("There can only be numbers in phoneNUMBERS!");
        }
        
        String email = request.getParameter("email");
        if(!User.isValid(email)){
            throw new CarportException("Not a valid email!");
        }
        String password1 = request.getParameter("password1");
        String password2 = request.getParameter("password2");
        if (password1.equals(password2)) {
            if (UserFacade.doesUserExist(email) != null) {
                throw new CarportException("You are already registered with this email");
            } else {
                User user = UserFacade.createUser(firstname, lastname, adress, city, zipcode, phone, email, password1);
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                String html = HtmlConverter.showLoggedInUser(user);
                session.setAttribute("userbox", html);
                return "CustomizeCarport";
            }
        } else {
            throw new CarportException("The two passwords did not match");
        }
    }
}
