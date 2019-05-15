/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import java.util.Objects;

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
        return "MaterialList-" + " Length:" + length + " Amount:" + amount + " Description: " + description + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MaterialList other = (MaterialList) obj;
        if (this.length != other.length) {
            return false;
        }
        if (this.amount != other.amount) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
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
