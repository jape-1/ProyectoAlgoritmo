package arbol;

import Arreglos.cProducto;

public class cNodoabb {

    private cProducto producto;
    private cNodoabb izq, der;

    public cNodoabb(cProducto producto) {
        this.producto = producto;
    }

    public cProducto getProducto() {
        return producto;
    }

    public void setProducto(cProducto producto) {
        this.producto = producto;
    }

    public cNodoabb getIzq() {
        return izq;
    }

    public void setIzq(cNodoabb izq) {
        this.izq = izq;
    }

    public cNodoabb getDer() {
        return der;
    }

    public void setDer(cNodoabb der) {
        this.der = der;
    }
}

