import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = scan.nextInt();

        System.out.println("Enter the number of colums");
        int col = scan.nextInt() ;

        int[][] array = new int[row][col];
        int[][] newArray = new int[row][col];

        // We ask the user to enter values:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter the value in te position [" + i + "][" + j + "]");
                int valor = scan.nextInt();
                array[i][j] = valor;
            }
        }
        System.out.println("Your created array");
        printArray(array);
        System.out.println();
        System.out.println("New array without the deleted position:");
        deletePositionK(array, newArray);
        printArray(newArray);
    }
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < (array[0].length); j++) {
                System.out.print("[" + array[i][j] + "]");
            }
            System.out.println();
        }
    }

//    public static void deletePositionK(int[][] array, int[][] newArray) {
//        int k1 = 0;
//        int k2 = 1;
//        int iNewArray = 0;
//        int count = 0;
//        boolean wasFound = false;
//
//        //while (iNewArray < ((newArray.length * newArray.length)) - 1) {
//            for (int i = 0; i < array.length; i++) {
//                for (int j = 0; j < array[i].length; j++) {
//                    if (k1 == i && k2 == j) {
//                        wasFound = true;
//                    } else {
//                         if (wasFound) {
//                             System.out.print("[" + array[i][j] + "]" );
//                        } else {
//                             System.out.print("[" + array[i][j] + "]" );
//                        }
//                    }
//                }
//                System.out.println();
//            }
//           // count++;
//          //  iNewArray++;
//        //}
//        //printArray(newArray);
//    }




//    public static void deletePositionK(int[][] array, int[][] newArray) {
//        int k1 = 2;
//        int k2 = 1;
//        int iNewArray = 0;
//        boolean wasFound = false;
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (k1 == i && k2 == j) {
//                    wasFound = true;
//                } else {
//                    if (wasFound) {
//                        newArray[iNewArray / newArray.length][iNewArray % newArray.length] = array[i][j];
//                        iNewArray++;
//                    } else {
//                        newArray[iNewArray / newArray.length][iNewArray % newArray.length] = array[i][j];
//                        iNewArray++;
//                    }
//                }
//            }
//        }
//
//        // count++;
//        //  iNewArray++;
//        //}
//        printArray(newArray);
//    }



    public static void deletePositionK(int[][] array, int[][] newArray) {
        int k1 = 0; // Fila de la posición a eliminar
        int k2 = 1; // Columna de la posición a eliminar
        int iNewArray = 0; // Índice para la nueva matriz
        boolean wasFound = false; // Indica si se encontró la posición a eliminar

        // Iterar sobre la matriz original
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // Verificar si la posición actual es la posición a eliminar
                if (k1 == i && k2 == j) {
                    wasFound = true; // Establecer que se encontró la posición
                } else {
                    // Almacenar el elemento en la nueva matriz
                    newArray[iNewArray / newArray.length][iNewArray % newArray.length] = array[i][j];
                    iNewArray++; // Incrementar el índice de la nueva matriz
                }
            }
        }
    }

}
