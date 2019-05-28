
package DataLayer.DataMappers;

import DataLayer.Connector;
import DataLayer.User;
import Logic.CarportException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * The purpose of this class is to send the registred customer in the database and be able to log in to the site afterwards
 * 
 * @author frederikke, frederik, emil 
 */
public class UserMapper {

    /**
     * This method registrer an user in the database when a user is type their information in on the site
     * @param user
     * @throws CarportException 
     */
    public static void createUser(User user) throws CarportException {
        try {
            Connection con = Connector.connection();
            String SQL = "insert into user( firstname, lastname, adress, city, zipcode, email, phonenumber, kodeord) values (?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getFirstname());
            ps.setString(2, user.getLastname());
            ps.setString(3, user.getAdress());
            ps.setString(4, user.getCity());
            ps.setInt(5, user.getZipcode());
            ps.setString(6, user.getEmail());
            ps.setInt(7, user.getPhone());
            ps.setString(8, user.getPassword());
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            throw new CarportException(ex.getMessage());
        }
    }

    /** 
     * This method is used to login in a user to the site
     * @param email
     * @param password
     * @return the user if the user exists in the database
     * @throws CarportException 
     */
    public static User login(String email, String password) throws CarportException {
        try {
            Connection conn = Connector.connection();
            String query = "SELECT * FROM user "
                    + "WHERE email=? AND kodeord=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("userID");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String adress = rs.getString("adress");
                String city = rs.getString("city");
                int zipcode = rs.getInt("zipcode");
                int phone = rs.getInt("phonenumber");
                User user = new User(firstname, lastname, adress, city, zipcode, phone, email, password);
                user.setUser_id(id);
                return user;
            } else {
                throw new CarportException("Error");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            throw new CarportException(ex.getMessage());
        }
    }

    /**
     * This method can delete a user in the database
     * @param id
     * @throws CarportException 
     */
    public static void deleteUser(int id) throws CarportException {
        try {
            Connection con = Connector.connection();
            String SQL = "delete from user where userID = ? ;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ps.executeQuery(SQL);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new CarportException(ex.getMessage());
        }

    }

    /**
     * This method can get a speficic user in the database by typing their id
     * @param id
     * @return a specific user 
     * @throws CarportException 
     */
    public static User readUser(int id) throws CarportException {
        User result = null;
        try {
            Connection con = Connector.connection();
            String SQL = "select * from user where userID = ? ";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String adress = rs.getString("adress");
                String city = rs.getString("city");
                int zipcode = rs.getInt("zipcode");
                int phone = rs.getInt("phonenumber");
                String email = rs.getString("email");
                String password = rs.getString("kodeord");
                result = new User(firstname, lastname, adress, city, zipcode, phone, email, password);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new CarportException(ex.getMessage());
        }
        return result;
    }

    /** 
     * This method checks if the email already exists in the database when the user is trying to create a user on the site
     * @param email
     * @return the email 
     * @throws CarportException 
     */
    public static String checkIfExists(String email) throws CarportException {
        try {
            Connection conn = Connector.connection();
            String query = "SELECT * FROM user "
                    + "WHERE email=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String emailFromDB = rs.getString("email");
                return emailFromDB;
            } else {
                return null;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            throw new CarportException(ex.getMessage());
        }

    }
}
