/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

/**
 * Carport class is used in a larger scale with it being a foundation( with
 * other instance classes) <br> Carport class is used with the Sheed class to
 * make objects of carport.
 *
 * @author Emil
 */
public class Carport {

    private int length;
    private int heigth;
    private int width;
    private Shed shed;
    private int roofangle;
    private int price;

    /**
     * Carport class takes certain input values which is returns a Carport object
     *<br> also importain to take note of is that this class also takes a Custom class Sheed as a input variable.
     * @param length : the length of the carport, INT
     * @param heigth : the height of the carport INT
     * @param width : the width of the carport, INT
     * @param shed : the shed is a custom class which takes a lenght and width, SHED
     * @param roofangle : the angle of the carport INT
     * @param price: the price is a value which is instantiated in another class for the carport.
     */
    public Carport(int length, int heigth, int width, Shed shed, int roofangle, int price) {
        this.length = length;
        this.heigth = heigth;
        this.width = width;
        this.shed = shed;
        this.roofangle = roofangle;
        this.price = price;
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

    public Shed getShed() {
        return shed;
    }

    public void setShed(Shed shed) {
        this.shed = shed;
    }

    public int getRoofangle() {
        return roofangle;
    }

    public void setRoofangle(int roofangle) {
        this.roofangle = roofangle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
