package ejercicio1;

import java.util.Arrays;

public class SubconjuntoConRestricciones {
    public static boolean esPotenciaDe2(int num) {
        return num > 0 && (num & (num - 1)) == 0;
    }
    public static boolean puedeSumar(int[] arr, int pos, int objetivo) {
        if (pos == arr.length) {
            return objetivo == 0;
        }
        int actual = arr[pos];
        if (esPotenciaDe2(actual)) {
            return puedeSumar(arr, pos + 1, objetivo - actual);
        }
        if (actual % 5 == 0 && pos + 1 < arr.length && arr[pos + 1] % 2 != 0) {
            return puedeSumar(arr, pos + 1, objetivo); // se salta
        }
        return puedeSumar(arr, pos + 1, objetivo - actual) || puedeSumar(arr, pos + 1, objetivo);

    }
    public static boolean verificarSuma(int[] entrada) {
        if (entrada.length < 3) return false;
        int n = entrada[0];
        int objetivo = entrada[entrada.length - 1];
        if (n <= 0 || n + 2 != entrada.length) return false;

    }
}
