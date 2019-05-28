/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Facade;

import DataLayer.DataMappers.CarportMapper;
import Logic.CarportException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fskn
 */
public class CarportFacade {

    public static int getLengthShed(int id)  {
        try {
            return CarportMapper.getShedlength(id);
        } catch (CarportException ex) {
            Logger.getLogger(CarportFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public static int getCarportLength(int id)  {
        try {
            return CarportMapper.getlength(id);
        } catch (CarportException ex) {
            Logger.getLogger(CarportFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public static int getCarportWidth(int id) {
        try {
            return CarportMapper.getwidth(id);
        } catch (CarportException ex) {
            Logger.getLogger(CarportFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public static int getMaxLength() {
        try {
            return CarportMapper.getMaxLength();
        } catch (CarportException ex) {
            Logger.getLogger(CarportFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public static int getMaxAngles() {
        try {
            return CarportMapper.getMaxAngles();
        } catch (CarportException ex) {
            Logger.getLogger(CarportFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public static int getMaxWidth(){
        try {
            return CarportMapper.getMaxWidth();
        } catch (CarportException ex) {
            Logger.getLogger(CarportFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public static int getShedwidth(int id) {
        try {
            return CarportMapper.getShedwidth(id);
        } catch (CarportException ex) {
            Logger.getLogger(CarportFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public static int getMaxShedLength() {
        try {
            return CarportMapper.getMaxShedLength();
        } catch (CarportException ex) {
            Logger.getLogger(CarportFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public static int getMaxShedWidth() {
        try {
            return CarportMapper.getMaxShedWidth();
        } catch (CarportException ex) {
            Logger.getLogger(CarportFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public static int getShedlength(int id) {
        try {
            return CarportMapper.getShedlength(id);
        } catch (CarportException ex) {
            Logger.getLogger(CarportFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public static int getRoofAngle(int id) {
        try {
            return CarportMapper.getRoofAngle(id);
        } catch (CarportException ex) {
            Logger.getLogger(CarportFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
