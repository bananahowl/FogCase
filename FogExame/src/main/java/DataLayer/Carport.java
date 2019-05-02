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
public class Carport {
    private int length;
    private int heigth;
    private int width;
    private Shed shed;
    private int roofangle;

    public Carport(int length, int heigth, int width, Shed shed, int roofangle) {
        this.length = length;
        this.heigth = heigth;
        this.width = width;
        this.shed = shed;
        this.roofangle = roofangle;
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

    
}
