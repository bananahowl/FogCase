/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import DataLayer.MaterialList;
import DataLayer.MetalParts;
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
public class CalcPriceTest {
    
    public CalcPriceTest() {
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
        int shedWidth = 300;
        int shedLength = 200;
        int angleInDegree = 15;
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of woodPrice method, of class CalcPrice.
     */
    
   @Test
    public void testWoodPrice() throws Exception {
        System.out.println("woodPrice");
        int expResult = 14850;
        
        int length = 700;
        int width = 400;
        int shedWidth = 200;
        int shedLength = 300;
        int angleInDegree = 15;
        
        MaterialList shedtrue = CalcPartList.calcShedMats(shedLength, shedWidth);
        MaterialList spertrue = CalcPartList.calcSper(length , width);
        MaterialList remtrue = CalcPartList.calcRem(length, width);
        MaterialList posttrue = CalcPartList.calculatePortPost(width, length);
        MaterialList rooftrue = CalcPartList.calcRoofSides(width, length, angleInDegree);
        MaterialList fronttrue = CalcPartList.calcRoofFronts(width, angleInDegree);
        MaterialList verticaltrue = CalcPartList.calcAngledVerticalSpær(width, length, angleInDegree);
        MaterialList horizontaltrue = CalcPartList.calcAngledHorizontalSpær(width, length);
        ArrayList<MaterialList> list = CalcPartList.totalMaterial(shedtrue, remtrue, spertrue, posttrue, 
                rooftrue, fronttrue, verticaltrue, horizontaltrue);
       
        CalcPrice instance = new CalcPrice();
        int result = instance.woodPrice(list);
        assertEquals(expResult, result);
        
    }


 @Test
    public void testMetalParts() throws Exception{
        System.out.println("metalParts");
        int length = 700;
        int width = 400;
        int shedWidth = 200;
        int shedLength = 300;
        int angleInDegree = 15;
        
        ArrayList<MetalParts> explist1 = new ArrayList<MetalParts>();
        MetalParts beslag =new MetalParts("Beslag, 10 i en pakke", 11, 100) ;
        MetalParts skruer =new MetalParts("Skruer med møtrik, 100 i en pakke", 3, 50) ;
        MetalParts søm = new MetalParts("Søm, 100 i en pakke", 7, 50) ;
        MetalParts bolte = new MetalParts("Bolte, 50 i en pakke", 7, 150);
        explist1.add(beslag);
        explist1.add(skruer);
        explist1.add(bolte);
        explist1.add(søm);
        
        
        

        
        MaterialList shedtrue = CalcPartList.calcShedMats(shedLength, shedWidth);
        MaterialList spertrue = CalcPartList.calcSper(length , width);
        MaterialList remtrue = CalcPartList.calcRem(length, width);
        MaterialList posttrue = CalcPartList.calculatePortPost(width, length);
        MaterialList rooftrue = CalcPartList.calcRoofSides(width, length, angleInDegree);
        MaterialList fronttrue = CalcPartList.calcRoofFronts(width, angleInDegree);
        MaterialList verticaltrue = CalcPartList.calcAngledVerticalSpær(width, length, angleInDegree);
        MaterialList horizontaltrue = CalcPartList.calcAngledHorizontalSpær(width, length);
        ArrayList<MaterialList> list = CalcPartList.totalMaterial(shedtrue, remtrue, spertrue, posttrue, 
                rooftrue, fronttrue, verticaltrue, horizontaltrue);
        CalcPrice instance = new CalcPrice();
        ArrayList<MetalParts> result = instance.metalParts(list);
        assertEquals(explist1, result);
    }

   
    @Test
    public void testMetalPartsPrice() {
        System.out.println("metalPartsPrice");
        double expResult = 2650.0;
        
        
        ArrayList<MetalParts> list = new ArrayList<MetalParts>();
        MetalParts beslag = new MetalParts("Beslag, 10 i en pakke", 11, 100) ;
        MetalParts skruer = new MetalParts("Skruer med møtrik, 100 i en pakke", 3, 50) ;
        MetalParts søm = new MetalParts("Søm, 100 i en pakke", 7, 50) ;
        MetalParts bolte = new MetalParts("Bolte, 50 i en pakke", 7, 150);
        list.add(beslag);
        list.add(skruer);
        list.add(bolte);
        list.add(søm);
        CalcPrice instance = new CalcPrice();
        
        double result = instance.metalPartsPrice(list);
        assertEquals(expResult, result, 0.0);
    }
 

}
