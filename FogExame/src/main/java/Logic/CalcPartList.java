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
    
    private static double calcArealRoof()
    {
        //Til udregningen af selve taget på en carport
        /*
        double angleTop = 180 - DataMapper.getAngle() - DataMapper.getAngle();
        double width = DataMapper.getWidth
        double length = DataMapper.getLength
        double angleInDegree = DataMapper.getAngle;
        double angleInRadian = Math.toRadians(angleInDegree);
        double cos = Math.cos(angleInRadian);
        
        double angle = Math.toDegree(Math.asin(angleInDegree));
        double sideB = (width/Math.toDegree(Math.csin(sinuscInDegree)))*Math.toDegree(Math.bsin(sinusbInDegree))
        double areaOfRoof = (length*sideB)*2
        
        double heigthOfRoof = sideB * (Math.cos((1/2) * angleTop))
        double areaOfFrontBack = ((1/2) * heigthOfRoof * width) * 2;
        
        
        //areaOfSide og areaOfFrontBack er de to tal vi skal bruge til udregning af pris for taget
        
        */
        return 0;
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
    
}
