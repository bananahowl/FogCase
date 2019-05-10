/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Facade;

import DataLayer.DataMappers.CarportMapper;
import DataLayer.MetalParts;
import Logic.CarportException;
import java.sql.SQLException;

/**
 *
 * @author fskn
 */
public class CarportFacade {

    public static int getLengthShed(int id) throws CarportException, SQLException {
        return CarportMapper.getShedlength(id);
    }

    public static int getCarportLength(int id) throws CarportException, SQLException {
        return CarportMapper.getlength(id);
    }

    public static int getCarportWidth(int id) throws CarportException, SQLException {
        return CarportMapper.getwidth(id);
    }

    public static String getRoofMaterial(int id) throws CarportException, SQLException {
        return CarportMapper.getRoofMaterial(id);
    }

    public static String getMatiralName(int id) throws CarportException {
        return CarportMapper.getMatiralName(id);
    }

    public static int getmaxmatiralnum() throws CarportException {
        return CarportMapper.getmaxmatiralnum();
    }

    public static int getMaxLength() throws CarportException {
        return CarportMapper.getMaxLength();
    }

    public static int getMaxAngles() throws CarportException {
        return CarportMapper.getMaxAngles();
    }

    public static int getMaxWidth() throws CarportException {
        return CarportMapper.getMaxWidth();
    }

    public static int getMaxRoofMaterial() throws CarportException {
        return CarportMapper.getMaxRoofMaterial();
    }

    public static int getShedwidth(int id) throws CarportException, SQLException {
        return CarportMapper.getShedwidth(id);
    }

    public static int getMaxShedLength() throws CarportException {
        return CarportMapper.getMaxShedLength();
    }

    public static int getMaxShedWidth() throws CarportException {
        return CarportMapper.getMaxShedWidth();
    }

    public static int getShedlength(int id) throws CarportException, SQLException {
        return CarportMapper.getShedlength(id);
    }

    public static int getRoofAngle(int id) throws CarportException, SQLException {
        return CarportMapper.getRoofAngle(id);
    }
}
