
package Presentation;

import Logic.CarportException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *This clss is used if the command is not used or set in the froncontroller this called on.
 * @author Emil
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