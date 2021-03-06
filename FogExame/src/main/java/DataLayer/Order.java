/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import java.util.Objects;

/**
 * the Order class is used to make able to make order of a carport and is used
 * in relation with the user part.
 *
 * @author emil, frederik
 */
public class Order {

    private int order_id;
    private Carport carport;
    private boolean shipped;

    /**
     * Order class is used to be able to create a order of a carport
     * <br> Order class takes a Carport instance which is a class special made
     * for this project metal parts which is used in the carport,
     *
     * @param order_id: the id of the order
     * @param carport:the carport instance which is validated to the order
     * @param shipped : a condition to see if the order is shipped of not
     */
    public Order(int order_id, Carport carport, boolean shipped) {
        this.order_id = order_id;
        this.carport = carport;

        this.shipped = shipped;
    }

    /**
     * hashCode returns a int value which is 3 in this case, as hash value
     *
     */
    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    /**
     * A method which checks if the object is equals to a object of the class
     *
     * @return a codition which is either true or false.
     */

    @Override
    public boolean equals(Object obj) {
        Order ord = (Order) obj;
        boolean status = false;
        if (this.order_id == ord.order_id
                && this.carport == ord.carport
                && this.shipped == ord.shipped) {
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
     *
     * @return a string value with all the parameters of the object
     */
    @Override
    public String toString() {
        return "Order{" + "order_id=" + order_id + ", carport=" + carport + ", shipped=" + shipped + '}';
    }

}
