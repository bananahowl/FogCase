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
            String SQL = "INSERT INTO users (firstname, lastname, adress, city, phone, email, password) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getFirstname());
            ps.setString(2, user.getLastname());
            ps.setString(3, user.getAdress());
            ps.setString(4, user.getCity());
            ps.setInt(5, user.getPhone());
            ps.setString(6, user.getEmail());
            ps.setString(7, user.getPassword());
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            throw new CarportException(ex.getMessage());
        }
    }
    
    
}
