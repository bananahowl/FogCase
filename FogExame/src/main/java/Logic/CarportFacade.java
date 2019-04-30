/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import DataLayer.DataMapper;
import DataLayer.Roof_material;
import DataLayer.Shed;
import DataLayer.User;
import java.sql.SQLException;

/**
 *
 * @author fskn
 */
public class CarportFacade {
    
    public static Shed getLengthShed (int heigth, int length, int width) throws CarportException, SQLException{
        Shed shed = new Shed(heigth, length, width);
        DataMapper.getShedlength(0);
        return shed;
    }
    
    public static String getRoofMaterial (int id) throws CarportException, SQLException{
        return DataMapper.getRoofMaterial(id);
    }
    
    public static String getMatiralName(int id) throws CarportException {
        return DataMapper.getMatiralName(id);
    }

    public static int getmaxmatiralnum() throws CarportException {
        return DataMapper.getmaxmatiralnum();
    }
    
    public static int getMaxLength() throws CarportException {
        return DataMapper.getMaxLength();
    }
    
    public static int getMaxAngles() throws CarportException {
        return DataMapper.getMaxAngles();
    }
    
    public static int getMaxWidth() throws CarportException {
        return DataMapper.getMaxWidth();
    }
    
    public static int getMaxRoofMaterial() throws CarportException {
        return DataMapper.getMaxRoofMaterial();
    }
    
    public static int getShedwidth(int id) throws CarportException, SQLException {
        return DataMapper.getShedwidth(id);
    }
    
    public static int getShedlength(int id) throws CarportException, SQLException {
        return DataMapper.getShedlength(id);
    }
    
    public static int getRoofAngle(int id) throws CarportException, SQLException{
        return DataMapper.getRoofAngle(id);
    }
}
