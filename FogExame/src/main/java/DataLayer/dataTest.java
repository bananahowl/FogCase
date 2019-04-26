/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import java.util.ArrayList;

/**
 *
 * @author ahmed
 */
public class dataTest {
    
    public static void main(String[] args) throws Exception {
        ArrayList<Materials> material = new ArrayList();
        
        DataMapper datatest = new DataMapper();
        System.out.println("hello world");
        System.out.println(datatest.getMatiralName(2));
       
        
        System.out.println("simone");
        System.out.println(datatest.getRoofMaterial(3));
        System.out.println("simone");
        // System.out.println(datatest.getShedHeigth(1));
        System.out.println("simone");
        System.out.println(datatest.getShedlength(1));
        System.out.println("simone ");
        System.out.println(datatest.getShedwidth(1));
        System.out.println("simone ");
        
    }
    
}
