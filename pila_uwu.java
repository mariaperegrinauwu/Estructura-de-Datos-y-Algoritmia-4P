import java.util.Scanner;

class Stack {
    private static final int MAX = 10;
    private int primero;
    private int[] elementos;

    public Stack() {
        primero = -1;
        elementos = new int[MAX];
    }

    public boolean isEmpty() {
        return primero == -1;
    }

    public boolean isFull() {
        return primero == MAX - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("\nLa pila llego a su máxima capacidad");
        } else {
            elementos[++primero] = data;
            System.out.println("\nIngrese el elemento: " + data);
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("\nLa pila esta vacia");
            return -1;
        } else {
            int poppedElement = elementos[primero--];
            System.out.println("\nElemento eliminado: " + poppedElement);
            return poppedElement;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("\nLa pila está vacia");
        } else {
            System.out.print("\nPila: ");
            for (int i = 0; i <= primero; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }
}

public class pila_uwu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();

        int choice;
        System.out.println("\nBienvenido al programa de lista! <3");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Agregar");
            System.out.println("2. Eliminar");
            System.out.println("3. Mostrar");
            System.out.println("0. Salir");

            System.out.print("\nEscoge una opción: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Ingresa el elemento: ");
                    int pushElement = scanner.nextInt();
                    stack.push(pushElement);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.display();
                    break;

                case 0:
                    System.out.println("\nSaliste del programa. Adiós uwu\n");
                    break;

                default:
                    System.out.println("\nX Opción Invalida X");
                    break;
            }

        } while (choice != 0);

        scanner.close();
    }
}