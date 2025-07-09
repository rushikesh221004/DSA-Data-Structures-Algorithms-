import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(ArrayList<Integer> nums) {
        int n = nums.size();

        for(int i = 0; i < n-1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < n; j++) {
                if(nums.get(minIndex) > nums.get(j)) minIndex = j;
            }
            int temp = nums.get(minIndex);
            nums.set(minIndex, nums.get(i));
            nums.set(i, temp);
        }
    }

    public static void main(String[] args) {
        // Create an ArrayList of integers to sort
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5, 3, 1, 4, 2));

        // Call selectionSort method to sort the list
        selectionSort(nums);

        // Print the sorted list
        System.out.println(nums);  // Output: [1, 2, 3, 4, 5]
    }
}
