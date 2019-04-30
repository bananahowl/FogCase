/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

/**
 *
 * @author emils
 */
public class CarportWithShed {
    private Carport carport;
    private Shed shed;

    public CarportWithShed(Carport carport, Shed shed) {
        this.carport = carport;
        this.shed = shed;
    }

    public Carport getCarport() {
        return carport;
    }

    public void setCarport(Carport carport) {
        this.carport = carport;
    }

    public Shed getShed() {
        return shed;
    }

    public void setShed(Shed shed) {
        this.shed = shed;
    }
    
    
}
