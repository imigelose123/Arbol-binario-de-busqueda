import abb.ArbolBinarioBusqueda;

public class Main {
    public static void main(String[] args){
        ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();

        //insertar elementos
        abb.insertar(3);
        abb.insertar(2);
        abb.insertar(4);
        abb.insertar(1);
        abb.insertar(3);
        abb.insertar(5);
        abb.insertar(7);
        abb.insertar(6);

        //recorremos/mostramos los elementos del arbol inOrden
        abb.mostrarInOrden();
        //insertar elementos
        abb.insertar(8);
        abb.insertar(11);
        abb.insertar(2);

        //recorremos/mostramos los elementos del arbol inOrden
        abb.mostrarInOrden();
    }
}
