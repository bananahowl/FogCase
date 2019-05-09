package Presentation;

import Logic.CarportException;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();/*
        commands.put( "login", new Login() );
         */
        commands.put("shoppingcart", new ShoppingCartCommand());
        commands.put("register", new RegisterCommand());
        
        commands.put("calculate", new CalculateCarportCommand());/*
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
