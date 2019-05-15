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
 * @author frizz
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
        String firstname = "";
        String lastname = "";
        String adress = "";
        String city = "";
        int zipcode = 0;
        int phone = 0;
        String email = "";
        String password = "";
        User expResult = null;
        User result = UserFacade.createUser(firstname, lastname, adress, city, zipcode, phone, email, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class UserFacade.
     */
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
    }
    
}
