/**
 * Autor: Berta Álvarez
 * Versió: 1.0
 * Descripció: Aquesta classe implementa l'algoritme de Selection Sort i altres operacions sobre arrays.
 */
package ioc.xtec.cat.selectionsort;

public class SelectionSort {

    /**
     * Ordena un array d'enters utilitzant l'algoritme de Selection Sort.
     *
     * @param arr L'array a ordenar.
     */
    public void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * Comprova si un array conté un valor especificat.
     *
     * @param arr   L'array a comprovar.
     * @param value El valor a cercar.
     * @return true si el valor es troba a l'array, false en cas contrari.
     * @throws IllegalArgumentException si l'array és nul.
     */
    public boolean contains(int[] arr, int value) {
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }

        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
}
