package com.campusdual.classroom;


public class Exercise07 {

    public static void main(String[] args) {
        int N = 10;

        System.out.println("Suma de los primeros " + N + " números naturales: " + sumFirstNaturalNumbers(N));
        System.out.print("Los primeros " + N + " números naturales: ");
        showFirstNaturalNumbers(N);
        positionInAList(8);

    }

    // ESTE METODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        int[] numbers = new int[11];  // Array de tamaño 11 para los números 0 a 10

        for (int i = 0; i <= 10; i++) {
            numbers[i] = i;
        }
        boolean found = false; //Al finalizar el bucle si found es false, significa q el número num no se encontraba en el array.
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num) {
                System.out.println("El elemento " + num + " se encuentra en la posición: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("El elemento " + num + " no se encuentra en la lista.");
        }
    }

    // Que imprima como mensaje la suma de los primeros N números positivos
    public static int sumFirstNaturalNumbers(int num) {
        int sum = (num * (num + 1)) / 2;
        System.out.println("La suma de los primeros " + num + " números naturales es: " + sum);
        return sum;
    }

    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
