/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoproyect.arreglo.Pilas;

import com.mycompany.algoproyect.arreglo.Arreglos.cProducto;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author INTEL
 */
public class Pila {
     private cProducto[] pila;
    private int tope;

    public Pila(int n) {
        pila = new cProducto[n];
        pilaVacia();
    }

    public void pilaVacia() {
        tope = -1;
    }

    public void apilar(cProducto valor) {
        int indMayor = pila.length - 1;
        if (tope < indMayor) {
            tope++;
            pila[tope] = valor;
        }
    }

    public cProducto desapilar() {
        cProducto valor = null;
        if (tope >= 0) {
            valor = pila[tope];
            tope--;
        }
        return valor;
    }

    public cProducto accesar() {
        cProducto valor = null;
        if (tope >= 0) {
            valor = pila[tope];
        }
        return valor;
    }

    public String muestraArreglo() {
        String cadena = "";
        if (tope >= 0) {
            for (int i = 0; i <= tope; i++) {
                cadena += pila[i] + " - ";
            }
        }
        return cadena;
    }

    public void mostrarEnTabla(JTable tabla) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0); // Limpiar tabla

        for (int i = tope; i >= 0; i--) {
            cProducto p = pila[i];
            if (p != null) {
                Object[] fila = {
                    p.getCodpro(),
                    p.getNombre(),
                    p.getUnipre(),
                    p.getCantcomp(),
                    p.getUnipre() * p.getCantcomp()
                };
                model.addRow(fila);
            }
        }
    }

    public boolean estaLlena() {
        return tope == pila.length - 1;
    }

    public boolean estaVacia() {
        return tope == -1;
    }

    public int getTope() { //obtener tope
        return tope;
    }

    public cProducto getElemento(int i) { 
        if (i >= 0 && i <= tope) {
            return pila[i];
        }
        return null;
    }
    
    public int getCapacidad() {
    return pila.length;
}

}
