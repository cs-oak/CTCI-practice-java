package ArraysAndStrings;

import java.util.Random;

public class SetZeroMatrix {

    /**
     * Method to set row and column of a matrix to
     * zero if the element found is already zero
     */

    private int[][] setZero(int[][] input, int m, int n) {
        int[][] flag = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (input[i][j] == 0) {
                    flag[i][j] = 0;
                } else {
                    flag[i][j] = -1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (flag[i][j] == 0) {
                    for (int k = 0; k < m; k++) {
                        input[k][j] = 0;
                    }
                    for (int k = 0; k < n; k++) {
                        input[i][k] = 0;
                    }
                }
            }
        }
        return input;
    }

    private void printMatrix(int[][] input, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(input[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SetZeroMatrix obj = new SetZeroMatrix();
        Random rand = new Random();
        int m = 4;
        int n = 5;
        int[][] input = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                input[i][j] = rand.nextInt(9);
            }
        }
        obj.printMatrix(input, m, n);
        obj.printMatrix(obj.setZero(input, m, n), m, n);
    }
}
