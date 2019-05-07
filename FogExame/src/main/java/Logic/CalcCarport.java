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
 * @author ahmed
 */
public class CalcCarport {
    /*
    public ArrayList<MaterialList> roofType(boolean angle) throws CarportException, SQLException{
    if(angle == true){
        return calculateCarPortAngle(0, 0, 0, 0, 0);
    }
    else{
        return calculateCarPortFlat(0, 0, 0, 0, 0);
    }
    }*/
    
    public ArrayList <MaterialList> calculateCarPortFlat(int sheedlength, int sheedwidth, int portwidth, int portlength, int angleInDegree) throws CarportException, SQLException{
    CalcPartList portlist = new CalcPartList();
    MaterialList shedtest = CalcPartList.calcShedMats(sheedlength);
        MaterialList spertest = CalcPartList.calcSper(portlength , portwidth);
        MaterialList remtest = CalcPartList.calcRem(portlength, portwidth);
        MaterialList posttest = CalcPartList.calculatePortPost(portlength, portwidth);
        MaterialList rooftest = CalcPartList.calcRoofSides(portwidth,portlength, angleInDegree);
        MaterialList fronttest = CalcPartList.calcRoofFronts(portwidth, 0);
        MaterialList verticaltest = CalcPartList.calcAngledVerticalSpær(portwidth, portlength, 0);
        MaterialList horizontaltest = CalcPartList.calcAngledHorizontalSpær(portwidth, portlength);
          
        ArrayList<MaterialList> superlist = CalcPartList.totalMaterial(shedtest, spertest, remtest, posttest, rooftest, fronttest, verticaltest, horizontaltest);
        System.out.println(superlist);
    
        return superlist;
    }
 
    public ArrayList <MaterialList> calculateCarPortAngle(int sheedlength, int sheedwidth, int portwidth, int portlength, int angleInDegree) throws CarportException, SQLException{
    CalcPartList portlist = new CalcPartList();
    MaterialList shedtest = CalcPartList.calcShedMats(sheedlength);
        MaterialList spertest = CalcPartList.calcSper(portlength , portwidth);
        MaterialList remtest = CalcPartList.calcRem(portlength, portwidth);
        MaterialList posttest = CalcPartList.calculatePortPost(portlength, portwidth);
        MaterialList rooftest = CalcPartList.calcRoofSides(portwidth,portlength, angleInDegree);
        MaterialList fronttest = CalcPartList.calcRoofFronts(portwidth, angleInDegree);
        MaterialList verticaltest = CalcPartList.calcAngledVerticalSpær(portwidth, portlength, angleInDegree);
        MaterialList horizontaltest = CalcPartList.calcAngledHorizontalSpær(portwidth, portlength);
          
        ArrayList<MaterialList> superlist = CalcPartList.totalMaterial(shedtest, spertest, remtest, posttest, rooftest, fronttest, verticaltest, horizontaltest);
        System.out.println(superlist);
    
        return superlist;
    }
            
}
