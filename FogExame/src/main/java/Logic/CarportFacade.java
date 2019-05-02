/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import DataLayer.Carport;
import DataLayer.CarportWithShed;
import DataLayer.DataMappers.DataMapper;
import DataLayer.Roof_material;
import DataLayer.Shed;
import DataLayer.User;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fskn
 */
public class CarportFacade {

    public static Shed getLengthShed(int heigth, int length, int width) throws CarportException, SQLException {
        Shed shed = new Shed(heigth, length, width);
        DataMapper.getShedlength(0);
        return shed;
    }

    public static int getCarportLength(int id) throws CarportException, SQLException {
        return DataMapper.getlength(id);
    }

    public static int getCarportWidth(int id) throws CarportException, SQLException {
        return DataMapper.getwidth(id);
    }

    public static String getRoofMaterial(int id) throws CarportException, SQLException {
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

    public static int getMaxShedLength() throws CarportException {
        return DataMapper.getMaxShedLength();
    }

    public static int getMaxShedWidth() throws CarportException {
        return DataMapper.getMaxShedWidth();
    }

    public static int getShedlength(int id) throws CarportException, SQLException {
        return DataMapper.getShedlength(id);
    }

    public static int getRoofAngle(int id) throws CarportException, SQLException {
        return DataMapper.getRoofAngle(id);
    }

    public static Carport createCarportFlatRoof(int length, int width, int widthShed, int lengthShed) {
        try {
            Shed shed = new Shed(0, 0, 0);
            if (widthShed != 1 && lengthShed != 1) {
                try {
                    shed.setLength(getShedlength(lengthShed));
                    shed.setWidth(getShedwidth(widthShed));
                } catch (CarportException ex) {
                    Logger.getLogger(CarportFacade.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(CarportFacade.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            int a = getCarportLength(length);
            int b = getCarportWidth(width);
            Carport carport = new Carport(a, 220, b, shed, 0);
            return carport;
        } catch (CarportException ex) {
            Logger.getLogger(CarportFacade.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarportFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static Carport createCarportAngleRoof(int length, int width, int widthShed, int lengthShed, int angle) {
        try {
            Shed shed = new Shed(0, 0, 0);
            if (widthShed != 1 && lengthShed != 1) {
                try {
                    shed.setLength(getShedlength(lengthShed));
                    shed.setWidth(getShedwidth(widthShed));
                } catch (CarportException ex) {
                    Logger.getLogger(CarportFacade.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(CarportFacade.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            int a = getCarportLength(length);
            int b = getCarportWidth(width);
            Carport carport = new Carport(a, 220, b, shed, angle);
            return carport;
        } catch (CarportException ex) {
            Logger.getLogger(CarportFacade.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarportFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static User createUser(String email, String password) throws CarportException {
        User user = new User(email, password);
        DataMapper.createUser(user);
        return user;
    }

    public static CarportWithShed add(Carport carport, Shed shed) {
        CarportWithShed cws = new CarportWithShed(carport, shed);
        return cws;
    }

    /*
        public static User login( String email, String password ) throws CarportException {
        return DataMapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws CarportException {
        User user = new User(email, password, "customer");
        DataMapper.createUser( user );
        return user;
    }
    
    public static List<Order> getAllOrders () throws CarportException {
        return DataMapper.getAllOrders();
    }
    
    public static ArrayList<Order> getAllOrdersByUser (User user) throws CarportException {
        return DataMapper.getOrdersByUser(user);
    }
    
    public static void createOrder (Legohouse legohouse, User user) throws CarportException {
        Order order = new Order(legohouse.getLength(), legohouse.getWidth(), legohouse.getHeight(), user, false);
        DataMapper.createOrder(order);
    }*/
}
