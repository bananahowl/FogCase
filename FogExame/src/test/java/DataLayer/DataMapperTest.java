/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import Logic.CarportException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author emils
 */
public class DataMapperTest {
    private static Connection testConnection;
    private static String USER = "test";
    private static String USERPW = "password123!";
    private static String DBNAME = "Fogdatabase";
    private static String HOST = "167.99.222.203";
    private static final String URL = "jdbc:mysql://167.99.222.203:3306/Fogdatabase";
    private static final String USERNAME = "test";
    private static final String PASSWORD = "password123!";

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        try {
            // awoid making a new connection for each test
            if ( testConnection == null ) {
                String url = String.format( "jdbc:mysql://%s:3306/%s", HOST, DBNAME );
                Class.forName( "com.mysql.cj.jdbc.Driver" );

                testConnection = DriverManager.getConnection( url, USER, USERPW );
                // Make mappers use test 
                Connector.setConnection( testConnection );
            }
//            // reset test database
//            try ( Statement stmt = testConnection.createStatement() ) {
//                stmt.execute( "drop table if exists Users" );
//                stmt.execute( "create table Users like UsersTest" );
//                stmt.execute( "insert into Users select * from UsersTest" );
//            }

        } catch ( ClassNotFoundException | SQLException ex ) {
            testConnection = null;
            System.out.println( "Could not open connection to database: " + ex.getMessage() );
        }
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSetUpOK() {
        // Just check that we have a connection.
        assertNotNull( testConnection );
    }

    @Test
    public void testLogin01() throws CarportException {
        // Can we log in
        User user = DataMapper.login( "customer@test.com", "123" );
        assertTrue( user != null );
    }

    @Test( expected = CarportException.class )
    public void testLogin02() throws CarportException {
        // We should get an exception if we use the wrong password
        User user = DataMapper.login( "customer@test.com", "larsen" );
    }

    /**
     * Test of getMatiralName method, of class DataMapper.
     */
    @org.junit.Test
    public void testGetMatiralName() throws Exception {
        System.out.println("getMatiralName");
        int id = 0;
        String expResult = "";
        String result = DataMapper.getMatiralName(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createUser method, of class DataMapper.
     */
    @org.junit.Test
    public void testCreateUser() throws Exception {
        System.out.println("createUser");
        User user = null;
        DataMapper.createUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getmaxmatiralnum method, of class DataMapper.
     */
    @org.junit.Test
    public void testGetmaxmatiralnum() throws Exception {
        System.out.println("getmaxmatiralnum");
        int expResult = 0;
        int result = DataMapper.getmaxmatiralnum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxLength method, of class DataMapper.
     */
    @org.junit.Test
    public void testGetMaxLength() throws Exception {
        System.out.println("getMaxLength");
        int expResult = 0;
        int result = DataMapper.getMaxLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxAngles method, of class DataMapper.
     */
    @org.junit.Test
    public void testGetMaxAngles() throws Exception {
        System.out.println("getMaxAngles");
        int expResult = 0;
        int result = DataMapper.getMaxAngles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxWidth method, of class DataMapper.
     */
    @org.junit.Test
    public void testGetMaxWidth() throws Exception {
        System.out.println("getMaxWidth");
        int expResult = 0;
        int result = DataMapper.getMaxWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxRoofMaterial method, of class DataMapper.
     */
    @org.junit.Test
    public void testGetMaxRoofMaterial() throws Exception {
        System.out.println("getMaxRoofMaterial");
        int expResult = 0;
        int result = DataMapper.getMaxRoofMaterial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoofMaterial method, of class DataMapper.
     */
    @org.junit.Test
    public void testGetRoofMaterial() throws Exception {
        System.out.println("getRoofMaterial");
        int id = 0;
        String expResult = "";
        String result = DataMapper.getRoofMaterial(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getwidth method, of class DataMapper.
     */
    @org.junit.Test
    public void testGetwidth() throws Exception {
        System.out.println("getwidth");
        int id = 0;
        int expResult = 0;
        int result = DataMapper.getwidth(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getlength method, of class DataMapper.
     */
    @org.junit.Test
    public void testGetlength() throws Exception {
        System.out.println("getlength");
        int id = 0;
        int expResult = 0;
        int result = DataMapper.getlength(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShedwidth method, of class DataMapper.
     */
    @org.junit.Test
    public void testGetShedwidth() throws Exception {
        System.out.println("getShedwidth");
        int id = 0;
        int expResult = 0;
        int result = DataMapper.getShedwidth(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShedlength method, of class DataMapper.
     */
    @org.junit.Test
    public void testGetShedlength() throws Exception {
        System.out.println("getShedlength");
        int id = 0;
        int expResult = 0;
        int result = DataMapper.getShedlength(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoofAngle method, of class DataMapper.
     */
    @org.junit.Test
    public void testGetRoofAngle() throws Exception {
        System.out.println("getRoofAngle");
        int id = 0;
        int expResult = 0;
        int result = DataMapper.getRoofAngle(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
