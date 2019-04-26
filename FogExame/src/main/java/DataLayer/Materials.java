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

    public Materials(int id, double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
    

    @Override
    public String toString() {
        return "Materials{" + "id=" + id + ", price=" + price + ", name=" + name + '}';
    }
    
    
}
