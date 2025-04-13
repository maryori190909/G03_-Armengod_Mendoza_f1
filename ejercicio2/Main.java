package ejercicio2;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[][] arreglos = {
            {4,2,7,10,4,17},
            {4,2,7,10,4,1,6},
            {9,2,7,1,7}
        };
        int[] ks = {3, 5, 4};

        for (int i = 0; i < arreglos.length; i++) {
            int[] arr = arreglos[i];
            int k = ks[i];
            try {
                int resultado = QuickSelect.findKthSmallest(arr, k);
                System.out.println("entrada: " + Arrays.toString(arr) + ", k = " + k);
                System.out.println("el " + k + " elemento mas pequeno es: " + resultado);
            }

        }
    }

}
