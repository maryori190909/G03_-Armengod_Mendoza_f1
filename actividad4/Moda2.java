package actividad4;

public class Moda2 {
    if (array.length == 0) {
        throw new IllegalArgumentException("el arreglo no puede estar vacio.");
    }
    int i = 1;
    int inicio = 0;
    int fin = array.length - 1;
    int moda = array[0];
    int frecuencia = 1;
    int maxFrecuencia = 1;
    while (i <= fin) {
        if (array[i] == array[inicio]) {
            frecuencia++;
        }
        else {
            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                moda = array[inicio];
            }
            inicio = i;
            frecuencia = 1;
        }
    i++;
    }


}
