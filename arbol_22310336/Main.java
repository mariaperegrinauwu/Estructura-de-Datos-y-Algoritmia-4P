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

        System.out.println("\n¡Bienvenido al programa de ÁRBOL BINARIO!");

        System.out.println("\n5   3   7   2   4");

        System.out.println("\n\n-> Impresión de árbol binario:");


//IN ORDEN

        System.out.println("\nIN Orden Izquierda -> Derecha");
        arbol.imprimirInOrden();

        System.out.println("\n\nIN Orden Derecha -> Izquierda");
        arbol.imprimirInOrdenD();

//POST ORDEN (Tierrita)

        System.out.println("\n\nPOST Orden Izquierda -> Derecha");
        arbol.imprimirPostOrden();

        System.out.println("\n\nPOST Orden Derecha -> Izquierda");
        arbol.imprimirPostOrdenD();

//PRE ORDEN

        System.out.println("\n\nPRE Orden Izquierda -> Derecha");
        arbol.imprimirPreOrden();

        System.out.println("\n\nPRE Orden Derecha -> Izquierda");
        arbol.imprimirPreOrdenD();

//ESCALERA

        System.out.println("\n\nÁrbol balanceado");

        arbol.imprimirEscalera();
    }
}