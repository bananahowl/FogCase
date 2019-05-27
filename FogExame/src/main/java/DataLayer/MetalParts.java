/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

/**
 * <h1> MetalParts class </h1>
 *
 *
 * @author frizz
 * @since 26-04-2019
 */
public class MetalParts {

    private String name;
    private int amount;
    private double price;
    
/**
         * MetalParts class is used in a larger scale with it being a foundation( with
         * other instance classes) <br> Metalparts class is used to be able to store
         * metal parts which is used in the carport,
         * @param  name: the name of the part
         * @param amount:the amount of a certain part
         * @param  price: the price for that part
         */
    public MetalParts(String name, int amount, double price) {
        
        this.name = name;
        this.price = price;
        this.amount = amount;

    }
    /**
     * Returns true if the object is equals to a MetalParts obeject
     * @return material name
     */
    @Override
    public boolean equals(Object obj) {
        MetalParts meta = (MetalParts) obj;
        boolean status = false;
        if (this.name.equalsIgnoreCase(meta.name)
                && this.price == meta.price
                && this.amount == meta.amount) {
            status = true;
        }
        return status;

    }

    /**
     * Returns the name of the metal part
     * @return material name
     */
    public String getName() {

        return name;
    }
    /**
     * Returns the price of the metal part
     * @return material name
     */
    public double getPrice() {
        return price;
    }
    /**
     * Returns the amount of the metal part
     * @return material name
     */
    public int getAmount() {
        return amount;
    }
    /**
     * Returns a toString of MetalParts instances 
     * @return material name
     */
    @Override
    public String toString() {
        return "MetalParts-" + "Name:" + name + " Price:" + price + " Amount:" + amount + '\n';

    }

}
