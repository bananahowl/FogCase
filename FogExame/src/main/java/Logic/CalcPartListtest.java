/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;


import DataLayer.MaterialList;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author frizz
 */
public class CalcPartListtest {
    public static void main(String[] args) throws CarportException, SQLException {
        //ArrayList answer = CalcPartList.flatRoof();
        
        //System.out.println(answer);
        
        System.out.println("_____________________");
        
        //int answer1 = CalcPartList.calcShedMats();
        //System.out.println(answer1);
        
        System.out.println("______________________");
           
        MaterialList shedtest = CalcPartList.calcShedMats(270);
        MaterialList flattest = CalcPartList.flatRoof(600 , 350);
        MaterialList posttest = CalcPartList.calculatePortPost(350, 780);
        MaterialList rooftest = CalcPartList.calcRoofSides(350,700);
        MaterialList fronttest = CalcPartList.calcRoofFronts(30);
          
        ArrayList<MaterialList> superlist = CalcPartList.totalMaterial(shedtest, flattest, posttest, rooftest, fronttest);
        System.out.println(superlist);
        
        
        //superlist.get()
        
      
           
            
        
        System.out.println("______________________");
    }
    
}