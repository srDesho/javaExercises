import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {
        // Vectors
        int vector [] = new int[4];
        vector[0] = 1;
        vector[1] = 2;
        vector[2] = 4;
        vector[3] = 8;

        int orderedVector[] = new int[4];

        // Order the elements from highest to lowest
        int i = 0;
        //int major = vector[1];

        while (i < vector.length) {
            int j = 0;
            while (j < 3) {
                int a;
                if (vector[j+1] > vector[j] ) {
                    a = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = a;

                }
                j++;
            }
            i++;
        }
        vectorIterator(vector);
    }
    // Vector Iterator
    public static void vectorIterator(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }

    }

}