
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
        UserFacade.deleteUser(18);
        assertEquals(expResult, result);
        
    }
    
}
