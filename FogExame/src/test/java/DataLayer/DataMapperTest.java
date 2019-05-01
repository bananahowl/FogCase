/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fskn
 */
public class DataMapperTest {
    
    public DataMapperTest() {
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
     * Test of getMatiralName method, of class DataMapper.
     */
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
    public void testGetMaxWidth() throws Exception {
        System.out.println("getMaxWidth");
        int expResult = 0;
        int result = DataMapper.getMaxWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxShedWidth method, of class DataMapper.
     */
    @Test
    public void testGetMaxShedWidth() throws Exception {
        System.out.println("getMaxShedWidth");
        int expResult = 0;
        int result = DataMapper.getMaxShedWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxShedLength method, of class DataMapper.
     */
    @Test
    public void testGetMaxShedLength() throws Exception {
        System.out.println("getMaxShedLength");
        int expResult = 0;
        int result = DataMapper.getMaxShedLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxRoofMaterial method, of class DataMapper.
     */
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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
