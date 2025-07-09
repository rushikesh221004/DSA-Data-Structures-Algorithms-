import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(ArrayList<Integer> nums) {
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            int curr = nums.get(i);      // Current element to be inserted
            int prev = i - 1;

            // Shift larger elements to the right
            while (prev >= 0 && nums.get(prev) > curr) {
                nums.set(prev + 1, nums.get(prev));
                prev--;
            }

            // Insert current element at the correct position
            nums.set(prev + 1, curr);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5, 3, 1, 4, 2));
        insertionSort(nums);
        System.out.print(nums);  // Output: [1, 2, 3, 4, 5]
    }
}
