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
    
    @Override
    public boolean equals(Object obj) {
        MetalParts meta = (MetalParts) obj;
        boolean status = false;
        if(this.name.equalsIgnoreCase(meta.name)
           && this.price == meta.price
           && this.amount == meta.amount
           ){
            status = true;
        }
        return status;
        
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
        return "MetalParts-" + "Name:" + name + " Price:" + price + " Amount:" + amount + '\n';
        
    }
    
    
}
