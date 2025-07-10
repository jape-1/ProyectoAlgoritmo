/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoproyect.arreglo.Colas;

import com.mycompany.algoproyect.arreglo.Arreglos.cProducto;
import java.util.Arrays;

/**
 *
 * @author INTEL
 */
public class cProceso {
     private cProducto[] arreglo_productos;
    private int ultInd;
    
    public cProceso(int n){
        arreglo_productos =  new cProducto[n];
        ultInd = arreglo_productos.length-1;
    }

    public void agregar(cProducto producto){
        for (int i = 0; i <= ultInd; i++) {
            if(arreglo_productos[i] == null){
                arreglo_productos[i] = producto;
                break;
            }
        }
    }
    
    public String mostrar(){
        String msg = Arrays.toString(arreglo_productos);
        return msg;
    }
    
    public cProducto buscarxCod(int codigo){
        cProducto produc_encontrado = null;
        for(int i = 0; i <= ultInd; i++){
            if(arreglo_productos[i] != null){
                if(codigo == arreglo_productos[i].getCodpro()){
                    produc_encontrado = arreglo_productos[i];
                }
            }
            
        }
        return produc_encontrado;
    }
    
    public cProducto buscarxNombre(String nombre){
        cProducto produc_encontrado = null;
        for(int i = 0; i <= ultInd; i++){
            if(arreglo_productos[i] != null){
                if(arreglo_productos[i].getNombre().equalsIgnoreCase(nombre)){
                    produc_encontrado = arreglo_productos[i];
                }
            }
        }
        return produc_encontrado;
        
    }
    
    public void eliminar(int codigo) { //eliminar por codigo
    for (int i = 0; i <= ultInd; i++) {
        if (arreglo_productos[i] != null && arreglo_productos[i].getCodpro() == codigo) {
            arreglo_productos[i] = null;
            break;
        }
    }
}
    
    public cProducto[] getArreglo() {
    return arreglo_productos;
}
   
}