package Logic;

import DataLayer.DataMappers.CarportMapper;
import DataLayer.DataMappers.CarportMapper;
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
    
    public static MaterialList calcRoofSides(int width, int length, int angleInDegree) throws CarportException, SQLException
    {
        double angleInRadian = Math.toRadians(angleInDegree);
        double angleTop = 180 - angleInDegree - angleInDegree;
        double topAngleInRadian = Math.toRadians(angleTop);
        double width1 = (double) width;
        double length1 = (double) length;
        
        double sideB = ((width1 / Math.sin(topAngleInRadian ))* Math.sin(angleInRadian));
        double areaOfRoof = (length1*sideB) / 10000;
        double areaOfRoofx2 = areaOfRoof * 2;
                
        //areaOfSide og areaOfFrontBack er de to tal vi skal bruge til udregning af pris for taget
        //15 tagsten på 1m^2
        
        int roofTiles = (int) (areaOfRoofx2 * 15);
        
        //return areaOfRoof;
        MaterialList list1 = new MaterialList(15, roofTiles,"Tagsten");
        return list1;
        
    }
    
    public static MaterialList calcRoofFronts(int width, int angleInDegree) throws CarportException, SQLException
    {
        //int angleInDegree = DataMapper.getRoofAngle(1);

        double width1 = (double) width;
        double halfWidth = (double) width /2;

        double angleInRadian = (double) Math.toRadians(angleInDegree);
        double angleTop = (double) 180 - angleInDegree - angleInDegree;
        double topAngleInRadian = (double) Math.toRadians(angleTop);
        
        double sideB = ((width1 / Math.sin(topAngleInRadian ))* Math.sin(angleInRadian));
        double heigthInEx =  (Math.sqrt((sideB * sideB) - (halfWidth * halfWidth)));
        double heigthOfRoof =  heigthInEx;
        
        int heigthRounded = (int) Math.round(heigthOfRoof/20) * 20;
        int amountOfLumber = (width / 55) * 2;
        MaterialList list1 = new MaterialList(heigthRounded, amountOfLumber, "Træ til tag gavl 1 og gavl 2");
        
        return list1;
    }
    
    public static MaterialList calcShedMats(int length) throws CarportException, SQLException
    {
        //Planks 200cm in heigth(length), 55cm width, thickness idk 
        
        int width = CarportFacade.getShedwidth(1);
        
        int amountOfLumberLength = (length / 55) * 2;
        int amountOfLumberWidth = (width / 55) * 2;
        
        int result = amountOfLumberLength + amountOfLumberWidth;
        MaterialList list1 = new MaterialList(length,result,"planker til skur");
        
        return list1;
    }
    
    public static ArrayList<MaterialList> totalMaterial(MaterialList shed, MaterialList rem, MaterialList spær, MaterialList post, MaterialList roof, MaterialList front, MaterialList vertical, MaterialList horizontal) throws CarportException, SQLException
    {
    
    ArrayList<MaterialList> list1 = new ArrayList<MaterialList>();
    
        list1.add(shed);
        list1.add(rem);
        list1.add(spær);
        list1.add(post);
        list1.add(roof);
        list1.add(front);
        list1.add(vertical);
        list1.add(horizontal);
    
        return list1;
    }
    
    public static int calcShed() throws CarportException, SQLException
    {
        int length = CarportMapper.getShedlength(1);
        int width = CarportMapper.getShedwidth(1);
        int heigth = 220;
        
        int areaLength = (length*heigth) * 2;
        int areaWidth = (width*heigth)* 2;
        
        // arealength + areawidth er i kvadrat meter. hvis vi har en pris i kvardrat meter er det let at regne.
        int shedcm2 = areaLength + areaWidth;
        
        return shedcm2;   
    }
    
    public static MaterialList calcSper(int length , int width) throws CarportException, SQLException
    {   
        int gap = 50;
        
        int amountOfLumberSper = Math.round((length / gap));
        int lengthOfLumberSper = width+30; 

        MaterialList list1 = new MaterialList(lengthOfLumberSper, amountOfLumberSper,"til spær som skal bruges ");
        
        return list1;
    }
     public static MaterialList calcRem(int length , int width) throws CarportException, SQLException
    {   
        int amountOfLumberRem = Math.round(2);
        int lengthOfLumberRem = length + 50;
        //int lengthOfLumberSper = length+60; 

        MaterialList list1 = new MaterialList(lengthOfLumberRem, amountOfLumberRem,"til rem som skal bruges");
        
        return list1;
    }
    
    public static MaterialList calculatePortPost(int width, int length)throws CarportException, SQLException
    {
        int gap = 75;
        int postamount = 0;
        int postLenght = 220 + 90;
    
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
    
    public static MaterialList calcAngledVerticalSpær(int width, int length, int angleInDegree) throws CarportException, SQLException
    {   
        double angleInRadian = Math.toRadians(angleInDegree);
        double angleTop = 180 - angleInDegree - angleInDegree;
        double topAngleInRadian = Math.toRadians(angleTop);
        double width1 = (double) width;

        int sideB = (int) ((width1 / Math.sin(topAngleInRadian ))* Math.sin(angleInRadian));
        
        int gap = 50;
        int amountOfLumberSper = Math.round((length / gap));
        
        MaterialList list1 = new MaterialList(sideB, amountOfLumberSper,"vertikale spær til vinklet tag ");
        
        return list1;
    }
    
    public static MaterialList calcAngledHorizontalSpær(int width, int length) throws CarportException, SQLException
    {   
        int gap = 100;
        int amountOfLumberSper = Math.round((length / gap));
        int lengthOfLumberSper = length+60; 

        MaterialList list1 = new MaterialList(lengthOfLumberSper, amountOfLumberSper,"horizontale spær til vinklet tag");
        
        return list1;
    }
    public static MaterialList calcMetalPost(int amounts){
    int length = 0;
    int bolt = 2;
    int screw = 2;
    int heng = 2;
    int total = 0;
    for(int i= 0; i < amounts; i++){
    total += bolt +screw + heng;
        
    }
        System.out.println(total);
    MaterialList val =new MaterialList(length, total, "metal til stolper");
    return val;
    }
    
    public static MaterialList calcMetalSper(int amounts){
    int length = 0;
    int bolt = 9;
    int screw = 9;
    int heng = 1;
    int total = 0;
    for(int i= 0; i < amounts; i++){
    total += i +bolt +screw + heng;
        
    }
        System.out.println(total);
    MaterialList val =new MaterialList(length, total, "metal til stolper");
    return val;
    }
    
    public static MaterialList meatalTopSper(int amounts){
    int length = 0;
    int bolt = 36;
    int screw = 36;
    int heng = 6;
    int total = 0;
    for(int i= 0; i < amounts; i++){
    total += i +bolt +screw + heng;
        
    }
        System.out.println(total);
    MaterialList val =new MaterialList(length, total, "metal til stolper");
    return val;
    }
    /* // idea to calc the seperate parts to in a better way.
        public static MaterialList calcBolts(int amounts, String type){
   switch(type){
       case sperTop:
           
       break;
       
       case sper:
           
       break;
       
       case pots:
           
       break;
       default:
           System.out.println("Error gotta choose a right value");
           break;
   }
    for(int i= 0; i < amounts; i++){
    
        
    }
        System.out.println(total);
    MaterialList val =new MaterialList(length, total, "metal til stolper");
    return val;
    }
    */
   
    
}
