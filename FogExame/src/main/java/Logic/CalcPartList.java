package Logic;

import DataLayer.Carport;
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
        MaterialList list1 = new MaterialList(15, roofTiles, "tagsten");
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
        
        if(heigthRounded == 0)
        {
            amountOfLumber = 0;
        }
        MaterialList list1 = new MaterialList(heigthRounded, amountOfLumber, "trægalver");

        return list1;
    }

    public static MaterialList calcShedMats(int length,int width) throws CarportException, SQLException
    {
        //Planks 200cm in heigth(length), 55cm width, thickness idk 
        

        int amountOfLumberLength = (length / 55) * 2;
        int amountOfLumberWidth = (width / 55) * 2;

        int result = amountOfLumberLength + amountOfLumberWidth;
        MaterialList list1 = new MaterialList(length, result, "skurplanker");

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

    


    public static MaterialList calcSper(int length, int width) throws CarportException, SQLException {
        int gap = 50;

        int amountOfLumberSper = Math.round((length / gap));
        int lengthOfLumberSper = width + 30;

        MaterialList list1 = new MaterialList(lengthOfLumberSper, amountOfLumberSper, "spær");

        return list1;
    }

    public static MaterialList calcRem(int length, int width) throws CarportException, SQLException {
        int amountOfLumberRem = Math.round(2);
        int lengthOfLumberRem = length + 50;
        //int lengthOfLumberSper = length+60; 

        MaterialList list1 = new MaterialList(lengthOfLumberRem, amountOfLumberRem, "rem");

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

        MaterialList list1 = new MaterialList(postLenght, postamount, "stolper");

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
        
        if(sideB == 0)
        {
            amountOfLumberSper = 0;
        }

        MaterialList list1 = new MaterialList(sideB, amountOfLumberSper, "vertikalespær");

        return list1;
    }

    public static MaterialList calcAngledHorizontalSpær(int width, int length) throws CarportException, SQLException {
        //Denne metode giver length og amount selvom der ikke er tag. Har fikset det på de andre metoder men ikke denne.
        int gap = 100;
        int amountOfLumberSper = Math.round((length / gap));
        int lengthOfLumberSper = length + 60;

        MaterialList list1 = new MaterialList(lengthOfLumberSper, amountOfLumberSper, "horizontalespær");

        return list1;
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


    public static int totalwoodprice(int shedWidth, int shedLength, int width, int length, int angle)
    {
        try {
            CalcPrice price = new CalcPrice();
            
            MaterialList shedtest = calcShedMats(shedWidth,shedLength);
            MaterialList spertest = calcSper(width, length);
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
   
    public static ArrayList<MaterialList> totalpartlist(Carport carport)/*int shedWidth, int shedLength, int width, int length, int angle)*/
    {
        
        try {
            
            MaterialList shedtest = calcShedMats(CarportFacade.getShedwidth(carport.getShed().getWidth()),CarportFacade.getCarportLength(carport.getShed().getLength()));
            MaterialList spertest = calcSper(CarportFacade.getCarportWidth(carport.getWidth()), CarportFacade.getCarportLength(carport.getLength()));
            MaterialList remtest  = calcRem(CarportFacade.getCarportWidth(carport.getWidth()), CarportFacade.getCarportLength(carport.getLength()));
            MaterialList posttest = calculatePortPost(CarportFacade.getCarportWidth(carport.getWidth()), CarportFacade.getCarportLength(carport.getLength()));
            MaterialList rooftest = calcRoofSides(CarportFacade.getCarportWidth(carport.getWidth()), CarportFacade.getCarportLength(carport.getLength()), CarportFacade.getRoofAngle(carport.getRoofangle()));
            MaterialList fronttest= calcRoofFronts(CarportFacade.getCarportWidth(carport.getWidth()), CarportFacade.getRoofAngle(carport.getRoofangle()));
            MaterialList verticaltest = calcAngledVerticalSpær(CarportFacade.getCarportWidth(carport.getWidth()), CarportFacade.getCarportLength(carport.getLength()), CarportFacade.getRoofAngle(carport.getRoofangle()));
            MaterialList horizontaltest = calcAngledHorizontalSpær(CarportFacade.getCarportWidth(carport.getWidth()), CarportFacade.getCarportLength(carport.getLength()));
            
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
