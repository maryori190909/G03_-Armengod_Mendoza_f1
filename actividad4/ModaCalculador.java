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

        for (int num : arreglo) {
            int frecuenciaActual = frecuencias.getOrDefault(num, 0) + 1;
            frecuencias.put(num, frecuenciaActual);
        
            if (frecuenciaActual > maxFrecuencia) {
                maxFrecuencia = frecuenciaActual;
                moda = num;
        }
    }
    return moda;
}
}

public static void main(String[] args) {
    int[] datos = {3, 2, 2, 5, 3, 2, 1, 2, 5};
    int resultado = calcularModa(datos);
    System.out.println("la moda es: " + resultado);
}

