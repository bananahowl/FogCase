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
<<<<<<< HEAD
           
        MaterialList shedtest = CalcPartList.calcShedMats(700,500);
        MaterialList spertest = CalcPartList.calcSper(700 , 400);
=======

        MaterialList shedtest = CalcPartList.calcShedMats(700);
        MaterialList spertest = CalcPartList.calcSper(700, 400);
>>>>>>> work0705
        MaterialList remtest = CalcPartList.calcRem(700, 400);
        MaterialList posttest = CalcPartList.calculatePortPost(400, 700);
        MaterialList rooftest = CalcPartList.calcRoofSides(400, 700, 25);
        MaterialList fronttest = CalcPartList.calcRoofFronts(400, 25);
        MaterialList verticaltest = CalcPartList.calcAngledVerticalSpær(400, 700, 25);
        MaterialList horizontaltest = CalcPartList.calcAngledHorizontalSpær(400, 700);

        ArrayList<MaterialList> superlist = CalcPartList.totalMaterial(shedtest, spertest, remtest, posttest, rooftest, fronttest, verticaltest, horizontaltest);
        System.out.println(superlist);
/*
        for (int i = 0; i < superlist.size(); i++) {

            System.out.println(superlist.get(i).getAmount());
            System.out.println(superlist.get(i).getLength());
            System.out.println(superlist.get(i).getDescription());
        }*/
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

        test.woodPrice(superlist);

        test.printList(superlist);

        System.out.println(verticaltest.getAmount());
        System.out.println("----------------------------");
        System.out.println(partTest.calcPostNail(3));

        //test.woodPrice(superlist);
    }

}
