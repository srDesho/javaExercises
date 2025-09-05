package com.cristianml;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Puedes probar con diferentes arrays aquí
        int[] nums = {1, 1, 1, 2, 2,2,4,4,4,4,4,4,5,5,5,5,10,10,10};

        System.out.println("--- PRUEBA DE REEMOVIENDO DUPLICADOS ---");
        System.out.println("Array inicial: " + Arrays.toString(nums));

        // Instanciamos la misma clase para llamar al método
        Main programa = new Main();
        int k = programa.removeDuplicates(nums);

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Valor de k (retornado): " + k);
        System.out.println("Array final en memoria: " + Arrays.toString(nums));

        // Lo que el Juez de LeetCode vería:
        System.out.print("Resultado que el Juez valida: [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + (i < k - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    public int removeDuplicates(int[] nums) {
        int k = 1;

        // Caso: Longitud 1
        if (nums.length == 1) {
            return k;
        }


        // Bucle de intercambio (mover duplicados al final)
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}