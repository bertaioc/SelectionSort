/**
 * Autor: Berta Álvarez
 * Versió: 1.0
 * Descripció: Aquesta classe valida arrays per assegurar-se que no són nuls ni buits.
 */
package ioc.xtec.cat.selectionsort;

public class ArrayValidator {

    /**
     * Valida que l'array proporcionat no sigui nul ni buit.
     *
     * @param arr L'array a validar.
     * @throws IllegalArgumentException si l'array és nul o buit.
     */
    public void validateArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException("L'array no pot estar buit.");
        }
    }
}

