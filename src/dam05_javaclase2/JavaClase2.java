/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam05_javaclase2;

import java.util.ArrayList;

/**
 *
 * @author Dani Alvarez
 */
public class JavaClase2 {

    private static int num;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Bienvenidos a la clase 2!");
        
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        
        for (int i=0; i<numeros.size(); i++) {
            num = numeros.get(i);
            System.out.println(num);
        }
    }
    
}
