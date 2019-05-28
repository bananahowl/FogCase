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
 * @author fskn
 */
public class CreateCarport {

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

    public static Carport createCarportid(int length, int width, int widthShed, int lengthShed, int angle, int price) {

        Shed shed = new Shed(lengthShed, 220, widthShed);
        Carport carport = new Carport(length, 1, width, shed, angle, price);
        return carport;

    }

    public static int NumbersAngleRoof(int length, int width, int widthShed, int lengthShed, int angle) {
        int a = getCarportLength(length);
        int b = getCarportWidth(width);
        int c = getShedlength(lengthShed);
        int d = getShedwidth(widthShed);
        int e = getRoofAngle(angle);
        int price = CalcPartList.totalcarportprice(b, a, d, c, e);
        return price;
    }

    public static MetalParts Partscalc(String name, int amount, double price) {
        MetalParts test = new MetalParts(name, amount, price);
        return test;
    }
}
