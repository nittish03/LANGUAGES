import java.util.Arrays;

public class SetMatrixZeroes {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 1, 1, 1},
                {1, 0, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 0}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        setZeroes(matrix);

        System.out.println("\nModified Matrix:");
        printMatrix(matrix);
    }

    public static void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean firstRow = false;
        boolean firstCol = false;

        // Check first row
        for (int j = 0; j < cols; j++) {
            if (matrix[0][j] == 0) {
                firstRow = true;
                break;
            }
        }

        // Check first column
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                firstCol = true;
                break;
            }
        }

        // Mark rows and columns
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set elements to zero
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Update first row
        if (firstRow) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }

        // Update first column
        if (firstCol) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}