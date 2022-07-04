package abb;

public class ArbolBinarioBusqueda {
    private Nodo raiz;

    public ArbolBinarioBusqueda() {
        raiz = null;
    }

    public boolean estaVacio() {
        return raiz == null;
    }

    /*
    Metodo recursivo para insertar un nodo a nuestro abb
     */
    private void insertar(Nodo padre, Nodo hijo, int dato) {
        if (hijo == null) {//caso base
            Nodo nuevo = new Nodo(null, dato, null);
            if (dato >= padre.getDato()) {
                padre.setDerecho(nuevo);
            } else {
                padre.setIzquierdo(nuevo);
            }

        } else {//llama recursiva
            if (dato >= padre.getDato()) {
                insertar(hijo, hijo.getDerecho(), dato);
            } else {
                insertar(hijo, hijo.getIzquierdo(), dato);
            }
        }
    }

    /*
    metodo auxiliar para insertar un nuevo nodo al abb
     */
    public void insertar(int dato) {
        if (estaVacio()) {
            Nodo nuevo = new Nodo(null, dato, null);
        } else {
            if (dato >= raiz.getDato()){
                insertar(raiz, raiz.getDerecho(), dato);
            }else {
                insertar(raiz, raiz.getIzquierdo(), dato);
            }
        }
    }
    /*
    metodo recursivo para recorrer/mostrar el arbol inOrden
     */
    private void mostrarInOrden(Nodo nodo){
        if (nodo == null){//caso base

        }else {//llamada recursiva
            mostrarInOrden(nodo.getIzquierdo());
            System.out.print(nodo.getDato() + "  ");
            mostrarInOrden(nodo.getDerecho());
        }
    }
    /*
    metodo auxiliar para recorer/mostrar el arbol inOrden
    */
    public void mostrarInOrden(){
        Nodo temp = raiz;
        mostrarInOrden(raiz);
        System.out.println();
    }
}

