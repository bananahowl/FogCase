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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fskn
 */
public class UserFacade {
    
    public static User createUser(String firstname, String lastname, String adress, String city, int zipcode, int phone, String email, String password){
        try {
            User user = new User(firstname, lastname, adress, city, zipcode, phone, email, password);
            UserMapper.createUser(user);
            return user;
        } catch (CarportException ex) {
            Logger.getLogger(UserFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static User getUser(String email, String password)  {
        
        try {
            return UserMapper.login(email, password);
        } catch (CarportException ex) {
            Logger.getLogger(UserFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void deleteUser(int id) throws CarportException{
        UserMapper.readUser(id);
    }
    
    /*public static List<User> readAllUsers(){
        
    }
      */
    
    public static User readUser(int id) throws CarportException{
        User us = UserMapper.readUser(id);
        return us;
    }

}
