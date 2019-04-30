/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import DataLayer.DataMapper;

import java.sql.SQLException;

import java.util.ArrayList;




/**
 *
 * @author frizz
 */

public class CalcPartList {
    
    private static int calcRoofSides() throws CarportException, SQLException
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
                
        //areaOfSide og areaOfFrontBack er de to tal vi skal bruge til udregning af pris for taget
        return areaOfRoof;
        
        
    }
    
    private static int calcRoofFronts() throws CarportException, SQLException
    {
        int angleInDegree = DataMapper.getRoofAngle(1);
        int angleTop = 180 - angleInDegree - angleInDegree;
        int width = DataMapper.getShedwidth(1);
        int length = DataMapper.getShedlength(1);
        int angleInRadian = (int) Math.toRadians(angleInDegree);
        int cos = (int) Math.cos(angleInRadian);
        
        int angle = (int) Math.toDegrees(Math.asin(angleInDegree));
        int sideB = (int) ((width / Math.toDegrees(Math.sin(angleTop)))* Math.toDegrees(Math.sin(angleInDegree)));
        
        
        int heigthOfRoof = (int) (sideB * (Math.cos((1/2) * angleTop)));
        int areaOfFrontBack = ((1/2) * heigthOfRoof * width) * 2;
        
        return areaOfFrontBack;
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
    
    private static ArrayList flatRoof() throws CarportException, SQLException
    {
        ArrayList flatRoofMats = new ArrayList();
        int length = CarportFacade.getShedlength(1);
        int width = CarportFacade.getShedwidth(1);
        
        int amountOfLumber = length / 55;
        int lengthOfLumber = width + 30;
        
        flatRoofMats.add(amountOfLumber);
        flatRoofMats.add(lengthOfLumber);
        
        return flatRoofMats;
    }
    
    public static int calculatPortFrame(int width, int length, int material){
    /*int valueMat = DataMapper.getMaterialPrice(material);
    int height = DataMapper.getHeight(1);
    int width = DataMapper.getWidth(width);*/
    //int length = DataMapper.getLength(length);
    
    int gap = 50;
    int len = 480;
    int wid = 180;
    int amount = 0;
    
   // for(int i = leng){}
    
    if(len % gap == 0){
    
    amount = len / gap;
    }
    else{
    // code some dank here
    
    }
   
    return 0;
    }
    
    public static ArrayList goodsNeeded() throws CarportException, SQLException
    {
        //rooftiles on one M^2 = 15
        ArrayList goods = new ArrayList();
        int rooftiles = calcRoofSides() / 15;
        
        
        return goods;
    }
}
