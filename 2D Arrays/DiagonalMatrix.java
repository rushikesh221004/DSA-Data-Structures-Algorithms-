public class DiagonalMatrix {
    public static void printDiagonalMatrix(int[][] matrix) {
        if(matrix.length == 0) return;
        int startCol = 0;
        int endCol = matrix[0].length-1;
        int startRow = 0;
        int endRow = matrix.length-1;
        while(startRow <= endRow && startCol <= endCol) {
            System.out.print(matrix[startRow][startCol] + " ");
            startRow++;
            startCol++;
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        printDiagonalMatrix(matrix);
    }
}