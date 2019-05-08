/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import DataLayer.DataMappers.CarportMapper;
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
        String result = CarportMapper.getMatiralName(1);
        assertEquals("birk", result);
    }
    
    /**
     * Test of getmaxmatiralnum method, of class DataMapper.
     */
    @Test
    public void testGetmaxmatiralnum() throws Exception {
        int result = CarportMapper.getmaxmatiralnum();
        assertEquals(4, result);
    }

    /**
     * Test of getMaxLength method, of class DataMapper.
     */
    @Test
    public void testGetMaxLength() throws Exception {
        int result = CarportMapper.getMaxLength();
        assertEquals(18, result);
    }

    /**
     * Test of getMaxAngles method, of class DataMapper.
     */
    @Test
    public void testGetMaxAngles() throws Exception {
        int result = CarportMapper.getMaxAngles();
        assertEquals(7, result);
    }

    /**
     * Test of getMaxWidth method, of class DataMapper.
     */
    @Test
    public void testGetMaxWidth() throws Exception {
        int result = CarportMapper.getMaxWidth();
        assertEquals(18, result);
    }

    /**
     * Test of getMaxShedWidth method, of class DataMapper.
     */
    @Test
    public void testGetMaxShedWidth() throws Exception {
        int result = CarportMapper.getMaxShedWidth();
        assertEquals(19, result);
    }

    /**
     * Test of getMaxShedLength method, of class DataMapper.
     */
    @Test
    public void testGetMaxShedLength() throws Exception {
        int result = CarportMapper.getMaxShedLength();
        assertEquals(20,result);
    }

    /**
     * Test of getMaxRoofMaterial method, of class DataMapper.
     */
    @Test
    public void testGetMaxRoofMaterial() throws Exception {
        int result = CarportMapper.getMaxRoofMaterial();
        assertEquals(3, result);
    }

    /**
     * Test of getRoofMaterial method, of class DataMapper.
     */
    @Test
    public void testGetRoofMaterial() throws Exception {
        String result = CarportMapper.getRoofMaterial(3);
        assertEquals("plast", result);
    }

    /**
     * Test of getwidth method, of class DataMapper.
     */
    @Test
    public void testGetwidth() throws Exception {
        int result = CarportMapper.getwidth(2);
        assertEquals(270, result);
    }
    
    @Test
    public void testGetwidth2() throws Exception {
        int result = CarportMapper.getwidth(1);
        assertEquals(240, result);
    }

    /**
     * Test of getlength method, of class DataMapper.
     */
    @Test
    public void testGetlength() throws Exception {
        int result = CarportMapper.getlength(1);
        assertEquals(270, result);
    }

    /**
     * Test of getShedwidth method, of class DataMapper.
     */
    @Test
    public void testGetShedwidth() throws Exception {
        int result = CarportMapper.getShedwidth(4);
        assertEquals(270, result);
    }

    /**
     * Test of getShedlength method, of class DataMapper.
     */
    @Test
    public void testGetShedlength() throws Exception {
        int result = CarportMapper.getShedlength(4);
        assertEquals(210, result);
    }

    /**
     * Test of getRoofAngle method, of class DataMapper.
     */
    @Test
    public void testGetRoofAngle() throws Exception {
        int result = CarportMapper.getRoofAngle(4);
        assertEquals(30, result);
    }
    
}
