/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import java.util.Objects;

/**
 *the Order class is used to make able to make order of a carport and is used in relation with 
 * the user part.
 * @author emils
 */
public class Order {
    
    private int order_id;
    private Carport carport;
    private boolean shipped;
    
/**
 *the Order class takes three parameters which is a INT a caport instance a boolean value
 * @param order_id : INT, a id of the order on a carport
 * @param carport : Carport, a instance of a carport class
 * @param shipped : booelan, a condtion for it the order is shipped or not.
 */
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

    /**
     * A method which checks if the object is equals to a object of the class
     * @return a codition which is either true or false.
     */
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
    /**
     * The toSting is used to be able to show what is stored in the objekt, <br>
     * @return  a string value with all the parameters of the object
     */
    @Override
    public String toString() {
        return "Order{" + "order_id=" + order_id + ", carport=" + carport + ", shipped=" + shipped + '}';
    }

}
