/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Facade;

import DataLayer.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author frederik
 */
public class UserFacadeTest {
    
    public UserFacadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createUser method, of class UserFacade.
     */
    @Test
    public void testCreateUser() throws Exception {
        System.out.println("createUser");
        String firstname = "Mikkeltest";
        String lastname = "Mikkelsen";
        String adress = "Gydevej 7";
        String city = "Farum";
        int zipcode = 3520;
        int phone = 12345678;
        String email = "Mikkel@hotmail.com";
        String password = "1234";
        User expResult = new User("Mikkeltest", "Mikkelsen", "Gydevej 7", "Farum", 3520, 12345678, "Mikkel@hotmail.com", "1234");
        UserFacade.createUser(firstname, lastname, adress, city, zipcode, phone, email, password);
        User result = UserFacade.readUser(18);
        UserFacade.deleteUser(18); // den sletter ikke,kan ikke se hvorfor queryen virker fint i sql
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getUser method, of class UserFacade.
     *//*
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        String email = "";
        String password = "";
        User expResult = null;
        User result = UserFacade.getUser(email, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
