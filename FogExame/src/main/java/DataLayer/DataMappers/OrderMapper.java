/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer.DataMappers;

import DataLayer.Carport;
import DataLayer.Connector;
import DataLayer.Order;
import DataLayer.Shed;
import DataLayer.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Logic.CarportException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fskn
 */
public class OrderMapper {

    public static void createOrder(Order order) throws CarportException {
        try {
            Connection con = Connector.connection();
            String SQL = "insert into orderTable (user_id, cLength, cWidth, cHeigth, sLength, sWidth, angle, price, shipped) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, order.getOrder_id());
            ps.setInt(2, order.getCarport().getLength());
            ps.setInt(3, order.getCarport().getWidth());
            ps.setInt(4, order.getCarport().getHeigth());
            ps.setInt(5, order.getCarport().getShed().getLength());
            ps.setInt(6, order.getCarport().getShed().getWidth());
            ps.setInt(7, order.getCarport().getRoofangle());
            ps.setInt(8, order.getCarport().getPrice());
            ps.setInt(9, 0);    
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            throw new CarportException(ex.getMessage());
        }
    }
        

    public static void deleteorder(int id) throws CarportException {
        try {
            Connection con = Connector.connection();
            String SQL = "delete from orderTable where user_id = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ps.executeQuery(SQL);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderMapper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(OrderMapper.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static ArrayList<Order> getOrdersByUser(User user) throws CarportException {
        ArrayList<Order> orders = new ArrayList();
        try {
            Connection con = Connector.connection();
            String SQL = "select order_id, cLength, cWidth, cHeigth, sLength, sWidth, angle, price, shipped from orderTable where user_id = ?;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, user.getUser_id());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int orderID = rs.getInt("order_id");
                int clength = rs.getInt("cLength");
                int cwidth = rs.getInt("cWidth");
                int cheight = rs.getInt("cHeigth");
                int slength = rs.getInt("sLength");
                int swidth = rs.getInt("sWidth");
                int angle = rs.getInt("angle");
                int price = rs.getInt("price");
                Shed shed = new Shed(220, slength, swidth);
                Carport carport = new Carport(clength, cwidth, cheight, shed, angle, price);
                boolean shipped = rs.getBoolean("shipped");
                orders.add(new Order(orderID, carport, shipped));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new CarportException(ex.getMessage());
        }
        return orders;
    }

    public static List<Order> getAllOrders() throws CarportException {
        ArrayList<Order> orders = new ArrayList();
        try {
            Connection con = Connector.connection();
            String SQL = "select user.userID, order_id, cLength, cWidth, cHeigth, sLength, sWidth, angle, price, shipped from orderTable\n" +
"               join Fogdatabase.user where user.userID = orderTable.user_id;;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int orderID = rs.getInt("order_id");
                int clength = rs.getInt("cLength");
                int cwidth = rs.getInt("cWidth");
                int cheight = rs.getInt("cHeigth");
                int slength = rs.getInt("sLength");
                int swidth = rs.getInt("sWidth");
                int angle = rs.getInt("angle");
                int price = rs.getInt("price");
                Shed shed = new Shed(220, slength, swidth);
                Carport carport = new Carport(clength, cwidth, cheight, shed, angle, price);
                boolean shipped = rs.getBoolean("shipped");
                orders.add(new Order(orderID, carport, shipped));
            }
        } catch (ClassNotFoundException | SQLException ex) {

            throw new CarportException(ex.getMessage());
        }
        return orders;
    }
}
