package com.levochka108.privat.ex.x;
/**
 * Практика работы с матрицей
 */
public class MultiMatrix {
    public static void multiMatrix() {
        System.out.println("Одномерный массив");
        int[] number = {1, 2, 3, 4, 5}; // одмомерный массив

        System.out.println("Двумерный массив");
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(matrix[2][2]);

        String[][] strings = new String[2][2];
        strings[0][0] = "Hello";
        strings[1][0] = "JAVA";

        System.out.print(strings[0][0]);
        System.out.println(strings[1][0]);
    }
}
