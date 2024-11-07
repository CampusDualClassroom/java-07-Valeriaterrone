package com.campusdual.classroom;


public class Exercise07 {

    public static void main(String[] args) {
        int N = 10;

        System.out.println("Suma de los primeros " + N + " números naturales: " + sumFirstNaturalNumbers(N));
        System.out.print("Los primeros " + N + " números naturales: ");
        showFirstNaturalNumbers(N);
    }


    // ESTE METODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
     }


    // Que imprima como mensaje la suma de los primeros N números positivos
    public static int sumFirstNaturalNumbers(int num) {
        return (num * (num + 1)) / 2;
    }


    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
