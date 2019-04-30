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
    
    public static int calcRoofSides() throws CarportException, SQLException
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
    
    public static int calcRoofFronts() throws CarportException, SQLException
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
    
    public static ArrayList<MaterialList> calcShedMats(int length) throws CarportException, SQLException
    {
        //Planks 200cm in heigth(length), 55cm width, thickness idk 
        ArrayList<MaterialList> list1 = new ArrayList<MaterialList>();
        
        
        ArrayList shedMats = new ArrayList();
        int heigth = 220;
        int width = CarportFacade.getShedwidth(1);
        
        int amountOfLumberLength = (length / 55) * 2;
        int amountOfLumberWidth = (width / 55) * 2;
        
        
        
        int result = amountOfLumberLength + amountOfLumberWidth;
        
        list1.add(new MaterialList(length,result,"planker til skur"));
        
        
        return list1;
    }
    
    public static ArrayList<MaterialList> totalMaterial(ArrayList<MaterialList> shed, ArrayList<MaterialList> flat, ArrayList<MaterialList> post) throws CarportException, SQLException
    {
    
    ArrayList<MaterialList> list1 = new ArrayList<MaterialList>();
    
    
    list1.addAll(shed);
    list1.addAll(flat);
    list1.addAll(post);
    
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
    
    public static ArrayList<MaterialList> flatRoof(int length , int width) throws CarportException, SQLException
    {   
        ArrayList <MaterialList>flatRoofMats = new ArrayList();
        int gap = 55;
        int amountOfLumberRem = Math.round((length / gap));
        int lengthOfLumberRem = width + 30;
        int lengthOfLumberSper = length; 
        int amountOfLumberSper = Math.round(2);
        

        flatRoofMats.add(new MaterialList(lengthOfLumberRem, amountOfLumberRem,"til fladt tag"));
        flatRoofMats.add(new MaterialList(lengthOfLumberSper, amountOfLumberSper,"til fladt tag")); 
        return flatRoofMats;
        
    }
    
    public static ArrayList<MaterialList> calculatePortPost(int width, int length)throws CarportException, SQLException
    {
    /*int valueMat = DataMapper.getMaterialPrice(material);
    int height = DataMapper.getHeight(1);
    int width = DataMapper.getWidth(width);*/
    //int length = DataMapper.getLength(length);
    ArrayList <MaterialList> posts = new ArrayList();
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
    
    posts.add(new MaterialList(postLenght, postamount, "mængden af stolper der skal bruges"));
   
    return posts;
    }
    
    public static ArrayList goodsNeeded() throws CarportException, SQLException
    {
        //rooftiles on one M^2 = 15
        ArrayList goods = new ArrayList();
        int rooftiles = calcRoofSides() / 15;
        //int shedLumber = calcShedMats();
        
        //goods.add(shedLumber);
        
        return goods;
    }
}
