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

        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                for (int k = i + 1; k < j; k++) {
                    if (esCaminoValido(T[i][k], C[k][j])) {
                        int costoConEscala = T[i][k] + C[k][j];
                        C[i][j] = Math.min(C[i][j], costoConEscala);
                    }
                }
            }
        }
        return C;
    }
    private static boolean esCaminoValido(int a, int b) {
        return a != Integer.MAX_VALUE && b != Integer.MAX_VALUE;
    }
    
}
