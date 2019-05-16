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
public  class CalcPrice {

    public int woodPrice(ArrayList<MaterialList> list) {

        int lenghtVal = 10;
        int price = 5;
        int total = 0;

        for (int i = 0; i < list.size(); i++) {
            total += ((list.get(i).getAmount() * list.get(i).getLength()) / lenghtVal) * price;
            /*System.out.println(list.get(i));
            System.out.println("Material: " + list.get(i).getDescription());
            System.out.println("Lenght of material: " + list.get(i).getLength());
            System.out.println("Amount of material: " + list.get(i).getAmount());
            System.out.println("-------------");
            System.out.println("current total: " + total);*/

        }
        return total;
    }

    public void printList(ArrayList<MaterialList> vals) {
        System.out.println("----------------------");
        for (int i = 0; i < vals.size(); i++) {
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
        
        int amountOfNails = 0;
        int amountOfBolts = 0;
        int amountOfScews = 0;
        int amountOfBrackets = 0;

        for(int i = 0; i< list.size(); i++){
            if(list.get(i).getDescription() == "trægavler"){
            amountOfNails +=4;
            }
            
            if(list.get(i).getDescription() == "skurplanker"){
            amountOfNails += list.get(i).getAmount() *4;
            }
            
            if(list.get(i).getDescription() == "spær"){
            amountOfBrackets += list.get(i).getAmount() *2;
            amountOfScews += list.get(i).getAmount() *9;
            amountOfBolts += list.get(i).getAmount() *9;
            }
            
            if(list.get(i).getDescription() == "rem"){       
            }
            
            if(list.get(i).getDescription() == "stolper"){
            amountOfNails += list.get(i).getAmount() *2;
            amountOfBolts += list.get(i).getAmount() *2;
            }
            
            if(list.get(i).getDescription() == "vertikalespær"){
            amountOfBrackets += list.get(i).getAmount() *6;
            amountOfScews += list.get(i).getAmount() *18;
            amountOfBolts += list.get(i).getAmount() *18;
            }
            
            if(list.get(i).getDescription() == "horizontalespær"){
            amountOfNails += 2*(list.get(i).getAmount() *list.get(i-1).getAmount() *2);
            }
            
             amountOfLumber += list.get(i).getAmount();

             System.out.println("Amount of material: " + list.get(i).getAmount());
            }
        
         int bracketsAmount = (int )Math.ceil(amountOfBrackets /10);
         int screwsAmount = (int ) Math.ceil( amountOfScews /100);
         int boltsAmount =(int )Math.ceil(amountOfBolts / 50);
         int nailsAmount =(int )Math.ceil(amountOfNails/ 100);
         
        MetalParts brackets = CreateCarport.Partscalc("Beslag, 10 i en pakke", bracketsAmount, 100);
        MetalParts screws = CreateCarport.Partscalc("Skruer med møtrik, 100 i en pakke", screwsAmount, 50);
        MetalParts nails = CreateCarport.Partscalc("Søm, 100 i en pakke", boltsAmount, 50);
        //MetalParts nut = CarportFacade.Partscalc(name, amount, price);
        MetalParts bolt = CreateCarport.Partscalc("Bolte, 50 i en pakke", boltsAmount, 150);
        partslist.add(brackets);
        partslist.add(screws);
        partslist.add(bolt);
        partslist.add(nails);
        
        return partslist;

    }
    
    public double metalPartsPrice(ArrayList <MetalParts> list )
    {
        double totalprice = 0;
         for(int i = 0; i< list.size(); i++){
             totalprice += (double) list.get(i).getPrice() * list.get(i).getAmount();
         }
        return totalprice;
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
