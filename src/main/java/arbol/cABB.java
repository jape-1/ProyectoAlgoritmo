
package arbol;

import Arreglos.cProducto;
import Arreglos.cTienda;

public class cABB {
    private cNodoabb raiz, nuevo, p;

    public cABB() {
        raiz = null;
    }

    public void ingresarProducto(cProducto prod) {
        nuevo = new cNodoabb(prod);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            p = raiz;
            insertaNodo(p);
        }
    }

    private void insertaNodo(cNodoabb p) {
        if (nuevo.getProducto().getCodpro() > p.getProducto().getCodpro()) {
            if (p.getDer() == null) {
                p.setDer(nuevo);
            } else {
                insertaNodo(p.getDer());
            }
        } else {
            if (p.getIzq() == null) {
                p.setIzq(nuevo);
            } else {
                insertaNodo(p.getIzq());
            }
        }
    }

//    public String muestraProductos(int tipo) {
//        p = raiz;
//        if (tipo == 1)
//            return preOrden(p);
//        if (tipo == 2)
//            return inOrden(p);
//        return "";
//    }
//
//    private String preOrden(cNodoabb p) {
//        String cadena = "";
//        if (p != null) {
//            cadena += p.getProducto().toString() + "\n";
//            cadena += preOrden(p.getIzq());
//            cadena += preOrden(p.getDer());
//        }
//        return cadena;
//    }
//
//    private String inOrden(cNodoabb p) {
//        String cadena = "";
//        if (p != null) {
//            cadena += inOrden(p.getIzq());
//            cadena += p.getProducto().toString() + "\n";
//            cadena += inOrden(p.getDer());
//        }
//        return cadena;
//    }
    
//  
    
    // Este método es para cuando presionas el botón "Mostrar PreOrden"
    public void llenarTiendaPreOrden(cTienda tienda) {
        // Reiniciamos la tienda para evitar duplicados si el botón se presiona varias veces
        tienda.setUltInd(-1);
        llenarPreOrden(raiz, tienda);
    }

    // Este método es para cuando presionas el botón "Mostrar InOrden"
    public void llenarTiendaInOrden(cTienda tienda) {
        tienda.setUltInd(-1);
        llenarInOrden(raiz, tienda);
    }

    private void llenarPreOrden(cNodoabb nodo, cTienda tienda) {
        if (nodo != null) {
            tienda.agregar(nodo.getProducto());
            llenarPreOrden(nodo.getIzq(), tienda);
            llenarPreOrden(nodo.getDer(), tienda);
        }
    }

    private void llenarInOrden(cNodoabb nodo, cTienda tienda) {
        if (nodo != null) {
            llenarInOrden(nodo.getIzq(), tienda);
            tienda.agregar(nodo.getProducto());
            llenarInOrden(nodo.getDer(), tienda);
        }
    }
    
}
