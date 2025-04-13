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

}
}
