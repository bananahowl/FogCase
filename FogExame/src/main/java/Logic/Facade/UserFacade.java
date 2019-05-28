/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Facade;

import DataLayer.DataMappers.UserMapper;
import DataLayer.User;
import Logic.CarportException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fskn, Emil
 */
public class UserFacade {

    public static User createUser(String firstname, String lastname, String adress, String city, int zipcode, int phone, String email, String password) {
        try {
            User user = new User(firstname, lastname, adress, city, zipcode, phone, email, password);
            UserMapper.createUser(user);
            User userWithID = getUser(email, password);
            user.setUser_id(userWithID.getUser_id());
            return user;
        } catch (CarportException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static User getUser(String email, String password) {

        try {
            return UserMapper.login(email, password);
        } catch (CarportException ex) {
            ex.printStackTrace();
        }
        return null;

    }

    public static void deleteUser(int id) {
        try {
            UserMapper.readUser(id);
        } catch (CarportException ex) {
            ex.printStackTrace();
        }
    }

    public static User readUser(int id) {
        try {
            User us = UserMapper.readUser(id);
            return us;
        } catch (CarportException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static String doesUserExist(String email) {
        try {
            return UserMapper.checkIfExists(email);
        } catch (CarportException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
