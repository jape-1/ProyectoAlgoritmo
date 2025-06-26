/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoproyect.arreglo.LES;

import com.mycompany.algoproyect.arreglo.Arreglos.cProducto;

/**
 *
 * @author INTEL
 */
public class LES {
    private cNodo inicio, p, nuevo;
    
    
    
     public void insertaNodoxFinal(cProducto prod){
        nuevo = new cNodo();
        nuevo.setDato(prod);
        if(inicio == null)
            inicio = nuevo;
        else{
            p = inicio;
            while(p.getSgte() != null){
                p = p.getSgte();
            }
            p.setSgte(nuevo);
        }
    }
     
     //sin boolean
     public boolean eliminaNodoxFinal(int codigo){
        if (inicio == null) return false;
        if (inicio.getDato().getCodpro() == codigo) {
            inicio = inicio.getSgte();
            return true;
        } else {
            p = inicio;
            while (p.getSgte() != null) {
                if (p.getSgte().getDato().getCodpro() == codigo) {
                    p.setSgte(p.getSgte().getSgte());
                    return true;
                }
                p = p.getSgte();
            }
        }
        return false;
    }
     
     
     public cProducto buscarProducto(int codigo) {
        p = inicio;
        while (p != null) {
            if (p.getDato().getCodpro() == codigo) {
                return p.getDato();
            }
            p = p.getSgte();
        }
        return null;
    }
     public boolean actualizarProducto(int codigo, double nuevoPrecio, int nuevaCantidad) {
        cProducto prod = buscarProducto(codigo);
        if (prod != null) {
            prod.setUnipre(nuevoPrecio);
            prod.setCantcomp(nuevaCantidad);
            return true;
        }
        return false;
    }
     public String recorreLE(){
        String cadena="Lista Vacia";
        if(inicio != null){
            cadena="";
            p = inicio;
            while(p != null){
                cProducto prod = p.getDato();
                cadena += prod.getCodpro() + " - " + prod.getNombre() + " - " + prod.getUnipre() + " x " + prod.getCantcomp() + " = " + (prod.getUnipre() * prod.getCantcomp()) + "\n";
                p = p.getSgte();
            }
        }
        return cadena;
    }
     public double calcularTotal() {
        double total = 0;
        p = inicio;
        while (p != null) {
            cProducto prod = p.getDato();
            total += prod.getUnipre() * prod.getCantcomp(); // sin usar getImporte()
            p = p.getSgte();
        }
        return total;
    }
      public cNodo getInicio() {
        return inicio;
    }
}
