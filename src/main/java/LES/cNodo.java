package LES;

import Arreglos.cProducto;

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
