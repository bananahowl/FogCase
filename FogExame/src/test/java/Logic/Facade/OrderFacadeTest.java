/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Facade;

import DataLayer.Carport;
import DataLayer.Order;
import DataLayer.Shed;
import DataLayer.User;
import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author frizz
 */
public class OrderFacadeTest {
/*
    
    @Test
    public void testCreateOrder() throws Exception {
        System.out.println("createOrder");
        Shed shed = new Shed(300,220,500);
        Shed shedexp = new Shed(300,220,500);
        int id = 0;
        Carport carport = new Carport(700,220,500,shed,20,5000);
        Carport carportexp = new Carport(700,220,500,shedexp,20,5000);
        User user = new User(99,"Knud", "Mogensen", "Gattet 7", "Lyngby", 2800, 12345678, "Knud@hotmail.dk", "KnudDenStore");
        User userexp = new User(99,"Knud", "Mogensen", "Gattet 7", "Lyngby", 2800, 12345678, "Knud@hotmail.dk", "KnudDenStore");
        Order expResult = new Order(id,carportexp, userexp, false);
        Order result = OrderFacade.createOrder(id, carport, user);
        
        assertEquals(expResult, result);
        OrderFacade.deleteorder(1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
