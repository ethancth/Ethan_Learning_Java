package com.learningjava.loop;

/**
 * Created on 11/04/2022.
 */
public class PrintMatrixToConsole {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5,},
                {6, 7},
                {8, 9, 10}
        };

        for(int i = 0; i < matrix.length; i++) {
            System.out.println("matrix length :"+matrix.length);
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("matrix [i ]length :"+matrix[i].length);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
