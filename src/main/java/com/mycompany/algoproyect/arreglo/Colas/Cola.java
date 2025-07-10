/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoproyect.arreglo.Colas;

import com.mycompany.algoproyect.arreglo.Arreglos.cProducto;

/**
 *
 * @author INTEL
 */
public class Cola {
     private cProducto[] cola;
    private int first, last, tamano;

    
   
    
    public Cola(int n) {
        cola = new cProducto[n];
        colaVacia();
    }

    public void colaVacia() {
        first = -1;
        last = -1;
        tamano = 0;
    }

    public boolean colaestaVacia() {
        return tamano == 0;
    }

    public boolean colaestaLlena() {
        return tamano == cola.length;
    }

    public void insertaElemento(cProducto prod) {
        if (!colaestaLlena()) {
            last = (last + 1) % cola.length;
            cola[last] = prod;
            tamano++;
            if (first == -1) {
                first = 0;
            }
        }
    }

    public cProducto eliminaElemento() {
        cProducto eliminado = null;
        if (!colaestaVacia()) {
            eliminado = cola[first];
            first = (first + 1) % cola.length;
            tamano--;
            if (tamano == 0) {
                colaVacia();
            }
        }
        return eliminado;
    }

    public cProducto accesarCola() {
        if (!colaestaVacia()) {
            return cola[first];
        }
        return null;
    }

    public String recorreArreglo() {
        String msg = "";
        if (!colaestaVacia()) {
            for (int i = 0; i < tamano; i++) {
                int indice = (first + i) % cola.length;
                msg += cola[indice].toString() + "\n";
            }
        } else {
            msg = "Cola vacía.";
        }
        return msg;
    }
}
