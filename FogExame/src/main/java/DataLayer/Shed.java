/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

/**
 *The Shed is used with carport to be able to make a caport obeject <br>
 * the Shed class on its own is not much but it is when it is used with the carport it potential shows
 * @author emil
 */

public class Shed {
    private int length;
    private int heigth;
    private int width;
    /**
     * The Shed class takes three parameters as value to be able to make a instance <br>
     * @param length : INT, a lenth on the shed
     * @param heigth : INT, a height on the shed
     * @param width : INT, a width in the shed
     */
    public Shed(int length, int heigth, int width) {
        this.length = length;
        this.heigth = heigth;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;

    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
}
