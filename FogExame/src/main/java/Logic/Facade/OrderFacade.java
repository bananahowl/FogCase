/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Facade;

import DataLayer.Order;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fskn
 */
public class OrderFacade {
        public static List<Order> getAllOrders () throws CarportException {
        return DataMapper.getAllOrders();
    }
    
    public static ArrayList<Order> getAllOrdersByUser (User user) throws LegohouseException {
        return DataMapper.getOrdersByUser(user);
    }
    
    public static void createOrder (Legohouse legohouse, User user) throws LegohouseException {
        Order order = new Order(legohouse.getLength(), legohouse.getWidth(), legohouse.getHeight(), user, false);
        DataMapper.createOrder(order);
    }
}
