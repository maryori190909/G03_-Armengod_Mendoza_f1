package actividad4;

import java.util.HashMap;
import java.util.Map;

public class ModaCalculador {
    public static int calcularModa(int[] arreglo) {
        if (arreglo.length == 0) {
            throw new IllegalArgumentException("el arreglo no debe estar vacio.");
        }
        Map<Integer, Integer> frecuencias = new HashMap<>();
        int moda = arreglo[0];
        int maxFrecuencia = 1;
    }
}

