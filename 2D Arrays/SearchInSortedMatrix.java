public class SearchInSortedMatrix {
    public static boolean searchMatrixBrute(int[][] matrix, int target) {
        int n = matrix.length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean searchMatrixBinary(int[][] matrix, int target) {
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 3, 5 },
                { 7, 9, 11 },
                { 13, 15, 17 }
        };
        int target = 13;
        boolean bruteForce = searchMatrixBrute(matrix, target);
        System.out.print(bruteForce);
    }
}
