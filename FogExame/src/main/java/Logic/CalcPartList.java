package Logic;

import DataLayer.DataMapper;
import DataLayer.DataMapper;
import DataLayer.MaterialList;

import java.sql.SQLException;
import Logic.CarportException;
import Logic.CarportFacade;
import java.sql.SQLException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author frizz
 */

public class CalcPartList {
    
    public static MaterialList calcRoofSides(int width, int length) throws CarportException, SQLException
    {
        //Til udregningen af selve taget på en carport
        
       
        int angleInDegree = DataMapper.getRoofAngle(1);
        int angleTop = 180 - angleInDegree - angleInDegree;
        int angleInRadian = (int) Math.toRadians(angleInDegree);
        int cos = (int) Math.cos(angleInRadian);
        
        int angle = (int) Math.toDegrees(Math.asin(angleInDegree));
        int sideB = (int) ((width / Math.toDegrees(Math.sin(angleTop)))* Math.toDegrees(Math.sin(angleInDegree)));
        int areaOfRoof = (length*sideB)*2;
                
        //areaOfSide og areaOfFrontBack er de to tal vi skal bruge til udregning af pris for taget
        //15 tagsten på 1m^2
        int roofTiles = areaOfRoof * 15;
        
        //return areaOfRoof;
        MaterialList list1 = new MaterialList(0, roofTiles,"Tagsten");
        return list1;
        
    }
    
    public static MaterialList calcRoofFronts(int angleInDegree) throws CarportException, SQLException
    {
        
        //int angleInDegree = DataMapper.getRoofAngle(1);
        int angleTop = 180 - angleInDegree - angleInDegree;
        int width = DataMapper.getShedwidth(1);
        int length = DataMapper.getShedlength(1);
        int angleInRadian = (int) Math.toRadians(angleInDegree);
        int cos = (int) Math.cos(angleInRadian);
        
        int angle = (int) Math.toDegrees(Math.asin(angleInDegree));
        int sideB = (int) ((width / Math.toDegrees(Math.sin(angleTop)))* Math.toDegrees(Math.sin(angleInDegree)));
        
        
        int heigthOfRoof = (int) (sideB * (Math.cos((1/2) * angleTop)));
        int areaOfFrontBack = ((1/2) * heigthOfRoof * width) * 2;
        
        int amountOfLumber = (width / 55) * 2;
        
        //return areaOfFrontBack;
        MaterialList list1 = new MaterialList(heigthOfRoof, amountOfLumber, "Træ til tag gavl 1 og gavl 2");
        return list1;
    }
    
    public static MaterialList calcShedMats(int length) throws CarportException, SQLException
    {
        //Planks 200cm in heigth(length), 55cm width, thickness idk 
        
        
        ArrayList shedMats = new ArrayList();
        int heigth = 220;
        int width = CarportFacade.getShedwidth(1);
        
        int amountOfLumberLength = (length / 55) * 2;
        int amountOfLumberWidth = (width / 55) * 2;
        
        
        
        int result = amountOfLumberLength + amountOfLumberWidth;
        
        
        
        MaterialList list1 = new MaterialList(length,result,"planker til skur");
        return list1;
        
        
        
    }
    
    public static ArrayList<MaterialList> totalMaterial(MaterialList shed, MaterialList flat, MaterialList post, MaterialList roof, MaterialList front) throws CarportException, SQLException
    {
    
    ArrayList<MaterialList> list1 = new ArrayList<MaterialList>();
    
    
    list1.add(shed);
    list1.add(flat);
    list1.add(post);
    list1.add(roof);
    list1.add(front);
    
    return list1;
    
    }
    
    public static int calcShed() throws CarportException, SQLException
    {
        
        int length = DataMapper.getShedlength(1);
        int width = DataMapper.getShedwidth(1);
        int heigth = 220;
        
        int areaLength = (length*heigth) * 2;
        int areaWidth = (width*heigth)* 2;
        
        // arealength + areawidth er i kvadrat meter. hvis vi har en pris i kvardrat meter er det let at regne.
        int shedcm2 = areaLength + areaWidth;
        
        return shedcm2;   
    }
    
    public static MaterialList flatRoof(int length , int width) throws CarportException, SQLException
    {   
        
        int gap = 55;
        int amountOfLumberRem = Math.round((length / gap));
        int lengthOfLumberRem = width + 30;
        int lengthOfLumberSper = length; 
        int amountOfLumberSper = Math.round(2);
        


        MaterialList list1 = new MaterialList(lengthOfLumberSper, amountOfLumberSper,"til fladt tag");
        return list1;
        
    }
    
    public static MaterialList calculatePortPost(int width, int length)throws CarportException, SQLException
    {
    /*int valueMat = DataMapper.getMaterialPrice(material);
    int height = DataMapper.getHeight(1);
    int width = DataMapper.getWidth(width);*/
    //int length = DataMapper.getLength(length);
    int gap = 75;
    int postamount = 0;
    int postLenght = 220 + 90;
    
   // for(int i = leng){}
    
    if(length % gap == 0){
    
    postamount = length / gap;
    }
    else{
        postamount = Math.round(length/gap) + 1;
    // code some dank here
    }
    
    MaterialList list1 = new MaterialList(postLenght, postamount, "mængden af stolper der skal bruges");
    
   
    return list1;
    }
    
    public static ArrayList goodsNeeded() throws CarportException, SQLException
    {
        //rooftiles on one M^2 = 15
        ArrayList goods = new ArrayList();
        //int rooftilezz = calcRoofSides() / 15;
        //int shedLumber = calcShedMats();
        
        //goods.add(shedLumber);
        
        return goods;
    }
}
