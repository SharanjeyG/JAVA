package ZOHO;

public class MagicSquareChecker {

    public static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;

        // Check if the matrix is a square matrix
        if (n != matrix[0].length) {
            return false;
        }

        // Calculate the magic constant
        int magicConstant = n * (n * n + 1) / 2;

        // Check the sums of rows
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != magicConstant) {
                return false;
            }
        }

        // Check the sums of columns
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != magicConstant) {
                return false;
            }
        }

        // Check the sum of the main diagonal
        int mainDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i];
        }
        if (mainDiagonalSum != magicConstant) {
            return false;
        }

        // Check the sum of the other diagonal
        int otherDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            otherDiagonalSum += matrix[i][n - i - 1];
        }
        if (otherDiagonalSum != magicConstant) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };

        if (isMagicSquare(matrix)) {
            System.out.println("The given matrix is a magic square.");
        } else {
            System.out.println("The given matrix is not a magic square.");
        }
    }
}
