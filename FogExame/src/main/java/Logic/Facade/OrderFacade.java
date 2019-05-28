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

    /** This method creates an order in the database and connects the user an order. 
     * 
     * @param id
     * @param carport
     * @return Order object
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

    /** deletes an order
     * 
     * @param id 
     */
    public static void deleteorder(int id) {
        try {
            OrderMapper.deleteorder(id);
        } catch (CarportException ex) {
             ex.printStackTrace();
        }
    }
/** reads an order
 * 
 * @param id
 * @return Order
 */
    public static Order readOrder(int id) {
        try {
            Order order = OrderMapper.readOrder(id);
            return order;
        } catch (CarportException ex) {
             ex.printStackTrace();
        }
        return null;
    }
}
