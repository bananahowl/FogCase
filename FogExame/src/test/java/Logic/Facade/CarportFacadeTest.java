/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Facade;

import DataLayer.Carport;
import DataLayer.CarportWithShed;
import DataLayer.DataMappers.CarportMapper;
import DataLayer.MetalParts;
import DataLayer.Shed;
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
public class CarportFacadeTest {
    
    public CarportFacadeTest() {
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
     * Test of getLengthShed method, of class CarportFacade.
     */
    @Test
    public void testGetLengthShed() throws Exception {
        int result = CarportFacade.getShedlength(2);
        assertEquals(150, result);
    }

    /**
     * Test of getCarportLength method, of class CarportFacade.
     */
    @Test
    public void testGetCarportLength() throws Exception {
        int result = CarportFacade.getCarportLength(4);
        assertEquals(360, result);
    }

    /**
     * Test of getCarportWidth method, of class CarportFacade.
     */
    @Test
    public void testGetCarportWidth() throws Exception {
        int result = CarportFacade.getCarportWidth(4);
        assertEquals(330, result);
    }

    /**
     * Test of getRoofMaterial method, of class CarportFacade.
     */
    @Test
    public void testGetRoofMaterial() throws Exception {
        String result = CarportFacade.getRoofMaterial(3);
        assertEquals("Plast", result);
    }

    /**
     * Test of getMatiralName method, of class CarportFacade.
     */
    @Test
    public void testGetMatiralName() throws Exception {
        String result = CarportFacade.getMatiralName(4);
        assertEquals("fyr" , result);
    }

    /**
     * Test of getmaxmatiralnum method, of class CarportFacade.
     */
    @Test
    public void testGetmaxmatiralnum() throws Exception {
        int result = CarportFacade.getmaxmatiralnum();
        assertEquals(4, result);
    }

    /**
     * Test of getMaxLength method, of class CarportFacade.
     */
    @Test
    public void testGetMaxLength() throws Exception {
        int result = CarportFacade.getMaxLength();
        assertEquals(18,result);
    }

    /**
     * Test of getMaxAngles method, of class CarportFacade.
     */
    @Test
    public void testGetMaxAngles() throws Exception {
        int result = CarportFacade.getMaxAngles();
        assertEquals(7, result);
    }

    /**
     * Test of getMaxWidth method, of class CarportFacade.
     */
    @Test
    public void testGetMaxWidth() throws Exception {
        int result = CarportFacade.getMaxWidth();
        assertEquals(18, result);
    }

    /**
     * Test of getMaxRoofMaterial method, of class CarportFacade.
     */
    @Test
    public void testGetMaxRoofMaterial() throws Exception {
        int result = CarportFacade.getMaxRoofMaterial();
        assertEquals(3, result);
    }

    /**
     * Test of getShedwidth method, of class CarportFacade.
     */
    @Test
    public void testGetShedwidth() throws Exception {
        int result = CarportFacade.getShedwidth(3);
        assertEquals(240, result);
    }

    /**
     * Test of getMaxShedLength method, of class CarportFacade.
     */
    @Test
    public void testGetMaxShedLength() throws Exception {
        int result = CarportFacade.getMaxShedLength();
        assertEquals(20,result);
    }

    /**
     * Test of getMaxShedWidth method, of class CarportFacade.
     */
    @Test
    public void testGetMaxShedWidth() throws Exception {
        int result = CarportFacade.getMaxShedWidth();
        assertEquals(19,result);
    }

    /**
     * Test of getShedlength method, of class CarportFacade.
     */
    @Test
    public void testGetShedlength() throws Exception {
        int result = CarportFacade.getShedlength(4);
        assertEquals(210, result);
    }

    /**
     * Test of getRoofAngle method, of class CarportFacade.
     */
    @Test
    public void testGetRoofAngle() throws Exception {
        int result = CarportFacade.getRoofAngle(4);
        assertEquals(30, result);
    }
}
