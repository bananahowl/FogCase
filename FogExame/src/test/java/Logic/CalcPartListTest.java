/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import DataLayer.Carport;
import DataLayer.MaterialList;
import DataLayer.MetalParts;
import DataLayer.Shed;
import java.util.ArrayList;
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
public class CalcPartListTest {
    
    public CalcPartListTest() {
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
     * Test of calcRoofSides method, of class CalcPartList.
     */
    @Test
    public void testCalcRoofSides() throws Exception {
        System.out.println("calcRoofSides");
        int width = 400;
        int length = 700;
        int angleInDegree = 15;
        MaterialList expResult = new MaterialList(15, 434, "tagsten");
        MaterialList result = CalcPartList.calcRoofSides(width, length, angleInDegree);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcRoofFronts method, of class CalcPartList.
     */
    @Test
    public void testCalcRoofFronts() throws Exception {
        System.out.println("calcRoofFronts");
        int width = 400;
        int angleInDegree = 15;
        MaterialList expResult = new MaterialList(60, 14, "trægalver");
        MaterialList result = CalcPartList.calcRoofFronts(width, angleInDegree);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcShedMats method, of class CalcPartList.
     */
    @Test
    public void testCalcShedMats() throws Exception {
        System.out.println("calcShedMats");
        int length = 700;
        int width = 400;
        MaterialList expResult = null;
        MaterialList result = CalcPartList.calcShedMats(length, width);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of totalMaterial method, of class CalcPartList.
     */
    @Test
    public void testTotalMaterial() throws Exception {
        System.out.println("totalMaterial");
        MaterialList shed = null;
        MaterialList rem = null;
        MaterialList spær = null;
        MaterialList post = null;
        MaterialList roof = null;
        MaterialList front = null;
        MaterialList vertical = null;
        MaterialList horizontal = null;
        ArrayList<MaterialList> expResult = null;
        ArrayList<MaterialList> result = CalcPartList.totalMaterial(shed, rem, spær, post, roof, front, vertical, horizontal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of calcSper method, of class CalcPartList.
     */
    @Test
    public void testCalcSper() throws Exception {
        System.out.println("calcSper");
        int length = 700;
        int width = 400;
        MaterialList expResult = null;
        MaterialList result = CalcPartList.calcSper(length, width);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcRem method, of class CalcPartList.
     */
    @Test
    public void testCalcRem() throws Exception {
        System.out.println("calcRem");
        int length = 700;
        int width = 400;
        MaterialList expResult = null;
        MaterialList result = CalcPartList.calcRem(length, width);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculatePortPost method, of class CalcPartList.
     */
    @Test
    public void testCalculatePortPost() throws Exception {
        System.out.println("calculatePortPost");
        int width = 400;
        int length = 700;
        MaterialList expResult = null;
        MaterialList result = CalcPartList.calculatePortPost(width, length);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcAngledVerticalSpær method, of class CalcPartList.
     */
    @Test
    public void testCalcAngledVerticalSpær() throws Exception {
        System.out.println("calcAngledVerticalSp\u00e6r");
        int width = 400;
        int length = 700;
        int angleInDegree = 15;
        MaterialList expResult = null;
        MaterialList result = CalcPartList.calcAngledVerticalSpær(width, length, angleInDegree);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcAngledHorizontalSpær method, of class CalcPartList.
     */
    @Test
    public void testCalcAngledHorizontalSpær() throws Exception {
        System.out.println("calcAngledHorizontalSp\u00e6r");
        int width = 400;
        int length = 700;
        MaterialList expResult = null;
        MaterialList result = CalcPartList.calcAngledHorizontalSpær(width, length);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcPostNail method, of class CalcPartList.
     */
    @Test
    public void testCalcPostNail() {
        System.out.println("calcPostNail");
        int amount = 0;
        CalcPartList instance = new CalcPartList();
        int expResult = 0;
        int result = instance.calcPostNail(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addItem method, of class CalcPartList.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        MetalParts val = null;
        ArrayList<MetalParts> expResult = null;
        ArrayList<MetalParts> result = CalcPartList.addItem(val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of totalwoodprice method, of class CalcPartList.
     */
    @Test
    public void testTotalwoodprice() {
        System.out.println("totalwoodprice");
        int shedWidth = 300;
        int shedLength = 200;
        int width = 400;
        int length = 700;
        int angle = 15;
        int expResult = 15100;
        int result = CalcPartList.totalwoodprice(shedWidth, shedLength, width, length, angle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of totalpartlist method, of class CalcPartList.
     */
    @Test
    public void testTotalpartlist() {
        System.out.println("totalpartlist");
        int shedWidth = 300;
        int shedLength = 200;
        int width = 400;
        int length = 700;
        int angle = 15;
        ArrayList<MaterialList> expResult = null;
        Shed sh = new Shed(shedLength, 220, shedWidth);
        Carport cp = new Carport(length, 220, width, sh, angle, 0);
        ArrayList<MaterialList> result = CalcPartList.totalpartlist(cp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
