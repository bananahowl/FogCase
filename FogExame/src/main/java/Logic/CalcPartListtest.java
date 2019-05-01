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
           
        ArrayList<MaterialList> shedtest = CalcPartList.calcShedMats(270);
        ArrayList<MaterialList> flattest = CalcPartList.flatRoof(600 , 350);
        ArrayList<MaterialList> posttest = CalcPartList.calculatePortPost(350, 780);
          
        ArrayList<MaterialList> superlist = CalcPartList.totalMaterial(shedtest, flattest, posttest);
        System.out.println(superlist);
        //tostring
          for(int i = 0; i< superlist.size(); i++){
               System.out.println( superlist.get(i));
           
          }
          CalcPrice test = new CalcPrice();
          
          
      
        System.out.println("______________________ \n");
        
        System.out.println(test.woodPrice(superlist));
    }
    
}
