package Logic;

import DataLayer.MaterialList;
import DataLayer.MetalParts;
import java.util.ArrayList;

/**
 * <h1> CalcPrice </h1> <br>
 * This class does the calculation for the price of the carport, it uses several
 * other classes and method.<br>
 * This class have also the creation of the list for the metal parts which are
 * used for a carport.
 *
 * @author ahmed, frederik
 */
public class CalcPrice {

    /**
     * this method calculates the price for the wood parts of the carport. It
     * should be noted that sevaral values are hard coded, and does not change
     * on certain conditions.
     *
     * @param list : it is a arrayList of MaterialList object.
     * @return the method returns a price in INT.
     */
    public int woodPrice(ArrayList<MaterialList> list) {
        int lenghtVal = 10;
        int price = 5;
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += ((list.get(i).getAmount() * list.get(i).getLength()) / lenghtVal) * price;
        }
        return total;
    }

    /**
     * This method print out the values in the arrayList.
     */
    public void printList(ArrayList<MaterialList> vals) {
        for (int i = 0; i < vals.size(); i++) {
        }
    }

    /**
     * This method creates the arrayList for the metalparts by using the
     * arrayList for the tree parts.
     *
     * @param list the method taks a Arraylist of the MaterialList object
     * @return a Arraylist of Metal Parts. MetalParts
     */
    public ArrayList<MetalParts> metalParts(ArrayList<MaterialList> list) {
        ArrayList<MetalParts> partslist = new ArrayList();
        int amountOfLumber = 0;
        int amountOfNails = 0;
        int amountOfBolts = 0;
        int amountOfScews = 0;
        int amountOfBrackets = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDescription() == "trægavler") {
                amountOfNails += 4;
            }
            if (list.get(i).getDescription() == "skurplanker") {
                amountOfNails += list.get(i).getAmount() * 4;
            }
            if (list.get(i).getDescription() == "spær") {
                amountOfBrackets += list.get(i).getAmount() * 2;
                amountOfScews += list.get(i).getAmount() * 9;
                amountOfBolts += list.get(i).getAmount() * 9;
            }
            if (list.get(i).getDescription() == "rem") {
            }
            if (list.get(i).getDescription() == "stolper") {
                amountOfNails += list.get(i).getAmount() * 2;
                amountOfBolts += list.get(i).getAmount() * 2;
            }
            if (list.get(i).getDescription().equals("vertikalespær")) {
                amountOfBrackets += list.get(i).getAmount() * 6;
                amountOfScews += list.get(i).getAmount() * 18;
                amountOfBolts += list.get(i).getAmount() * 18;
            }
            if (list.get(i).getDescription().equals("horizontalespær")) {
                amountOfNails += 2 * (list.get(i).getAmount() * list.get(i - 1).getAmount() * 2);
            }
            amountOfLumber += list.get(i).getAmount();
        }
        int bracketsAmount = (int) Math.ceil(amountOfBrackets / 10);
        int screwsAmount = (int) Math.ceil(amountOfScews / 100);
        int boltsAmount = (int) Math.ceil(amountOfBolts / 50);
        int nailsAmount = (int) Math.ceil(amountOfNails / 100);
        MetalParts brackets = CreateCarport.Partscalc("Beslag, 10 i en pakke", bracketsAmount, 100);
        MetalParts screws = CreateCarport.Partscalc("Skruer med møtrik, 100 i en pakke", screwsAmount, 50);
        MetalParts nails = CreateCarport.Partscalc("Søm, 100 i en pakke", nailsAmount, 50);
        MetalParts bolt = CreateCarport.Partscalc("Bolte, 50 i en pakke", boltsAmount, 150);
        partslist.add(brackets);
        partslist.add(screws);
        partslist.add(bolt);
        partslist.add(nails);
        return partslist;
    }

    /**
     * This method calculates the price for the metal parts of the carport.
     *
     * @param list : the method takes a ArrayList of MetalParts
     * @return : returns a price for the metalparts INT
     */
    public double metalPartsPrice(ArrayList<MetalParts> list) {
        double totalprice = 0;
        for (int i = 0; i < list.size(); i++) {
            totalprice += (double) list.get(i).getPrice() * list.get(i).getAmount();
        }
        return totalprice;
    }
}
