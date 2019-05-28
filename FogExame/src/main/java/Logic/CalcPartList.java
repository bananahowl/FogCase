package Logic;

import DataLayer.Carport;
import DataLayer.MaterialList;
import DataLayer.MetalParts;
import java.util.ArrayList;
/**
 * <h1> CalcPartList</h1><br>
 *
 * @author frederik, ahmed This class have the function of calculation for the
 * parts of the carport. <br>
 * With that comes a heap of other mehtods which helps with that, there are for
 * the tree parts, but also for the metal parts.<br>
 * It should be said but the way the values is made by having certain hard coded
 * values.
 */
public class CalcPartList {

    /**
     * this method calculate the side for the roof. It is made to be use by a
     * carport object class.
     *
     * @param width : the width of the carport INT
     * @param length : the lenght of the carport INT
     * @param angleInDegree the angle for the carport INT
     * @return a MaterialList object.
     */
    public static MaterialList calcRoofSides(int width, int length, int angleInDegree) {
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
        MaterialList list1 = new MaterialList(15, roofTiles, "tagsten");
        return list1;
    }

    /**
     *
     */
    public static MaterialList calcRoofFronts(int width, int angleInDegree) {
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
        if (heigthRounded == 0) {
            amountOfLumber = 0;
        }
        MaterialList list1 = new MaterialList(heigthRounded, amountOfLumber, "trægalver");
        return list1;
    }

    public static MaterialList calcShedMats(int length, int width) {
        //Planks 200cm in heigth(length), 55cm width
        int heigth = 220;
        int amountOfLumberLength = (length / 55) * 2;
        int amountOfLumberWidth = (width / 55) * 2;
        int result = amountOfLumberLength + amountOfLumberWidth;
        MaterialList list1 = new MaterialList(heigth, result, "skurplanker");
        return list1;
    }

    public static ArrayList<MaterialList> totalMaterial(MaterialList shed, MaterialList rem, MaterialList spær, MaterialList post, MaterialList roof, MaterialList front, MaterialList vertical, MaterialList horizontal) {
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

    public static MaterialList calcSper(int length, int width) {
        int gap = 50;
        int amountOfLumberSper = Math.round((length / gap));
        int lengthOfLumberSper = width + 30;
        MaterialList list1 = new MaterialList(lengthOfLumberSper, amountOfLumberSper, "spær");
        return list1;
    }

    public static MaterialList calcRem(int length, int width) {
        int amountOfLumberRem = Math.round(2);
        int lengthOfLumberRem = length + 50;
        MaterialList list1 = new MaterialList(lengthOfLumberRem, amountOfLumberRem, "rem");

        return list1;
    }

    public static MaterialList calculatePortPost(int width, int length) {
        int gap = 75;
        int postamount = 0;
        int postLenght = 220 + 90;
        if (length % gap == 0) {
            postamount = length / gap;
        } else {
            postamount = Math.round(length / gap) + 1;
        }
        MaterialList list1 = new MaterialList(postLenght, postamount, "stolper");
        return list1;
    }

    public static MaterialList calcAngledVerticalSpær(int width, int length, int angleInDegree) {
        double angleInRadian = Math.toRadians(angleInDegree);
        double angleTop = 180 - angleInDegree - angleInDegree;
        double topAngleInRadian = Math.toRadians(angleTop);
        double width1 = (double) width;
        int sideB = (int) ((width1 / Math.sin(topAngleInRadian)) * Math.sin(angleInRadian));
        int gap = 50;
        int amountOfLumberSper = Math.round((length / gap));
        if (sideB == 0) {
            amountOfLumberSper = 0;
        }
        MaterialList list1 = new MaterialList(sideB, amountOfLumberSper, "vertikalespær");
        return list1;
    }

    public static MaterialList calcAngledHorizontalSpær(int width, int length) {
        //Denne metode giver length og amount selvom der ikke er tag. Har fikset det på de andre metoder men ikke denne.
        int gap = 100;
        int amountOfLumberSper = Math.round((length / gap));
        int lengthOfLumberSper = length + 60;
        MaterialList list1 = new MaterialList(lengthOfLumberSper, amountOfLumberSper, "horizontalespær");
        return list1;
    }

    // metode som beregner antal søm til mængden af stolper
    public int calcPostNail(int amount) {
        int total = 0;
        int postNail = 2;
        for (int i = 0; i < amount; i++) {
            total += postNail;
        }
        return total;
    }

    public static ArrayList<MetalParts> addItem(MetalParts val) {
        ArrayList<MetalParts> items = new ArrayList();
        items.add(val);
        return items;
    }

    public static int totalcarportprice(int shedWidth, int shedLength, int width, int length, int angle) {
        CalcPrice price = new CalcPrice();
        MaterialList shedtest = calcShedMats(shedWidth, shedLength);
        MaterialList spertest = calcSper(width, length);
        MaterialList remtest = calcRem(width, length);
        MaterialList posttest = calculatePortPost(width, length);
        MaterialList rooftest = calcRoofSides(width, length, angle);
        MaterialList fronttest = calcRoofFronts(width, angle);
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
        int priceWood = price.woodPrice(duperlist);
        ArrayList<MetalParts> listMetal = price.metalParts(duperlist);
        int priceMetal = (int) price.metalPartsPrice(listMetal);
        int pricetotal = priceWood + priceMetal;
        return pricetotal;
    }

    public static ArrayList<MaterialList> totalpartlist(Carport carport) {
        MaterialList shedtest = calcShedMats(carport.getShed().getWidth(), carport.getShed().getLength());
        MaterialList spertest = calcSper(carport.getLength(), carport.getWidth());
        MaterialList remtest = calcRem(carport.getLength(), carport.getWidth());
        MaterialList posttest = calculatePortPost(carport.getWidth(), carport.getLength());
        MaterialList rooftest = calcRoofSides(carport.getWidth(), carport.getLength(), carport.getRoofangle());
        MaterialList fronttest = calcRoofFronts(carport.getWidth(), carport.getRoofangle());
        MaterialList verticaltest = calcAngledVerticalSpær(carport.getWidth(), carport.getLength(), carport.getRoofangle());
        MaterialList horizontaltest = calcAngledHorizontalSpær(carport.getWidth(), carport.getLength());
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
    }

}
