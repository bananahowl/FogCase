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
import java.util.Arrays;
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
<<<<<<< HEAD
   /* 
=======
    protected int length, width, angleInDegree;
    
>>>>>>> afab65fd8e62fbfd3ef8229b34231d4209bac1e4
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
        int length = 700;
        int width = 400;
        int angleInDegree = 15;
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcRoofSides method, of class CalcPartList.
     */
/*
    @Test
    public void testCalcRoofSides() throws Exception {
        System.out.println("calcRoofSides");

        
        MaterialList expResult = new MaterialList(15, 434, "tagsten");
        MaterialList result = CalcPartList.calcRoofSides(width, length, angleInDegree);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcRoofFronts method, of class CalcPartList.
     */
/*
    @Test
    public void testCalcRoofFronts() throws Exception {
        System.out.println("calcRoofFronts");
        
        MaterialList expResult = new MaterialList(60, 14, "trægalver");
        MaterialList result = CalcPartList.calcRoofFronts(width, angleInDegree);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcShedMats method, of class CalcPartList.
     */
/*
    @Test
    public void testCalcShedMats() throws Exception {
        System.out.println("calcShedMats");
        
        MaterialList expResult = new MaterialList(700, 38, "skurplanker");
        MaterialList result = CalcPartList.calcShedMats(length, width);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of totalMaterial method, of class CalcPartList.
     */
/*
    @Test
    public void testTotalMaterial() throws Exception {
        System.out.println("totalMaterial");
        ArrayList<MaterialList> expResult = new ArrayList<MaterialList>
        (Arrays.asList( 
                new MaterialList(700, 38, "skurplanker"), new MaterialList(750, 2, "rem"),
                new MaterialList(430, 14, "spær"), new MaterialList(310, 10, "stolper"),
                new MaterialList(15, 434, "tagsten"), new MaterialList(60, 14, "trægalver"),
                new MaterialList(207, 14, "vertikalespær"), new MaterialList(760, 7, "horizontalespær")));
        MaterialList shedtrue = CalcPartList.calcShedMats(length, width);
        MaterialList spertrue = CalcPartList.calcSper(length , width);
        MaterialList remtrue = CalcPartList.calcRem(length, width);
        MaterialList posttrue = CalcPartList.calculatePortPost(width, length);
        MaterialList rooftrue = CalcPartList.calcRoofSides(width, length, angleInDegree);
        MaterialList fronttrue = CalcPartList.calcRoofFronts(width, angleInDegree);
        MaterialList verticaltrue = CalcPartList.calcAngledVerticalSpær(width, length, angleInDegree);
        MaterialList horizontaltrue = CalcPartList.calcAngledHorizontalSpær(width, length);
        ArrayList<MaterialList> result = CalcPartList.totalMaterial(shedtrue, remtrue, spertrue, posttrue, 
                rooftrue, fronttrue, verticaltrue, horizontaltrue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of calcSper method, of class CalcPartList.
     */
/*
    @Test
    public void testCalcSper() throws Exception {
        System.out.println("calcSper");
        
        MaterialList expResult = new MaterialList(430, 14, "spær");
        MaterialList result = CalcPartList.calcSper(length, width);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcRem method, of class CalcPartList.
     */
/*
    @Test
    public void testCalcRem() throws Exception {
        System.out.println("calcRem");
        
        MaterialList expResult = new MaterialList(750, 2, "rem");
        MaterialList result = CalcPartList.calcRem(length, width);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculatePortPost method, of class CalcPartList.
     */
/*
    @Test
    public void testCalculatePortPost() throws Exception {
        System.out.println("calculatePortPost");
        
        MaterialList expResult = new MaterialList(310, 10, "stolper");
        MaterialList result = CalcPartList.calculatePortPost(width, length);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcAngledVerticalSpær method, of class CalcPartList.
     */
/*
    @Test
    public void testCalcAngledVerticalSper() throws Exception {
        System.out.println("calcAngledVerticalSper");
        
        MaterialList expResult = new MaterialList(207, 14, "vertikalespær");
        MaterialList result = CalcPartList.calcAngledVerticalSpær(width, length, angleInDegree);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcAngledHorizontalSpær method, of class CalcPartList.
     */
/*
    @Test
    public void testCalcAngledHorizontalSper() throws Exception {
        System.out.println("calcAngledHorizontalSper");
       
        MaterialList expResult = new MaterialList(760, 7, "horizontalespær");
        MaterialList result = CalcPartList.calcAngledHorizontalSpær(width, length);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcPostNail method, of class CalcPartList.
     */
/*
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
*/
    /**
     * Test of addItem method, of class CalcPartList.
     */
/*
   public void testAddItem() {
        System.out.println("addItem");
        MetalParts val = null;
        ArrayList<MetalParts> expResult = null;
        ArrayList<MetalParts> result = CalcPartList.addItem(val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of totalwoodprice method, of class CalcPartList.
     */
/*
    @Test
    public void testTotalwoodprice() {
        System.out.println("totalwoodprice");
        int shedWidth = 300;
        int shedLength = 200;
     
       
        int expResult = 15100;
        int result = CalcPartList.totalwoodprice(shedWidth, shedLength, width, length, angleInDegree);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of totalpartlist method, of class CalcPartList.
     */
/*
    @Test
    public void testTotalpartlist() {
        System.out.println("totalpartlist");
        int shedWidth = 300;
        int shedLength = 200;
      
        ArrayList<MaterialList> expResult = null;
        Shed sh = new Shed(shedLength, 220, shedWidth);
        Carport cp = new Carport(length, 220, width, sh, angleInDegree, 0);
        ArrayList<MaterialList> result = CalcPartList.totalpartlist(cp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    */
}
