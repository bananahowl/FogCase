/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import DataLayer.Carport;
import DataLayer.MaterialList;
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
 * @author frederik
 */

public class CalcPartListTest {

    protected int length, width, angleInDegree;
    

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
        int shedWidth = 300;
        int shedLength = 200;
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
        int length = 700;
        int width = 400;
        int angleInDegree = 15;
        
        MaterialList expResult = new MaterialList(15, 434, "tagsten");
        MaterialList result = CalcPartList.calcRoofSides(width, length, angleInDegree);
        assertEquals(expResult, result);
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
    }

    /**
     * Test of calcShedMats method, of class CalcPartList.
     */

    @Test
    public void testCalcShedMats() throws Exception {
        System.out.println("calcShedMats");
        int length = 700;
        int width = 400;
        
        MaterialList expResult = new MaterialList(220, 38, "skurplanker");
        MaterialList result = CalcPartList.calcShedMats(length, width);
        assertEquals(expResult, result);
    }

    /**
     * Test of totalMaterial method, of class CalcPartList.
     */

    @Test
    public void testTotalMaterial() throws Exception {
        System.out.println("totalMaterial");
        int length = 700;
        int width = 400;
        int angleInDegree = 15;
        int shedWidth = 200;
        int shedLength = 300;
        ArrayList<MaterialList> expResult = new ArrayList<MaterialList>
        (Arrays.asList( 
                new MaterialList(220, 16, "skurplanker"), new MaterialList(750, 2, "rem"),
                new MaterialList(430, 14, "spær"), new MaterialList(310, 10, "stolper"),
                new MaterialList(15, 434, "tagsten"), new MaterialList(60, 14, "trægalver"),
                new MaterialList(207, 14, "vertikalespær"), new MaterialList(760, 7, "horizontalespær")));
        MaterialList shedtrue = CalcPartList.calcShedMats(shedLength, shedWidth);
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
    }


    /**
     * Test of calcSper method, of class CalcPartList.
     */

    @Test
    public void testCalcSper() throws Exception {
        System.out.println("calcSper");
        int length = 700;
        int width = 400;
        
        MaterialList expResult = new MaterialList(430, 14, "spær");
        MaterialList result = CalcPartList.calcSper(length, width);
        assertEquals(expResult, result);
    }

    /**
     * Test of calcRem method, of class CalcPartList.
     */

    @Test
    public void testCalcRem() throws Exception {
        System.out.println("calcRem");
        int length = 700;
        int width = 400;
        
        MaterialList expResult = new MaterialList(750, 2, "rem");
        MaterialList result = CalcPartList.calcRem(length, width);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculatePortPost method, of class CalcPartList.
     */

    @Test
    public void testCalculatePortPost() throws Exception {
        System.out.println("calculatePortPost");
        int length = 700;
        int width = 400;
        
        MaterialList expResult = new MaterialList(310, 10, "stolper");
        MaterialList result = CalcPartList.calculatePortPost(width, length);
        assertEquals(expResult, result);
    }

    /**
     * Test of calcAngledVerticalSpær method, of class CalcPartList.
     */

    @Test
    public void testCalcAngledVerticalSper() throws Exception {
        System.out.println("calcAngledVerticalSper");
        int length = 700;
        int width = 400;
        int angleInDegree = 15;
        MaterialList expResult = new MaterialList(207, 14, "vertikalespær");
        MaterialList result = CalcPartList.calcAngledVerticalSpær(width, length, angleInDegree);
        assertEquals(expResult, result);
    }

    /**
     * Test of calcAngledHorizontalSpær method, of class CalcPartList.
     */

    @Test
    public void testCalcAngledHorizontalSper() throws Exception {
        System.out.println("calcAngledHorizontalSper");
        int length = 700;
        int width = 400;
        
        MaterialList expResult = new MaterialList(760, 7, "horizontalespær");
        MaterialList result = CalcPartList.calcAngledHorizontalSpær(width, length);
        assertEquals(expResult, result);
    }

    @Test
    public void testTotalwoodprice() {
        System.out.println("totalwoodprice");
        int length = 700;
        int width = 400;
        int shedWidth = 200;
        int shedLength = 300;
        int angleInDegree = 15;
       
        int expResult = 16710;
        int result = CalcPartList.totalcarportprice(shedWidth, shedLength, width, length, angleInDegree);
        assertEquals(expResult, result);
    }

    /**
     * Test of totalpartlist method, of class CalcPartList.
     */

    @Test
    public void testTotalpartlist() {
        System.out.println("totalpartlist");
          int length = 700;
        int width = 400;
        int shedWidth = 300;
        int shedLength = 200;
        int angleInDegree = 15;
      
        
        Shed shexp = new Shed(shedLength, 220, shedWidth);
        Carport cpexp = new Carport(length, 220, width, shexp, angleInDegree, 0);
        ArrayList<MaterialList> expResult = new ArrayList<MaterialList>
        (Arrays.asList( 
                new MaterialList(220, 16, "skurplanker"), new MaterialList(430, 14, "spær"),
                new MaterialList(750, 2, "rem"), new MaterialList(310, 10, "stolper"),
                new MaterialList(15, 434, "tagsten"), new MaterialList(60, 14, "trægalver"),
                new MaterialList(207, 14, "vertikalespær"), new MaterialList(760, 7, "horizontalespær")));
        
        
        
        Shed sh = new Shed(shedLength, 220, shedWidth);
        Carport cp = new Carport(length, 220, width, sh, angleInDegree, 0);
        ArrayList<MaterialList> result = CalcPartList.totalpartlist(cp);
        assertEquals(expResult, result);
    }
    
}
