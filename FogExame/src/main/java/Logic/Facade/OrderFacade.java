/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Facade;

import DataLayer.Carport;
import DataLayer.Order;
import DataLayer.User;
import Logic.CarportException;
import java.util.ArrayList;
import java.util.List;
import DataLayer.DataMappers.OrderMapper;
import DataLayer.DataMappers.UserMapper;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fskn
 */
public class OrderFacade {

    public static Order createOrder(int id, Carport carport) {

        try {
            Order order = new Order(id, carport, false);
            OrderMapper.createOrder(order);
            return order;
        } catch (CarportException ex) {
            Logger.getLogger(OrderFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void deleteorder(int id) {
        try {
            OrderMapper.deleteorder(id);
        } catch (CarportException ex) {
            Logger.getLogger(OrderFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ArrayList<Order> getOrdersByUser(User user)  {
        try {
            return OrderMapper.getOrdersByUser(user);
        } catch (CarportException ex) {
            Logger.getLogger(OrderFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static List<Order> getAllOrders() {
        try {
            return OrderMapper.getAllOrders();
        } catch (CarportException ex) {
            Logger.getLogger(OrderFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
