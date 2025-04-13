package ejercicio3;

public class ViajeMasBarato {
    public static int[][] calcularCostosMinimos(int[][] T) {
        int n = T.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    C[i][j] = 0;
                } else if (i < j) {
                    C[i][j] = T[i][j];
                } else {
                    C[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        
    }
    

}
