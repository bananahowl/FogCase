/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer.DataMappers;

import DataLayer.Connector;
import DataLayer.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Logic.CarportException;

/**
 *
 * @author fskn
 */
public class OrderMapper {
    
    
    public static void createOrder(Order order) throws CarportException {
        try {
            Connection con = Connector.connection();
            String SQL = "insert into orderTable (user_id, cLength, cWidth, cHeigth, sLength, sWidth, angle, price, shipped) values (?,?,?,?,?,?,?,?,?);";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, order.getUser().getUser_id());
            ps.setInt(2, order.getCarport().getLength());
            ps.setInt(3, order.getCarport().getWidth());
            ps.setInt(4, order.getCarport().getHeigth());
            ps.setInt(5, order.getCarport().getShed().getLength());
            ps.setInt(6, order.getCarport().getShed().getWidth());
            ps.setInt(7, order.getCarport().getRoofangle());
            ps.setInt(8, order.getCarport().getPrice());
            ps.setBoolean(9, order.isShipped());
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            throw new CarportException(ex.getMessage());
        }
    }
    /*
    public static List<Order> getAllOrders() throws LegohouseException {
        ArrayList<Order> orders = new ArrayList();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT order_id, email_FK, length, width, height, "
                    + "shipped, `password`, role FROM legohouse.orders JOIN legohouse.users"
                    + " where orders.email_FK = users.email;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int orderID = rs.getInt("order_id");
                String email = rs.getString("email_FK");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int height = rs.getInt("height");
                boolean shipped = rs.getBoolean("shipped");
                String password = rs.getString("password");
                String role = rs.getString("role");
                User user = new User(email, password, role);
                orders.add(new Order(orderID, length, width, height, user, shipped));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LegohouseException(ex.getMessage());
        }
        return orders;
    }

*/
}