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

/**
 *
 * @author fskn
 */
public class OrderFacade {
/*
    public static List<Order> getAllOrders() throws CarportException {
        return OrderMapper.getAllOrders();
    }

    public static ArrayList<Order> getAllOrdersByUser(User user) throws CarportException {
        return OrderMapper.getOrdersByUser(user);
    }
*/
    public static Order createOrder(int id, Carport carport, User user) throws CarportException {

        Order order = new Order(id, carport, user, false);
        OrderMapper.createOrder(order);
        return order;
    }
    
    public static void deleteorder(int id) throws CarportException{
        OrderMapper.deleteorder(id);
    }
}
