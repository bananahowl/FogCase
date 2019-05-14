/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import DataLayer.Carport;
import DataLayer.CarportWithShed;
import DataLayer.MetalParts;
import DataLayer.Shed;
import Logic.Facade.CarportFacade;
import static Logic.Facade.CarportFacade.getCarportLength;
import static Logic.Facade.CarportFacade.getCarportWidth;
import static Logic.Facade.CarportFacade.getRoofAngle;
import static Logic.Facade.CarportFacade.getShedlength;
import static Logic.Facade.CarportFacade.getShedwidth;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fskn
 */
public class CreateCarport {
    public static Carport createCarportFlatRoof(int length, int width, int widthShed, int lengthShed, int price) {
        try {
            Shed shed = new Shed(0, 0, 0);
            if (widthShed != 1 && lengthShed != 1) {
               
                    shed.setLength(getShedlength(lengthShed));
                    shed.setWidth(getShedwidth(widthShed));
            }
            int a = getCarportLength(length);
            int b = getCarportWidth(width);
            Carport carport = new Carport(a, 220, b, shed, 0,price);
            return carport;
        } catch (CarportException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(CarportFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static Carport createCarportAngleRoof(int length, int width, int widthShed, int lengthShed, int angle, int price) {
        try {
            Shed shed = new Shed(0, 0, 0);
            if (widthShed != 1 && lengthShed != 1) {
                    shed.setLength(getShedlength(lengthShed));
                    shed.setWidth(getShedwidth(widthShed));
            }
            int a = getCarportLength(length);
            int b = getCarportWidth(width);
            int c = getRoofAngle(angle);
            Carport carport = new Carport(a, 220, b, shed, c,price);
            return carport;
        } catch (CarportException ex) {
            Logger.getLogger(CarportFacade.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarportFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static CarportWithShed add(Carport carport, Shed shed) {
        CarportWithShed cws = new CarportWithShed(carport, shed);
        return cws;
    }
        public static int NumbersFlatRoof(int length, int width, int widthShed, int lengthShed){
            
        try {
            int a = getCarportLength(length);
            int b = getCarportWidth(width);
            int c =  getShedlength(lengthShed);
            int d =    getShedwidth(widthShed);
            int price = CalcPartList.totalwoodprice(b, a, d, c, 0);
            return price;
        } catch (CarportException ex) {
            Logger.getLogger(CarportFacade.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarportFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    public static int NumbersAngleRoof(int length, int width, int widthShed, int lengthShed, int angle){
    
        try {
            int a = getCarportLength(length);
            int b = getCarportWidth(width);
            int c =  getShedlength(lengthShed);
            int d =    getShedwidth(widthShed);
            int e = getRoofAngle(angle);
            int price = CalcPartList.totalwoodprice(b, a, d, c, e);
            return price;
        } catch (CarportException ex) {
            Logger.getLogger(CarportFacade.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarportFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public static MetalParts Partscalc(String name, int amount, double price)
    {
        MetalParts test = new MetalParts(name, amount, price);
        
        return test;
    }
}