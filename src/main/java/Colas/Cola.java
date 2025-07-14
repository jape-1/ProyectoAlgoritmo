/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colas;

import Arreglos.cProducto;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author INTEL
 */
public class Cola {
    private cProducto[] cola;
    private int first, last, tamaño, cantidad;

    public Cola(int n) {
        tamaño = n;
        cola = new cProducto[tamaño];
        colaVacia();
    }

    public void colaVacia() {
        first = 0;
        last = 0;
        cantidad = 0;
    }

    public void insertaElemento(cProducto valor) {
        if (cantidad < tamaño) {
            cola[last] = valor;
            last = (last + 1) % tamaño;
            cantidad++;
        } 
    }

    public cProducto eliminaElemento() {
        cProducto valor = null;
        if (cantidad > 0) {
            valor = cola[first];
            first = (first + 1) % tamaño;
            cantidad--;
        }
        return valor;
    }

    public void mostrarEnTabla(JTable tabla) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0); // Limpiar la tabla

        int i = first;
        int cont = 0;
        while (cont < cantidad) {
            cProducto p = cola[i];
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
            i = (i + 1) % tamaño;
            cont++;
        }
    }

  //metodos para la cola circular 
  
    
    public boolean estaLlena() {
    return cantidad == tamaño;
    }

    public boolean estaVacia() {
    return cantidad == 0;
    }
}
