/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import java.util.Objects;

/**
 *
 * @author emils
 */
public class Order {
    
    private int order_id;
    private Carport carport;
    private boolean shipped;
    

    public Order(int order_id, Carport carport, boolean shipped) {
        this.order_id = order_id;
        this.carport = carport;
        
        this.shipped = shipped;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

   @Override
    public boolean equals(Object obj) {
        Order ord = (Order) obj;
        boolean status = false;
        if(this.order_id == ord.order_id
           && this.carport == ord.carport
           && this.shipped == ord.shipped){
            status = true;
        }
        return status;
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

    public boolean isShipped() {
        return shipped;
    }

    public void setShipped(boolean shipped) {
        this.shipped = shipped;
    }

    @Override
    public String toString() {
        return "Order{" + "order_id=" + order_id + ", carport=" + carport + ", shipped=" + shipped + '}';
    }

}
