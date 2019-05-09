package Logic;

import DataLayer.DataMappers.CarportMapper;
import DataLayer.DataMappers.CarportMapper;
import DataLayer.MaterialList;
import DataLayer.MetalParts;

import java.sql.SQLException;
import Logic.CarportException;
import Logic.Facade.CarportFacade;
import java.sql.SQLException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author frizz
 */
public class CalcPartList {

    public static MaterialList calcRoofSides(int width, int length, int angleInDegree) throws CarportException, SQLException {
        double angleInRadian = Math.toRadians(angleInDegree);
        double angleTop = 180 - angleInDegree - angleInDegree;
        double topAngleInRadian = Math.toRadians(angleTop);
        double width1 = (double) width;
        double length1 = (double) length;

        double sideB = ((width1 / Math.sin(topAngleInRadian)) * Math.sin(angleInRadian));
        double areaOfRoof = (length1 * sideB) / 10000;
        double areaOfRoofx2 = areaOfRoof * 2;

        //areaOfSide og areaOfFrontBack er de to tal vi skal bruge til udregning af pris for taget
        //15 tagsten på 1m^2
        int roofTiles = (int) (areaOfRoofx2 * 15);

        //return areaOfRoof;
        MaterialList list1 = new MaterialList(15, roofTiles, "Tagsten");
        return list1;

    }

    public static MaterialList calcRoofFronts(int width, int angleInDegree) throws CarportException, SQLException {
        //int angleInDegree = DataMapper.getRoofAngle(1);

        double width1 = (double) width;
        double halfWidth = (double) width / 2;

        double angleInRadian = (double) Math.toRadians(angleInDegree);
        double angleTop = (double) 180 - angleInDegree - angleInDegree;
        double topAngleInRadian = (double) Math.toRadians(angleTop);

        double sideB = ((width1 / Math.sin(topAngleInRadian)) * Math.sin(angleInRadian));
        double heigthInEx = (Math.sqrt((sideB * sideB) - (halfWidth * halfWidth)));
        double heigthOfRoof = heigthInEx;

        int heigthRounded = (int) Math.round(heigthOfRoof / 20) * 20;
        int amountOfLumber = (width / 55) * 2;
        MaterialList list1 = new MaterialList(heigthRounded, amountOfLumber, "Træ til tag gavl 1 og gavl 2");

        return list1;
    }

    public static MaterialList calcShedMats(int length,int width) throws CarportException, SQLException
    {
        //Planks 200cm in heigth(length), 55cm width, thickness idk 
        

        int amountOfLumberLength = (length / 55) * 2;
        int amountOfLumberWidth = (width / 55) * 2;

        int result = amountOfLumberLength + amountOfLumberWidth;
        MaterialList list1 = new MaterialList(length, result, "planker til skur");

        return list1;
    }

    public static ArrayList<MaterialList> totalMaterial(MaterialList shed, MaterialList rem, MaterialList spær, MaterialList post, MaterialList roof, MaterialList front, MaterialList vertical, MaterialList horizontal) throws CarportException, SQLException {

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

        int areaLength = (length * heigth) * 2;
        int areaWidth = (width * heigth) * 2;

        // arealength + areawidth er i kvadrat meter. hvis vi har en pris i kvardrat meter er det let at regne.
        int shedcm2 = areaLength + areaWidth;

        return shedcm2;
    }

    public static MaterialList calcSper(int length, int width) throws CarportException, SQLException {
        int gap = 50;

        int amountOfLumberSper = Math.round((length / gap));
        int lengthOfLumberSper = width + 30;

        MaterialList list1 = new MaterialList(lengthOfLumberSper, amountOfLumberSper, "til spær som skal bruges ");

        return list1;
    }

    public static MaterialList calcRem(int length, int width) throws CarportException, SQLException {
        int amountOfLumberRem = Math.round(2);
        int lengthOfLumberRem = length + 50;
        //int lengthOfLumberSper = length+60; 

        MaterialList list1 = new MaterialList(lengthOfLumberRem, amountOfLumberRem, "til rem som skal bruges");

        return list1;
    }

    public static MaterialList calculatePortPost(int width, int length) throws CarportException, SQLException {
        int gap = 75;
        int postamount = 0;
        int postLenght = 220 + 90;

        if (length % gap == 0) {

            postamount = length / gap;
        } else {
            postamount = Math.round(length / gap) + 1;
            // code some dank here
        }

        MaterialList list1 = new MaterialList(postLenght, postamount, "mængden af stolper der skal bruges");

        return list1;
    }

    public static MaterialList calcAngledVerticalSpær(int width, int length, int angleInDegree) throws CarportException, SQLException {
        double angleInRadian = Math.toRadians(angleInDegree);
        double angleTop = 180 - angleInDegree - angleInDegree;
        double topAngleInRadian = Math.toRadians(angleTop);
        double width1 = (double) width;

        int sideB = (int) ((width1 / Math.sin(topAngleInRadian)) * Math.sin(angleInRadian));

        int gap = 50;
        int amountOfLumberSper = Math.round((length / gap));

        MaterialList list1 = new MaterialList(sideB, amountOfLumberSper, "vertikale spær til vinklet tag ");

        return list1;
    }

    public static MaterialList calcAngledHorizontalSpær(int width, int length) throws CarportException, SQLException {
        int gap = 100;
        int amountOfLumberSper = Math.round((length / gap));
        int lengthOfLumberSper = length + 60;

        MaterialList list1 = new MaterialList(lengthOfLumberSper, amountOfLumberSper, "horizontale spær til vinklet tag");

        return list1;
    }

    public static MaterialList calcMetalPost(int amounts) {
        int length = 0;
        int bolt = 2;
        int screw = 2;
        int heng = 2;
        int total = 0;
        for (int i = 0; i < amounts; i++) {
            total += bolt + screw + heng;

        }
        System.out.println(total);
        MaterialList val = new MaterialList(length, total, "metal til stolper");
        return val;
    }

    public static MaterialList calcMetalSper(int amounts) {

        int length = 0;
        int bolt = 36;
        int screw = 36;
        int heng = 6;
        int total = 0;
        for (int i = 0; i < amounts; i++) {
            total += i + bolt + screw + heng;

        }
        System.out.println(total);
        MaterialList val = new MaterialList(length, total, "metal til stolper");
        return val;

    } 
    // til roof tages antal som tag spær mængden, disse metoder bruges hvis der et et tag med vinkel.
    public static int calcSrewRoff(int amountHeng) {

        int total = 0;
        int screw = 6;
        for (int i = 0; i < amountHeng; i++) {
            total += i + screw ;
        }
        System.out.println(total);
        return total;
        
    } 
    public static int calBoltRoof(int amount) {
        
        int total = 0;
        int bolt = 6;
        int screw = 4;
        for (int i = 0; i < amount; i++) {
            total += i + bolt + screw ;
        }
        System.out.println(total);
        return total;
        
    } 
     public static int calcHengRoof(int amount) {
        
        int total = 0;
        int heng = 1;
        for (int i = 0; i < amount; i++) {
            total += i + heng ;
        }
        System.out.println(total);
        return total;

    }
     
    // port delen er tager amount som antalet af spær om der er
    public static int calcSrewPort(int amountHeng) {

        int total = 0;
        int screw = 9;
        for (int i = 0; i < amountHeng; i++) {
            total += i + screw ;
        }
        System.out.println(total);
        return total;
        
    } 
    
    public static int calBoltPort(int amount) {
        
        int total = 0;
        int bolt = 9;
        int screw = 4;
        for (int i = 0; i < amount; i++) {
            total += i + bolt + screw ;
        }
        System.out.println(total);
        return total;
        
    }
   
    public static int calcHengPort(int amount) {
        
        int total = 0;
        int heng = 1;
        for (int i = 0; i < amount; i++) {
            total += i + heng ;
        }
        System.out.println(total);
        return total;

    }
    // metode som beregner antal søm til mængden af stolper
    public int calcPostNail(int amount){
    
    int total = 0;
    int postNail = 2;
    for(int i = 0; i< amount; i++){
    
    total += postNail;
    }
    
    return total;
    }
    
    

public static ArrayList<MetalParts> addItem(MetalParts val) {

        ArrayList<MetalParts> items = new ArrayList();

        items.add(val);

        return items;

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
    public static int totalwoodprice(int shedWidth, int shedLength, int width, int length, int angle)
    {
        try {
            CalcPrice price = new CalcPrice();
            
            MaterialList shedtest = calcShedMats(shedWidth,shedLength);
            MaterialList spertest = calcSper(width , length);
            MaterialList remtest  = calcRem(width, length);
            MaterialList posttest = calculatePortPost(width, length);
            MaterialList rooftest = calcRoofSides(width,length, angle);
            MaterialList fronttest= calcRoofFronts(width, angle);
            MaterialList verticaltest = calcAngledVerticalSpær(width, length, angle);
            MaterialList horizontaltest = calcAngledHorizontalSpær(width, length);
            
            ArrayList<MaterialList> duperlist = new ArrayList<>();
            duperlist.add(shedtest);
            duperlist.add(spertest);
            duperlist.add(remtest);
            duperlist.add(posttest);
            duperlist.add(rooftest);
            duperlist.add(fronttest);
            duperlist.add(verticaltest);
            duperlist.add(horizontaltest);
            
            int pricetotal = price.woodPrice(duperlist);
            
            return pricetotal;
        } catch (CarportException ex) {
            Logger.getLogger(CalcPartList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CalcPartList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
        
    }
   
    public static ArrayList<MaterialList> totalpartlist(int shedWidth, int shedLength, int width, int length, int angle)
    {
        
        try {
            MaterialList shedtest = calcShedMats(shedWidth,shedLength);
            MaterialList spertest = calcSper(width , length);
            MaterialList remtest  = calcRem(width, length);
            MaterialList posttest = calculatePortPost(width, length);
            MaterialList rooftest = calcRoofSides(width,length, angle);
            MaterialList fronttest= calcRoofFronts(width, angle);
            MaterialList verticaltest = calcAngledVerticalSpær(width, length, angle);
            MaterialList horizontaltest = calcAngledHorizontalSpær(width, length);
            
            ArrayList<MaterialList> duperlist = new ArrayList<>();
            duperlist.add(shedtest);
            duperlist.add(spertest);
            duperlist.add(remtest);
            duperlist.add(posttest);
            duperlist.add(rooftest);
            duperlist.add(fronttest);
            duperlist.add(verticaltest);
            duperlist.add(horizontaltest);
            
            return duperlist;
        } catch (CarportException ex) {
            Logger.getLogger(CalcPartList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CalcPartList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
