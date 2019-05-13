/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

/**
 *
 * @author emils
 */
public class Order {
    
    private int order_id;
    private Carport carport;
    private User user;
    private boolean shipped;

    public Order(int order_id, Carport carport, User user, boolean shipped) {
        this.order_id = order_id;
        this.carport = carport;
        this.user = user;
        this.shipped = shipped;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public Carport getCarport() {
        return carport;
    }

    public void setCarport(Carport carport) {
        this.carport = carport;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isShipped() {
        return shipped;
    }

    public void setShipped(boolean shipped) {
        this.shipped = shipped;
    }
    @Override
    public String toString() {
        return "Order{" + "order_id=" + order_id + ", carport=" + carport + ", user=" + user + ", shipped=" + shipped + '}';
    }
}
