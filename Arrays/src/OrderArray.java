public class OrderArray {
    public static void main(String[] args) {
        // Definir una matriz 3x3
        int[][] matriz = {
                {3, 0, 7},
                {6, 5, 4},
                {3, 2, 8}
        };

        // Ordenar la matriz de mayor a menor utilizando el método de la burbuja
        ordenarMatriz(matriz);

        // Imprimir la matriz ordenada
        System.out.println("Matriz ordenada de mayor a menor:");
        imprimirMatriz(matriz);
    }

    // Método para ordenar una matriz de mayor a menor utilizando el método de la burbuja
    public static void ordenarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                for (int k = 0; k < filas; k++) {
                    for (int l = 0; l < columnas; l++) {
                        if (matriz[i][j] > matriz[k][l]) {
                            int temp = matriz[i][j];
                            matriz[i][j] = matriz[k][l];
                            matriz[k][l] = temp;
                        }
                    }
                }
            }
        }
    }

    // Método para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}