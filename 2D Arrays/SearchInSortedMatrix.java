public class SearchInSortedMatrix {
    public static boolean searchMatrixBrute(int[][] matrix, int target) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean searchMatrixBinary(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int start = 0, end = matrix[i].length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (matrix[i][mid] == target) {
                    return true;
                } else if (matrix[i][mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return false;
    }

    public static boolean searchMatrixOptimal(int matrix[][], int target) {
        int row = 0;
        int col = matrix[0].length-1;
        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == target) {
                return true;
            } else if(matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    } 

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 3, 5 },
                { 7, 9, 11 },
                { 13, 15, 17 }
        };
        int target = 3;
        boolean bruteForce = searchMatrixBrute(matrix, target);
        boolean binarySearch = searchMatrixBinary(matrix, target);
        System.out.print(binarySearch);
    }
}
