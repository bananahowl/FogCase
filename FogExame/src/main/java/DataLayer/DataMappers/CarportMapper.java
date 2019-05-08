package DataLayer.DataMappers;

import DataLayer.Connector;
import DataLayer.User;
import Logic.CarportException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * The purpose of UserMapper is to...
 *
 * @author kasper
 */
import Logic.CarportException;

import java.sql.Connection;
public class CarportMapper {
/*
    public String getMatiralName(int id) throws Exception {
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT materialName FROM users " + "WHERE materialID = " + id + "; ";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String nr = rs.getString("matterialName");
                //int id = rs.getInt( "id" );

                //user.setId( id );
                return nr;
            } else {
                throw new CarportException("Could not validate user");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new CarportException(ex.getMessage());
        }
    }
/*
    public static void createUser(User user) throws CarportException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO users (email, password, role) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            throw new CarportException(ex.getMessage());
        }
    }

    public static void createOrder(Order order) throws LegohouseException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO orders (email_FK, length, width, height, shipped) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, order.getUser().getEmail());
            ps.setInt(2, order.getLength());
            ps.setInt(3, order.getWidth());
            ps.setInt(4, order.getHeight());
            ps.setBoolean(5, order.isShipped());
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);
            order.setOrder_id(id);
        } catch (SQLException | ClassNotFoundException ex) {
            throw new LegohouseException(ex.getMessage());
        }
    }

    public static User login(String email, String password) throws LegohouseException {
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT role FROM users " + "WHERE email=? AND password=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String role = rs.getString("role");
                //int id = rs.getInt( "id" );
                User user = new User(email, password, role);
                //user.setId( id );
                return user;
            } else {
                throw new LegohouseException("Could not validate user");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LegohouseException(ex.getMessage());
        }
    }

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

    public static ArrayList<Order> getOrdersByUser(User user) throws LegohouseException {
        ArrayList<Order> orders = new ArrayList();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT order_id, length, width, height, shipped "
                    + "FROM legohouse.orders WHERE email_FK = ?;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, user.getEmail());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int orderID = rs.getInt("order_id");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int height = rs.getInt("height");
                boolean shipped = rs.getBoolean("shipped");
                orders.add(new Order(orderID, length, width, height, user, shipped));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LegohouseException(ex.getMessage());
        }
        return orders;
    }*/



    public static String getMatiralName(int id) throws CarportException {
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT materialName FROM materials " + "WHERE materialID = ? ";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String nr = rs.getString("materialName");
                return nr;
            } else {
                throw new CarportException("Could not validate user");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new CarportException(ex.getMessage());
        }
    }

    public static void createUser(User user) throws CarportException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO users (email, password) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            throw new CarportException(ex.getMessage());
        }
    }


    public static int getmaxmatiralnum() throws CarportException {

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT max(materialID) FROM materials;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                int nr = rs.getInt("max(materialID)");
                return nr;
            } else {
                throw new CarportException("Could not validate user");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new CarportException(ex.getMessage());
        }
    }
    
    public static int getMaxLength() throws CarportException {
        try {
            Connection con = Connector.connection();
            String SQL = "select max(lengthid) from length;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                int nr = rs.getInt("max(lengthid)");
                return nr;
            } else {
                throw new CarportException("Could not validate user");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new CarportException(ex.getMessage());
        }
    }
    
    public static int getMaxAngles() throws CarportException {
        try {
            Connection con = Connector.connection();
            String SQL = "select max(degreeid) from degrees;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                int nr = rs.getInt("max(degreeid)");
                return nr;
            } else {
                throw new CarportException("Could not validate user");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new CarportException(ex.getMessage());
        }
    }
    
    public static int getMaxWidth() throws CarportException {
        try {
            Connection con = Connector.connection();
            String SQL = "select max(widthid) from width;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                int nr = rs.getInt("max(widthid)");
                return nr;
            } else {
                throw new CarportException("Could not validate user");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new CarportException(ex.getMessage());
        }
    }
    public static int getMaxShedWidth() throws CarportException {
        try {
            Connection con = Connector.connection();
            String SQL = "select max(shedwidthid) from shedwidth;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                int nr = rs.getInt("max(shedwidthid)");
                return nr;
            } else {
                throw new CarportException("Could not validate user");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new CarportException(ex.getMessage());
        }
    }
    
    public static int getMaxShedLength() throws CarportException { // IKKE FÆRDIG
        try {
            Connection con = Connector.connection();
            String SQL = "select max(shedlengthid) from shedlength;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                int nr = rs.getInt("max(shedlengthid)");
                return nr;
            } else {
                throw new CarportException("Could not validate user");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new CarportException(ex.getMessage());
        }
    }
    
    public static int getMaxRoofMaterial() throws CarportException {
        try {
            Connection con = Connector.connection();
            String SQL = "select max(roofmaterialid) from roofmaterial";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                int nr = rs.getInt("max(roofmaterialid)");
                return nr;
            } else {
                throw new CarportException("Could not validate user");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new CarportException(ex.getMessage());
        }
    }
    public static String getRoofMaterial(int id) throws CarportException, SQLException {
        try {
            Connection conn = Connector.connection();
            String query = "Select roofmaterialname from roofmaterial where roofmaterialid = " + id + ""; 
            PreparedStatement ps = conn.prepareStatement(query);
            //ps.setInt(1, id);
            ResultSet rs = ps.executeQuery(query);

            if (rs.next()) {
                String name = rs.getString("roofmaterialname"); 
                return name;
            } else {
                throw new CarportException("Error");
            }
        } catch (ClassNotFoundException ex) {
            throw new CarportException(ex.getMessage());
        }
    }
    public static int getwidth(int id) throws CarportException, SQLException {
        try {
            Connection conn = Connector.connection();
            String query = "select widthvalue from width where widthid = ?"; //+ id +""; 
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery(query);

            if (rs.next()) {
                int width = rs.getInt("widthvalue"); 
                return width;
            } else {
                throw new CarportException("Error");
            }
        } catch (ClassNotFoundException ex) {
            throw new CarportException(ex.getMessage());
        }
    }
    
    public static int getlength(int id) throws CarportException, SQLException {
        try {
            Connection conn = Connector.connection();
            String query = "select lengthvalue from length where lengthid =" + id + ";"; 
            PreparedStatement ps = conn.prepareStatement(query);
           //ps.setInt(1, id);
            ResultSet rs = ps.executeQuery(query);

            if (rs.next()) {
                int length = rs.getInt("lengthvalue"); 
                return length;
            } else {
                throw new CarportException("Error");
            }
        } catch (ClassNotFoundException ex) {
            throw new CarportException(ex.getMessage());
        }
    }
    
    public static int getShedwidth(int id) throws CarportException, SQLException {
        try {
            Connection conn = Connector.connection();
            String query = "select shedwidthvalue from shedwidth where shedwidthid =" + id + ";"; 
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);

            if (rs.next()) {
                int width = rs.getInt("shedwidthvalue"); 
                return width;
            } else {
                throw new CarportException("Error");
            }
        } catch (ClassNotFoundException ex) {
            throw new CarportException(ex.getMessage());
        }
    }
    
    public static int getShedlength(int id) throws CarportException, SQLException {
        try {
            Connection conn = Connector.connection();
            String query = "select shedlengthvalue from shedlength where shedlengthid =" + id + ";"; 
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);

            if (rs.next()) {
                int length = rs.getInt("shedlengthvalue"); 
                return length;
            } else {
                throw new CarportException("Error");
            }
        } catch (ClassNotFoundException ex) {
            throw new CarportException(ex.getMessage());
        }
    }
    
    public static int getRoofAngle(int id) throws CarportException, SQLException {
        try {
            Connection conn = Connector.connection();
            String query = "select degreevalue from degrees where degreeid =" + id + ";"; //BEMÆRK !!!! DENNE ER IKKE RIGTIG (PS. SLET DENNE KOMMENTAR NÅR DU HAR RETTET!!!)
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);

            if (rs.next()) {
                int angle = rs.getInt("degreevalue"); //BEMÆRK !!!! DENNE ER IKKE RIGTIG (PS. SLET DENNE KOMMENTAR NÅR DU HAR RETTET!!!)
                return angle;
            } else {
                throw new CarportException("Error");
            }
        } catch (ClassNotFoundException ex) {
            throw new CarportException(ex.getMessage());
        }
    }
    
}
