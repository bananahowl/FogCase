/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

/**
 *
 * @author fskn
 */
public class Roof_area {
    
    private int id;
    private int width;
    private int length;
    private int height;
    private int degree; 

    public Roof_area(int id, int width, int length, int height, int degree) {
        this.id = id;
        this.width = width;
        this.length = length;
        this.height = height;
        this.degree = degree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Roof_area{" + "id=" + id + ", width=" + width + ", length=" + length + ", height=" + height + ", degree=" + degree + '}';
    }
    
}
