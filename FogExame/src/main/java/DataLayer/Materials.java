/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

/**
 *
 * @author frizz
 */
public class Materials {
    private int id;
    private double price;
    private String name;
         /**
         * Materials class is used to be able to store
         * the wood parts which is used in the carport,
         * @param  id: the id of the material
         * @param  price: the price for the material
         * @param name: the name of the material
         */
    public Materials(int id, double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }
    /**
     * Returns the id of the metal part
     * @return id
     */
    public int getId() {
        return id;
    }
    /**
     * Returns the price of the metal part
     * @return price 
     */
    public double getPrice() {
        return price;
    }
    /**
     * Returns the name of the metal part
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * Sets the id of the metal part
     * 
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Sets  the price of the metal part
     * 
     */
    public void setPrice(double price) {
        this.price = price;
    }
    /**
     * Sets  the name of the metal part
     * 
     */
    public void setName(String name) {
        this.name = name;
    }
    

    @Override
    public String toString() {
        return "Materials{" + "id=" + id + ", price=" + price + ", name=" + name + '}';
    }
    
    
}
