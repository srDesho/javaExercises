package com.cristianml;

/**
 * Ejercicio: Best Time to Buy and Sell Stock II
 * Objetivo: Encontrar el máximo beneficio posible permitiendo múltiples transacciones.
 */
public class BestTimeBuySellStockII {

    public static void main(String[] args) {
        // Casos de prueba de LeetCode
        int[] case1 = {7, 1, 5, 3, 6, 4}; // Salida esperada: 7
        int[] case2 = {1, 2, 3, 4, 5};    // Salida esperada: 4
        int[] case3 = {7, 6, 4, 3, 1};    // Salida esperada: 0

        System.out.println("Resultado Caso 1: " + maxProfit(case1));
        System.out.println("Resultado Caso 2: " + maxProfit(case2));
        System.out.println("Resultado Caso 3: " + maxProfit(case3));
    }

    /**
     * Método para calcular el beneficio máximo.
     * Se utiliza una estrategia Greedy (Codiciosa):
     * Sumamos todas las ganancias cada vez que el precio de mañana sea mayor al de hoy.
     * * @param prices Arreglo de precios por día
     * @return El beneficio total acumulado
     */
    public static int maxProfit(int[] prices) {
        int max = 0;

        // Recorremos el arreglo hasta el penúltimo elemento para evitar salirnos del índice
        for (int i = 0; i < prices.length - 1; i++) {
            // Si el precio del día siguiente es mayor al actual, capturamos esa ganancia
            if (prices[i] < prices[i + 1]) {
                // Matemáticamente, vender y comprar el mismo día para capturar subidas
                // consecutivas da el mismo resultado que esperar al pico más alto.
                max += prices[i + 1] - prices[i];
            }
        }

        return max;
    }
}