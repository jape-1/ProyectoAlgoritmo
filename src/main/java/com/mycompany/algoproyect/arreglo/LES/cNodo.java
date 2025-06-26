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
public class cNodo {
    private cProducto dato;
    private cNodo sgte;

    public cProducto getDato() {
        return dato;
    }

    public void setDato(cProducto dato) {
        this.dato = dato;
    }

    public cNodo getSgte() {
        return sgte;
    }

    public void setSgte(cNodo sgte) {
        this.sgte = sgte;
    }

    
}
