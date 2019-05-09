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
public class MetalParts {
    private String name;
    private int amount;
    private double price;
    
    public MetalParts(String name, int amount, double price){
    this.name = name;
    this.price = price;
    this.amount = amount;
    
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "MetalParts{" + "name=" + name + ", price=" + price + ", amount=" + amount + '}';
    }
    
    
}
