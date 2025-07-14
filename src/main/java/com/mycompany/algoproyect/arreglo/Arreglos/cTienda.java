/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoproyect.arreglo.Arreglos;

import com.mycompany.algoproyect.arreglo.Arreglos.cProducto;
import java.util.Arrays;

/**
 *
 * @author gianc
 */
public class cTienda {
    
    private cProducto[] arreglo_productos;
    private int indMax;
    private int ultInd;
    
    public cTienda(int n){
        arreglo_productos =  new cProducto[n];
        indMax = arreglo_productos.length-1;
        ultInd = -1;
    }

    public cProducto[] getArreglo_productos() {
        return arreglo_productos;
    }

    public void setArreglo_productos(cProducto[] arreglo_productos) {
        this.arreglo_productos = arreglo_productos;
    }
    

    public int getIndMax() {
        return indMax;
    }

    public void setIndMax(int indMax) {
        this.indMax = indMax;
    }

    public int getUltInd() {
        return ultInd;
    }

    public void setUltInd(int ultInd) {
        this.ultInd = ultInd;
    }
    

//    public void agregar(cProducto producto){
//        for (int i = 0; i <= indMax; i++) {
//            if(arreglo_productos[i] == null){
//                arreglo_productos[i] = producto;
//                ultInd++;
//                break;
//            }
//        }
//    }
    public boolean agregar(cProducto producto){
        boolean ret = false;
        if (ultInd <indMax){
            ultInd++;
            arreglo_productos[ultInd] = producto;
            ret = true;
        }    
        return ret;
    }
    
    public String mostrar(){
        String msg = Arrays.toString(arreglo_productos);
        return msg;
    }
    
    //La salida tiene ser logica
    public cProducto buscarxCod(int codigo){
        cProducto produc = null;
        for(int i = 0; i <= ultInd; i++){
            if(arreglo_productos[i] != null && arreglo_productos[i].getCodpro() == codigo){
                produc = arreglo_productos[i];
            }
        }
        return produc;
    }
    
//    public cProducto buscarxNombre(String nombre){
//        cProducto produc_encontrado = null;
//        for(int i = 0; i <= ultInd; i++){
//            if(arreglo_productos[i] != null){
//                if(arreglo_productos[i].getNombre().equalsIgnoreCase(nombre)){
//                    produc_encontrado = arreglo_productos[i];
//                }
//            }
//        }
//        return produc_encontrado;
//        
//    }
    
//  
    public boolean eliminarProd(int codigo) {
        boolean ret = false;
        for (int i = 0; i <= ultInd; i++) {
            if (arreglo_productos[i] != null && arreglo_productos[i].getCodpro() == codigo) {
                for (int j = i; j < ultInd; j++) {
                    arreglo_productos[j] = arreglo_productos[j + 1];
                }
                arreglo_productos[ultInd] = null; 
                ultInd--; 
                ret = true; 
            }
        }
        return ret; 
    }
    
    public boolean actualizar(int codigo, String nuevoNombre, double nuevoPrecio, int nuevaCantidad) {
        boolean ret = false;
        for (int i = 0; i <= ultInd; i++) {
            if (arreglo_productos[i] != null && arreglo_productos[i].getCodpro() == codigo) {
                arreglo_productos[i].setNombre(nuevoNombre);
                arreglo_productos[i].setUnipre(nuevoPrecio);
                arreglo_productos[i].setCantcomp(nuevaCantidad);
                ret = true; 
            }
        }
        return ret; 
    }


    
    
}
