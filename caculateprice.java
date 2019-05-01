/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*
* Used to calcuate the price of the wood for the carport.
 */
package Logic;

import DataLayer.MaterialList;
import java.util.ArrayList;

/**
 *
 * @author ahmed
 */
public class CalcPrice {

    public int woodPrice(ArrayList <MaterialList> list ){

        int lenghtVal = 10;
        int price = 5;
        int total = 0;


         for(int i = 0; i< list.size(); i++){
            total +=(( list.get(i).getAmount() *  list.get(i).getLength()) /lenghtVal ) * price ;
               System.out.println( list.get(i));

               System.out.println("Lenght of material: "+ list.get(i).getLength());
               System.out.println("Amount of material: "+list.get(i).getAmount());
               System.out.println("-------------");
               System.out.println( "current total: " + total);

          }
        return total ;
        }

/* sample for test

/*

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

          
*/
}
