/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoproyect.arreglo;

/**
 *
 * @author gianc
 */
public class cProducto {
    
    private int codpro;
    private String nombre;
    private double unipre;
    private int cantcomp;

    public cProducto(int codpro, String nombre, double unipre, int cantcomp) {
        this.codpro = codpro;
        this.nombre = nombre;
        this.unipre = unipre;
        this.cantcomp = cantcomp;
    }

    
    public int getCodpro() {
        return codpro;
    }

    public void setCodpro(int codpro) {
        this.codpro = codpro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getUnipre() {
        return unipre;
    }

    public void setUnipre(double unipre) {
        this.unipre = unipre;
    }

    public int getCantcomp() {
        return cantcomp;
    }

    public void setCantcomp(int cantcomp) {
        this.cantcomp = cantcomp;
    }

    @Override
    public String toString() {
        return "cProducto{" + "codpro=" + codpro + ", nombre=" + nombre + ", unipre=" + unipre + ", CANTIDADCOMPRADA" + cantcomp + '}';
    }
    
    
    
    
    
    
}
