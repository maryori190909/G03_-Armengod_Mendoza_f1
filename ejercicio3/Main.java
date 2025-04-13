package ejercicio3;

public class Main {
    public static void main(String[] args) {
        final int INF = Integer.MAX_VALUE;
        int[][] T = {
            { 0,3,1,6,INF },
            { 0,0,1,2,INF },
            { 0,0,0,1,4 },
            { 0,0,0,0,2 },
            { 0,0,0,0,0 }
        };
        System.out.println("matriz de tarifas directas :");
        ViajeMasBarato.mostrarMatriz(T);
        int[][] C = ViajeMasBarato.calcularCostosMinimos(T);

    }

}
