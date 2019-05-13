/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Facade;

import DataLayer.DataMappers.UserMapper;
import DataLayer.User;
import Logic.CarportException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fskn
 */
public class UserFacade {
    
    public static User createUser(String firstname, String lastname, String adress, String city, int phone, String email, String password,int zipcode, int id) throws CarportException {
        User user = new User(firstname, lastname, adress, city, email, password,phone,zipcode,id);
        UserMapper.createUser(user);
        return user;
    }
    
    public static User getUser(String email, String password) {
        try {
            return UserMapper.login(email, password);
        } catch (CarportException ex) {
            Logger.getLogger(UserFacade.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    

}
