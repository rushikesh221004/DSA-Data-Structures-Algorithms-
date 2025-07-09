import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {

    // This method sorts the given ArrayList using the Bubble Sort algorithm
    public static void bubbleSort(ArrayList<Integer> nums) {
        boolean isSwapped;

        // Outer loop for passes — total passes needed = nums.size() - 1
        for (int i = 0; i < nums.size() - 1; i++) {
            isSwapped = false; // To check if any swapping happened in this pass

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < nums.size() - 1 - i; j++) {
                // If current element is greater than the next, swap them
                if (nums.get(j) > nums.get(j + 1)) {
                    int temp = nums.get(j);
                    nums.set(j, nums.get(j + 1));
                    nums.set(j + 1, temp);
                    isSwapped = true; // Mark that a swap occurred
                }
            }

            // If no swaps occurred in the entire pass, array is already sorted
            if (!isSwapped) break;
        }
    }

    public static void main(String[] args) {
        // Create an ArrayList of integers to sort
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5, 3, 1, 4, 2));

        // Call bubbleSort method to sort the list
        bubbleSort(nums);

        // Print the sorted list
        System.out.println(nums);  // Output: [1, 2, 3, 4, 5]
    }
}
