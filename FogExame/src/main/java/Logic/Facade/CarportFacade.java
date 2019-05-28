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
 * @author fskn, Emil
 */
public class CarportFacade {

    /**
     * This method get the shedlengthvalue when selecting an id in the database and uses the CarportException to check for errors
     * @param id
     * @return the shedlengthvalue from id 
     */
    public static int getLengthShed(int id) {
        try {
            return CarportMapper.getShedlength(id);
        } catch (CarportException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
    /**
     * This method get the lengthvalue when selecting an id in the database and uses the CarportException to check for errors
     * @param id
     * @return the lengthvalue from the id
     */
    public static int getCarportLength(int id) {
        try {
            return CarportMapper.getlength(id);
        } catch (CarportException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
    /**
     * This method get the widthvalue when selecting an id in the database and uses the CarportException to check for errors
     * @param id
     * @return the widthvalue from the id
     */
    public static int getCarportWidth(int id) {
        try {
            return CarportMapper.getwidth(id);
        } catch (CarportException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
    /**
     * This method get the maksimum number of length id representing in the database and uses the CarportException to check for errors. 
     * @return the amount of lengthid's
     */
    public static int getMaxLength() {
        try {
            return CarportMapper.getMaxLength();
        } catch (CarportException ex) {

        }
        return 0;
    }
    /**
     * This method get the maksimum number of angle id representing in the database and uses the CarportException to check for errors.
     * @return the amount of angleid's
     */
    
    public static int getMaxAngles() {
        try {
            return CarportMapper.getMaxAngles();
        } catch (CarportException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public static int getMaxWidth() {
        try {
            return CarportMapper.getMaxWidth();
        } catch (CarportException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public static int getShedwidth(int id) {
        try {
            return CarportMapper.getShedwidth(id);
        } catch (CarportException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public static int getMaxShedLength() {
        try {
            return CarportMapper.getMaxShedLength();
        } catch (CarportException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public static int getMaxShedWidth() {
        try {
            return CarportMapper.getMaxShedWidth();
        } catch (CarportException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public static int getShedlength(int id) {
        try {
            return CarportMapper.getShedlength(id);
        } catch (CarportException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public static int getRoofAngle(int id) {
        try {
            return CarportMapper.getRoofAngle(id);
        } catch (CarportException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
}
