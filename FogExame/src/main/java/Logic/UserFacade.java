/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import DataLayer.DataMappers.UserMapper;
import DataLayer.User;

/**
 *
 * @author fskn
 */
public class UserFacade {
    
    public static User createUser(String firstname, String lastname, String adress, String city, int phone, String email, String password) throws CarportException {
        User user = new User(firstname, lastname, adress, city, phone, email, password);
        UserMapper.createUser(user);
        return user;
    }
    
}
