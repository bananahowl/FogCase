package Presentation;

import Logic.CarportException;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *The Command class is used to navigate throught jsp Pages wihtout making it too 
 * convoluted. <br>
 * The command class uses a HashMap which takes a string values as a id, and a Command, <br>
 * which is a abstract class that is used to redirect to a certain JSP page, for more info on how that work just look in any of the other command classes. 
 * This string value is used int the jsp pages to be able to use these methods and call on the certain hashmap, and get redirected to the certain command method.
<<<<<<< HEAD
 * 
 *
 * 
 * @author Emil
=======
 * Author: Emil, 
>>>>>>> 0415e3a92b1a0f99c6c04001bee854c4518a8de7
 */
abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put( "login", new LoginCommand());
         
        commands.put("shoppingcart", new ShoppingCartCommand());
        commands.put("register", new RegisterCommand());
        
        commands.put("calculate", new CalculateCarportCommand());
        commands.put("materialList", new MaterialListCommand());
        
        commands.put("customize", new CustomizeCommand());
        commands.put("design", new DesignCommand());
        commands.put("buy", new BuyCommand());
        /*
        commands.put( "createOrder", new CreateOrder());
        commands.put( "seeMyOrders", new GetMyOrders());*/

    }

    static Command from(HttpServletRequest request) {
        String commandName = request.getParameter("command");
        if (commands == null) {
            initCommands();
        }
        return commands.getOrDefault(commandName, new UnknownCommand());
    }

    abstract String execute(HttpServletRequest request, HttpServletResponse response)
            throws CarportException;

}
