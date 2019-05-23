/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Facade;

import DataLayer.Carport;

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

   
    @Test
    public void testGetLengthShed() throws Exception {
        int result = CarportFacade.getShedlength(2);
        assertEquals(150, result);
    }

   
    @Test
    public void testGetCarportLength() throws Exception {
        int result = CarportFacade.getCarportLength(4);
        assertEquals(360, result);
    }

   
    @Test
    public void testGetCarportWidth() throws Exception {
        int result = CarportFacade.getCarportWidth(4);
        assertEquals(330, result);
    }


    @Test
    public void testGetMaxLength() throws Exception {
        int result = CarportFacade.getMaxLength();
        assertEquals(18,result);
    }

    @Test
    public void testGetMaxAngles() throws Exception {
        int result = CarportFacade.getMaxAngles();
        assertEquals(7, result);
    }

    
    @Test
    public void testGetMaxWidth() throws Exception {
        int result = CarportFacade.getMaxWidth();
        assertEquals(18, result);
    }

    @Test
    public void testGetShedwidth() throws Exception {
        int result = CarportFacade.getShedwidth(3);
        assertEquals(240, result);
    }

 
    @Test
    public void testGetMaxShedLength() throws Exception {
        int result = CarportFacade.getMaxShedLength();
        assertEquals(17,result);
    }


    @Test
    public void testGetMaxShedWidth() throws Exception {
        int result = CarportFacade.getMaxShedWidth();
        assertEquals(15,result);
    }


    @Test
    public void testGetShedlength() throws Exception {
        int result = CarportFacade.getShedlength(4);
        assertEquals(210, result);
    }


    @Test
    public void testGetRoofAngle() throws Exception {
        int result = CarportFacade.getRoofAngle(4);
        assertEquals(30, result);
    }

}
