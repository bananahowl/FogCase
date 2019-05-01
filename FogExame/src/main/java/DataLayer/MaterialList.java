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
public class MaterialList {
    private int length;
    private int amount;
    private String description;
    
        public MaterialList(int length, int amount, String description) {
        this.length = length;
        this.amount = amount;
        this.description = description;
    }

    @Override
    public String toString() {
        return "MaterialList{" + "length=" + length + ", amount=" + amount + ", description=" + description + '}';
    }

    public int getLength() {
        return length;
    }

    public int getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }


    
}
