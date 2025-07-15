/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LES;

import Arreglos.cProducto;

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
     
     
    public void eliminaNodoxFinal(int codigo) {
    if (inicio != null) {
        if (inicio.getDato().getCodpro() == codigo) {
            inicio = inicio.getSgte();        
        } else {
            p = inicio;                
            while (p.getSgte() != null && p.getSgte().getDato().getCodpro() != codigo) {
                p = p.getSgte();
            }
            if (p.getSgte() != null) {
                p.setSgte(p.getSgte().getSgte());
            }
        }
    }
    }
    public cProducto buscarProducto(int codigo) {
        
        cProducto bp = null;
        p = inicio;
        while (p != null) {
            if (p.getDato().getCodpro() == codigo) {
                bp =  p.getDato();
            }
            p = p.getSgte();
        }
        return bp;
    }
     public boolean actualizarProducto(int codigo, double nuevoPrecio, int nuevaCantidad) {
        boolean ret = false;
        cProducto prod = buscarProducto(codigo);
        if (prod != null) {
            prod.setUnipre(nuevoPrecio);
            prod.setCantcomp(nuevaCantidad);
            ret = true;
        }
        return ret;
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
