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

/**
 *
 * @author frederik
 */
public class CalcPartListtest {

    public static void main(String[] args) {
        //ArrayList answer = CalcPartList.flatRoof();
        //System.out.println(answer);
        System.out.println("_____________________");
        //int answer1 = CalcPartList.calcShedMats();
        //System.out.println(answer1);
        System.out.println("______________________");
        MaterialList shedtest = CalcPartList.calcShedMats(300,200);
        MaterialList spertest = CalcPartList.calcSper(700 , 400);
        MaterialList remtest = CalcPartList.calcRem(700, 400);
        MaterialList posttest = CalcPartList.calculatePortPost(400, 700);
        MaterialList rooftest = CalcPartList.calcRoofSides(400, 700, 15);
        MaterialList fronttest = CalcPartList.calcRoofFronts(400, 15);
        MaterialList verticaltest = CalcPartList.calcAngledVerticalSpær(400, 700, 15);
        MaterialList horizontaltest = CalcPartList.calcAngledHorizontalSpær(400, 700);
        System.out.println(shedtest);
        ArrayList<MaterialList> superlist = CalcPartList.totalMaterial(shedtest, spertest, remtest, posttest, rooftest, fronttest, verticaltest, horizontaltest);
        System.out.println(superlist);
        CalcPrice test = new CalcPrice();
        CalcPartList partTest = new CalcPartList();
        String shed = shedtest.toString();
        String spær = spertest.toString();
        String rem = remtest.toString();
        String post = posttest.toString();
        String roof = rooftest.toString();
        String front = fronttest.toString();
        String vertical = verticaltest.toString();
        String horizontal = horizontaltest.toString();
        System.out.println(shed);
        System.out.println(spær);
        System.out.println(rem);
        System.out.println(post);
        System.out.println(roof);
        System.out.println(front);
        System.out.println(vertical);
        System.out.println(horizontal);
        System.out.println("______________________");
        System.out.println(test.woodPrice(superlist));
        System.out.println("________xXX____________X_____");
        test.printList(superlist);
        System.out.println(verticaltest.getAmount());
        System.out.println("----------------------------");
        System.out.println(partTest.calcPostNail(3));
        //test.woodPrice(superlist);
        System.out.println("XXXX______");
        ArrayList<MetalParts> metaldele = test.metalParts(superlist);
        System.out.println(test.metalParts(superlist));
        System.out.println("______x____XX_____x___XXX__");
        System.out.println(test.metalPartsPrice(metaldele));
        CalcPartList tre = new CalcPartList();
        CalcPrice cp = new CalcPrice();
        Shed sh = new Shed(300, 220, 200);
        Carport carpot = new Carport(700,220,400, sh, 15,0);
        System.out.println("xxxxx");
        System.out.println(tre.totalpartlist(carpot));
        System.out.println("xx");
        System.out.println("___________________________");
        System.out.println(tre.totalcarportprice(300, 200, 400, 700, 15));
        System.out.println("_____________________________");
    }
}
