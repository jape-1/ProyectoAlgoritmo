/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoproyect.arreglo.Arreglos;

import com.mycompany.algoproyect.arreglo.Arreglos.cTienda;
import com.mycompany.algoproyect.arreglo.Arreglos.cProducto;
import java.util.Arrays;

/**
 *
 * @author gianc
 */
public class newk {
    
    
    
    public static void main(String[] args) {
        
        cProducto a = new cProducto( 1, "a",2,5);
        cProducto g = new cProducto( 2, "ab",2,5);
        cProducto t = new cProducto( 3, "abb",2,5);
        cProducto o = new cProducto( 4, "abbb",2,5);
        cProducto h = new cProducto( 5, "abbbb",2,5);
        
        
        cTienda b = new cTienda(6);
        
        b.agregar(a);
        b.agregar(g);
        b.agregar(t);
        b.agregar(o);
        b.agregar(h);
        
        
        System.out.println(b.mostrar());
        System.out.println(b.buscarxCod(4));
//        System.out.println(b.buscarxNombre("abb"));
        
        
    }
}
