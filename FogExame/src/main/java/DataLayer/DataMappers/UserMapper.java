/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 *
 * @author fskn
 */
public class UserMapper {

    public static void createUser(User user) throws CarportException {
        try {
            Connection con = Connector.connection();
            String SQL = "insert into users (firstname, lastname, adress, city, email, phonenumber, password, zipcode, id) values (?, ?, ?, ?, ?, ?, ?,?,?);";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getFirstname());
            ps.setString(2, user.getLastname());
            ps.setString(3, user.getAdress());
            ps.setString(4, user.getCity());
            ps.setString(5, user.getEmail());
            ps.setInt(6, user.getPhone());
            ps.setString(7, user.getPassword());
            ps.setInt(8,user.getZipcode());
            ps.setInt(9,user.getId());
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            throw new CarportException(ex.getMessage());
        }
    }

    public static User login(String email, String password) throws CarportException, SQLException {
        try {
            Connection conn = Connector.connection();
            String query = "select firstname, lastname from users where email = ? AND password = ?;";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String adress = rs.getString("adress");
                String city = rs.getString("city");
                int phone = rs.getInt("phonenumber");
                int zipcode = rs.getInt("zipcode");
                int id = rs.getInt("id");
                User user = new User(firstname, lastname, adress, city, email, password, phone, zipcode, id);
                return user;
            } else {
                throw new CarportException("Error");
            }
        } catch (ClassNotFoundException ex) {
            throw new CarportException(ex.getMessage());
        }
    }
}
