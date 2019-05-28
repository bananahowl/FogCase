/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Facade;

import DataLayer.Carport;
import DataLayer.Order;
import Logic.CarportException;
import DataLayer.DataMappers.OrderMapper;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author frederikke, emil 
 */
public class OrderFacade {

    /**
     * This method creates an order in the database and connects the user an order. 
     * @param order
     */
    public static Order createOrder(int id, Carport carport) {
        try {
            Order order = new Order(id, carport, false);
            OrderMapper.createOrder(order);
            return order;
        } catch (CarportException ex) {
             ex.printStackTrace();
        }
        return null;
    }

    public static void deleteorder(int id) {
        try {
            OrderMapper.deleteorder(id);
        } catch (CarportException ex) {
             ex.printStackTrace();
        }
    }

    public static Order readOrder(int id) {
        try {
            Order orde = OrderMapper.readOrder(id);
            return orde;
        } catch (CarportException ex) {
             ex.printStackTrace();
        }
        return null;
    }
}
