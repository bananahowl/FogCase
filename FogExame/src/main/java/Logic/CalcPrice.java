/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    
}
