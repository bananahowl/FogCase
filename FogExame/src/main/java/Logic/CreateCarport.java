/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import DataLayer.Carport;
import DataLayer.MetalParts;
import DataLayer.Shed;
import static Logic.Facade.CarportFacade.getCarportLength;
import static Logic.Facade.CarportFacade.getCarportWidth;
import static Logic.Facade.CarportFacade.getRoofAngle;
import static Logic.Facade.CarportFacade.getShedlength;
import static Logic.Facade.CarportFacade.getShedwidth;

/**
 *
<<<<<<< HEAD
 * @author simone, emil
=======
 * @author ahmed, emil
>>>>>>> 562710ed55c34d44512643d04f3b0a8bd96f31a6
 */
public class CreateCarport {

    /** this method creates a carport object by useing all the parimiters to get the right measurements 
     * 
     * @param length
     * @param width
     * @param widthShed
     * @param lengthShed
     * @param angle
     * @param price
     * @return Carport
     */
    public static Carport createCarportAngleRoof(int length, int width, int widthShed, int lengthShed, int angle, int price) {
        Shed shed = new Shed(0, 220, 0);
        if (widthShed != 1 && lengthShed != 1) {
            shed.setLength(getShedlength(lengthShed));
            shed.setWidth(getShedwidth(widthShed));
        }
        int a = getCarportLength(length);
        int b = getCarportWidth(width);
        int c = getRoofAngle(angle);
        Carport carport = new Carport(a, 220, b, shed, c, price);
        return carport;
    }
/** this method creates a carport object by useing all the parimiters to create a carpot of IDs
 * 
 * @param length
 * @param width
 * @param widthShed
 * @param lengthShed
 * @param angle
 * @param price
 * @return Carport of IDs
 */
    public static Carport createCarportid(int length, int width, int widthShed, int lengthShed, int angle, int price) {
        Shed shed = new Shed(lengthShed, 220, widthShed);
        Carport carport = new Carport(length, 1, width, shed, angle, price);
        return carport;
    }
/** this method calculates a price by useing all the parimiters
 * 
 * @param length
 * @param width
 * @param widthShed
 * @param lengthShed
 * @param angle
 * @return price
 */
    public static int NumbersAngleRoof(int length, int width, int widthShed, int lengthShed, int angle) {
        int a = getCarportLength(length);
        int b = getCarportWidth(width);
        int c = getShedlength(lengthShed);
        int d = getShedwidth(widthShed);
        int e = getRoofAngle(angle);
        int price = CalcPartList.totalcarportprice(b, a, d, c, e);
        return price;
    }
/** this method creates a metal parts objekt
 * 
 * @param name
 * @param amount
 * @param price
 * @return metalparts
 */
    public static MetalParts Partscalc(String name, int amount, double price) {
        MetalParts test = new MetalParts(name, amount, price);
        return test;
    }
}
