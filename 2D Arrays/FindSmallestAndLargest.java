
public class FindSmallestAndLargest {

    public static void findSmallestAndLargest(int[][] nums) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++) {
                smallest = Math.min(smallest, nums[i][j]);
                largest = Math.max(largest, nums[i][j]);
            }
        }

        System.out.println("Smallest number is " + smallest);
        System.out.println("Largest number is " + largest);
    }
    
    public static void main(String[] args) {
        int[][] nums = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        findSmallestAndLargest(nums);
    }
}
