public class SpiralMatrix {
    public static void printSpiralMatrix(int[][] nums) {
        if(nums.length == 0) return;

        int startRow = 0;
        int endRow = nums.length - 1;
        int startCol = 0;
        int endCol = nums[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top row
            for (int topRow = startCol; topRow <= endCol; topRow++) {
                System.out.print(nums[startRow][topRow] + " ");
            }

            // right column
            for (int rightColumn = startRow + 1; rightColumn <= endRow; rightColumn++) {
                System.out.print(nums[rightColumn][endCol] + " ");
            }

            // bottom row
            if (startRow < endRow) {
                for (int bottomRow = endCol - 1; bottomRow >= startCol; bottomRow--) {
                    System.out.print(nums[endRow][bottomRow] + " ");
                }
            }

            // left column
            if (startCol < endCol) {
                for (int leftColumn = endRow - 1; leftColumn >= startRow + 1; leftColumn--) {
                    System.out.print(nums[leftColumn][startCol] + " ");
                }
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }

    public static void main(String[] args) {
        int[][] nums = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        printSpiralMatrix(nums);
    }
}