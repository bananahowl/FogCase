/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import DataLayer.DataMapper;
import java.sql.SQLException;

/**
 *
 * @author frizz
 */
public class CalcPartList {
    
    private static int calcArealRoof() throws CarportException, SQLException
    {
        //Til udregningen af selve taget på en carport
        
        int angleInDegree = DataMapper.getRoofAngle(1);
        int angleTop = 180 - angleInDegree - angleInDegree;
        int width = DataMapper.getShedwidth(1);
        int length = DataMapper.getShedlength(1);
        int angleInRadian = (int) Math.toRadians(angleInDegree);
        int cos = (int) Math.cos(angleInRadian);
        
        int angle = (int) Math.toDegrees(Math.asin(angleInDegree));
        int sideB = (int) ((width / Math.toDegrees(Math.sin(angleTop)))* Math.toDegrees(Math.sin(angleInDegree)));
        int areaOfRoof = (length*sideB)*2;
        
        int heigthOfRoof = (int) (sideB * (Math.cos((1/2) * angleTop)));
        int areaOfFrontBack = ((1/2) * heigthOfRoof * width) * 2;
        
        
        //areaOfSide og areaOfFrontBack er de to tal vi skal bruge til udregning af pris for taget
        return areaOfRoof;
        
        
    }
    
    private static int calcShed() throws CarportException, SQLException
    {
        
        int length = DataMapper.getShedlength(1);
        int width = DataMapper.getShedwidth(1);
        int heigth = 200;
        
        int areaLength = (length*heigth) * 2;
        int areaWidth = (width*heigth)* 2;
        
        // arealength + areawidth er i kvadrat meter. hvis vi har en pris i kvardrat meter er det let at regne.
        int shedcm2 = areaLength + areaWidth;
        
        return shedcm2;   
    }
    
    private static int calcPrice()
    {
        int length = DataMapper.get
    }
    
}
