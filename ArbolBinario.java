/**
 * ArbolBinario
 */
public class ArbolBinario {

    Nodo raiz;

    ArbolBinario() {
        raiz = null;
    }

//INSERTAR

    void insertar(int valor){
        raiz = insertarRec(raiz, valor);
    }

    Nodo insertarRec(Nodo nodo, int valor) {
        //INSERTAR primer VALOR
        if (nodo == null) { 
            nodo = new Nodo(valor);
            return nodo;
        }
        //COMPARA con los valores INSERTADOS
        if (valor < nodo.dato) {
        nodo.izquierda = insertarRec(nodo.izquierda, valor);
        }else if (valor > nodo.dato){
            nodo.derecha = insertarRec(nodo.derecha, valor);
        }

        //Regresa los datos ya resueltos
        return nodo;
    }

    //IN ORDEN

    //De Izquierda a Derecha

    void imprimirInOrden(){
        imprimirInOrdenRec(raiz);
    }

    void imprimirInOrdenRec(Nodo nodo){
        if(nodo != null){
            imprimirInOrdenRec(nodo.izquierda);
            System.out.print(nodo.dato + " ");
            imprimirInOrdenRec(nodo.derecha);
        }
    }

    //De Derecha a Izquierda

    void imprimirInOrdenD(){
        imprimirInOrdenRecD(raiz);
    }


    void imprimirInOrdenRecD(Nodo nodo){
        if(nodo != null){
            imprimirInOrdenRecD(nodo.derecha);
            System.out.print(nodo.dato + " ");
            imprimirInOrdenRecD(nodo.izquierda);
        }
    }

    //PREORDEN

    //I D
    void imprimirPreOrden(){
        imprimirPreOrdenRec(raiz);
    }

    void imprimirPreOrdenRec(Nodo nodo){
        if(nodo != null){
            System.out.print(nodo.dato + " ");
            imprimirPreOrdenRec(nodo.izquierda);
            imprimirPreOrdenRec(nodo.derecha);
        }
    }

    //D I
    void imprimirPreOrdenD(){
        imprimirPreOrdenRecD(raiz);
    }

    void imprimirPreOrdenRecD(Nodo nodo){
        if(nodo != null){
            System.out.print(nodo.dato + " ");
            imprimirPreOrdenRecD(nodo.derecha);
            imprimirPreOrdenRecD(nodo.izquierda);
        }
    }

    //POS ORDEN

    //I D
    void imprimirPostOrden(){
        imprimirPostOrdenRec(raiz);
    }

    void imprimirPostOrdenRec(Nodo nodo){
        if(nodo != null){
            imprimirPostOrdenRec(nodo.izquierda);
            imprimirPostOrdenRec(nodo.derecha);
            System.out.print(nodo.dato + " ");
        }
    }


    //D I
    void imprimirPostOrdenD(){
        imprimirPostOrdenRecD(raiz);
    }

    void imprimirPostOrdenRecD(Nodo nodo){
        if(nodo != null){
            imprimirPostOrdenRecD(nodo.derecha);
            imprimirPostOrdenRecD(nodo.izquierda);
            System.out.print(nodo.dato + " ");
        }
    }
}