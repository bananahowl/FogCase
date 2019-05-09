/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*
* Used to calcuate the price of the wood for the carport.
 */
package Logic;

import DataLayer.MaterialList;
import DataLayer.MetalParts;
import Logic.Facade.CarportFacade;
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
    
    
    public void printList(ArrayList <MaterialList> vals){
        System.out.println("----------------------");
    for(int i= 0; i< vals.size(); i ++ ){
        System.out.println(vals.get(i).toString());
    }
        System.out.println("---------- END ----------");
    }
    
    public ArrayList<MetalParts> metalParts(ArrayList <MaterialList> list ){

        ArrayList<MetalParts> partslist = new ArrayList();
        //double price = 5;
        //int amount = 0;
        //String name = "";
        int amountOfLumber = 0;

        for(int i = 0; i< list.size(); i++){
            
             amountOfLumber += list.get(i).getAmount();
             
             System.out.println("Amount of material: " + list.get(i).getAmount());
              
            }
         int bracketsAmount = amountOfLumber *3;
         int screwsAmount = bracketsAmount * 3;
         int boltsAmount = amountOfLumber * 2;
         
        MetalParts brackets = CarportFacade.Partscalc("Beslag, 10 i en pakke", bracketsAmount, 100);
        MetalParts screws = CarportFacade.Partscalc("Skruer med møtrik, 100 i en pakke", screwsAmount, 50);
        //MetalParts nut = CarportFacade.Partscalc(name, amount, price);
        MetalParts bolt = CarportFacade.Partscalc("Bolte, 50 i en pakke", boltsAmount, 150);
        partslist.add(brackets);
        partslist.add(screws);
        partslist.add(bolt);
        
        return partslist;
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
