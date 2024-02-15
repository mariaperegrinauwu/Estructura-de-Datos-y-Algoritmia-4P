import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Cola {
    private Queue<Integer> elementos;

    public Cola() {
        this.elementos = new LinkedList<>();
    }

    public void encolar(int dato) {
        elementos.offer(dato);
        System.out.println("Elemento ingresado: " + dato);
    }

    public int desencolar() {
        if (elementos.isEmpty()) {
            System.out.println("La cola está vacía");
            return -1;
        } else {
            int elementoDesencolado = elementos.poll();
            System.out.println("Elemento eliminado: " + elementoDesencolado);
            return elementoDesencolado;
        }
    }

    public void mostrar() {
        if (elementos.isEmpty()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("Cola: " + elementos);
        }
    }
}

public class cola_uwu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cola cola = new Cola();

        int opcion;

        System.out.println("\nBienvenido al programa de cola! <3");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Agregar");
            System.out.println("2. Eliminar");
            System.out.println("3. Mostrar");
            System.out.println("0. Salir");

            System.out.print("\nEscoge una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el elemento: ");
                    int elementoEncolar = scanner.nextInt();
                    cola.encolar(elementoEncolar);
                    break;

                case 2:
                    cola.desencolar();
                    break;

                case 3:
                    cola.mostrar();
                    break;

                case 0:
                    System.out.println("\nSaliste del programa. Adiós uwu\n");
                    break;

                default:
                    System.out.println("\nX Opción Invalida X");
                    break;
            }

        } while (opcion != 0);

        scanner.close();
    }
}