/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import java.util.Objects;

/**
 *
 * @author frederik, ahmed
*/
/**
 * MaterialList class is used to be able to store the list of total material values which is used
 * in the carport <br>
 *
 */
public class MaterialList {

    private int length;
    private int amount;
    private String description;

    /**
     * MaterialList class takes tree parameters which is needed to instantiate a
     * object.
     *
     * @param length : the length of the part
     * @param amount : the amount of a certain part
     * @param description : the description of the part
     */
    public MaterialList(int length, int amount, String description) {
        this.length = length;
        this.amount = amount;
        this.description = description;
    }

    /**
     * The toSting is used to be able to show what is stored in a MaterialList objekt, <br>
     *this part is greatly used when making showing the list 
     */
    @Override
    public String toString() {
        return "MaterialList-" + " Length:" + length + " Amount:" + amount + " Description: " + description + "\n";
    }

    /**
     * A method which checks if the object is equals to a object of the class
     * @return a codition which is either true or false.
     */
    @Override
    public boolean equals(Object obj) {
        MaterialList mat = (MaterialList) obj;
        boolean status = false;
        if (this.length == mat.length
                && this.amount == mat.amount
                && this.description.equalsIgnoreCase(mat.description)) {
            status = true;
        }
        return status;

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
