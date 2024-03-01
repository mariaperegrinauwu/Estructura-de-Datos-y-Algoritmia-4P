public class Main {
    public static void main(String[] args){
        ArbolBinario arbol = new ArbolBinario();

//El primer valor insertado siempre es la cabeza del árbol

//Se manda llamar la función INSERTAR

        arbol.insertar(5);
        arbol.insertar(3);
        arbol.insertar(7);
        arbol.insertar(2);
        arbol.insertar(4);

        System.out.println("Impresión de árbol binario:");

//IN ORDEN

        System.out.println("\nIN Orden I -> D");
        arbol.imprimirInOrden();

        System.out.println("\n\nIN Orden D -> I");
        arbol.imprimirInOrdenD();

//POST ORDEN (Tierrita)

        System.out.println("\n\nPOST Orden I -> D");
        arbol.imprimirPostOrden();

        System.out.println("\n\nPOST Orden D -> I");
        arbol.imprimirPostOrdenD();

//PRE ORDEN

        System.out.println("\n\nPRE Orden I -> D");
        arbol.imprimirPreOrden();

        System.out.println("\n\nPRE Orden D -> I");
        arbol.imprimirPreOrdenD();
    }
}