/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import DataLayer.DataMappers.CarportMapper;
import DataLayer.DataMappers.OrderMapper;
import Logic.Facade.CarportFacade;
import java.util.ArrayList;

/**
 *
 * @author ahmed
 */
public class dataTest {
    
    public static void main(String[] args) throws Exception {
        ArrayList<Materials> material = new ArrayList();
        
        CarportMapper datatest = new CarportMapper();
        System.out.println("hello world");
        System.out.println(datatest.getMatiralName(2));
       
        
        System.out.println("simone a");
        System.out.println(datatest.getRoofMaterial(3));
        System.out.println("simone b");
        // System.out.println(datatest.getShedHeigth(1));
        System.out.println("simone c");
        System.out.println(datatest.getShedlength(1));
        System.out.println("simone d");
        System.out.println(datatest.getShedwidth(1));
        System.out.println("simone e");
        System.out.println(datatest.getMaxAngles());
        System.out.println(CarportFacade.getRoofMaterial(1));
        System.out.println(CarportFacade.getRoofMaterial(2));
        System.out.println(CarportFacade.getMatiralName(3));
        System.out.println(CarportFacade.getmaxmatiralnum());
        System.out.println(CarportFacade.getMaxLength());
        System.out.println(CarportFacade.getMaxAngles());
        System.out.println(CarportFacade.getMaxWidth());
        System.out.println(CarportFacade.getMaxRoofMaterial());
        System.out.println(CarportFacade.getShedwidth(3));
        System.out.println(CarportFacade.getShedlength(1));
        System.out.println(CarportFacade.getRoofAngle(6));
        System.out.println(CarportFacade.getCarportLength(2));
        System.out.println(CarportFacade.getCarportWidth(1));
        System.out.println(CarportFacade.getMaxShedWidth());
        System.out.println(CarportFacade.getMaxShedLength());
        
        OrderMapper om = new OrderMapper();
        System.out.println(om.getAllOrders().toString());
        
    }
    
}
