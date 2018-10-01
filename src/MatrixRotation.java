import java.util.Random;

public class MatrixRotation {

    /**
     * Class to rotate a matrix 90 degrees clockwise
     */

    private int[][] clockwiseRotate(int[][] input, int x) {
        int cycles = x/2;
        int n = x-1;
        int temp1, temp2;
        for (int k = 0; k < cycles; k++) {
            for (int i = k; i < n-k; i++) {
                temp1 = input[k][i];
                input[k][i] = input[n-i][k];
                temp2 = input[i][n-k];
                input[i][n-k] = temp1;
                temp1 = input[n-k][n-i];
                input[n-k][n-i] =  temp2;
                input[n-i][k] = temp1;
            }
        }
        return input;
    }

    private void printMatrix(int[][] input, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(input[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MatrixRotation obj = new MatrixRotation();
        Random rand = new Random();
        int n = 5;
        int[][] input = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                input[i][j] = rand.nextInt(9);
            }
        }
        obj.printMatrix(input, n);
        obj.printMatrix(obj.clockwiseRotate(input,n), n);
    }
}
