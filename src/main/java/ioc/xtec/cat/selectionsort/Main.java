/**
 * Autor: Berta Álvarez
 * Versió: 1.1
 * Descripció: Aquesta classe conté el punt d'entrada principal per executar el programa.
 */
package ioc.xtec.cat.selectionsort;

import java.util.Scanner;

public class Main {

    /**
     * Punt d'entrada principal del programa.
     *
     * @param args Arguments de la línia de comandaments (no utilitzats).
     */
    public static void main(String[] args) {
        // Mostra el missatge de presentació
        System.out.println("Hola, em dic Berta Álvarez! M'està agradant M08 encara "
                + "que he perdut molt de temps amb m.");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix la mida de l'array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Introdueix els elements de l'array:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        SelectionSort sorter = new SelectionSort();
        ArrayValidator validator = new ArrayValidator();

        try {
            // Valida l'array i executa les operacions principals
            validator.validateArray(array);

            System.out.print("Array original:");
            printArray(array);

            System.out.println("Introdueix un valor a buscar a l'array: ");
            int valueToSearch = scanner.nextInt();

            boolean contains = sorter.contains(array, valueToSearch);
            if (contains) {
                System.out.println("El valor " + valueToSearch + " existeix a l'array.");
            } else {
                System.out.println("El valor " + valueToSearch + " no existeix a l'array.");
            }

            sorter.sort(array);

            System.out.print("Array ordenat:");
            printArray(array);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    /**
     * Imprimeix els elements de l'array separat per espais.
     *
     * @param arr L'array a imprimir.
     */
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
