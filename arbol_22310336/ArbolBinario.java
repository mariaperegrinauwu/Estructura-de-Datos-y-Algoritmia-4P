/**
 * ArbolBinario
 */
public class ArbolBinario {

    hoja raiz;

    ArbolBinario() {
        raiz = null;
    }

//INSERTAR

    void insertar(int valor){
        raiz = organizar(raiz, valor);
    }

//Insertar el valor que se ingresó en el árbol haciendo
//la comparación para organizar el dato en el árbol
//(dónde va cuál)

    hoja organizar(hoja nodo, int valor) {
        //INSERTAR primer VALOR
        if (nodo == null) { 
            nodo = new hoja(valor);
            return nodo;
        }
        //COMPARA con los valores INSERTADOS
        if (valor < nodo.dato) {
        nodo.izquierda = organizar(nodo.izquierda, valor);
        }else if (valor > nodo.dato){
            nodo.derecha = organizar(nodo.derecha, valor);
        }

        //Regresa los datos ya resueltos
        return nodo;
    }

    //IN ORDEN

    //De Izquierda a Derecha

    void imprimirInOrden(){
        imprimirInOrdenRec(raiz);
    }

    void imprimirInOrdenRec(hoja nodo){
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


    void imprimirInOrdenRecD(hoja nodo){
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

    void imprimirPreOrdenRec(hoja nodo){
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

    void imprimirPreOrdenRecD(hoja nodo){
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

    void imprimirPostOrdenRec(hoja nodo){
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

    void imprimirPostOrdenRecD(hoja nodo){
        if(nodo != null){
            imprimirPostOrdenRecD(nodo.derecha);
            imprimirPostOrdenRecD(nodo.izquierda);
            System.out.print(nodo.dato + " ");
        }
    }

    //ESCALERITA

    void imprimirEscalera() {
        if (raiz == null) {
            System.out.println("El árbol está vacío");
            return;
        }

        hoja[] lista = new hoja[10];
        int cabeza = 0, cola = 0;
        int pisoAct = 1, pisoSig = 0;

        lista[cola++] = raiz;

        while (cabeza != cola) {
            hoja nodo = lista[cabeza++];
            System.out.print(nodo.dato + "\t");
            pisoAct--;

            if (nodo.izquierda != null) {
                lista[cola++] = nodo.izquierda;
                pisoSig++;
            }

            if (nodo.derecha != null) {
                lista[cola++] = nodo.derecha;
                pisoSig++;
            }

            if (pisoAct == 0) {
                System.out.println();
                pisoAct = pisoSig;
                pisoSig = 0;
            }
        }
    }

}

