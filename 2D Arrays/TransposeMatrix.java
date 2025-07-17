import java.lang.reflect.Array;
import java.util.*;

public class TransposeMatrix {
    public static void printTransposeMatrix(int[][] matrix) {
        if (matrix.length == 0)
            return;

        int n = matrix.length;

        // In-place transpose (only for square matrix)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap matrix[i][j] with matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        printTransposeMatrix(matrix);
    }
}
