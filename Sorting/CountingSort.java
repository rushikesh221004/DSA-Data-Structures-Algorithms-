import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] nums) {
        int largest = Integer.MIN_VALUE;

        // find largest element in the array
        for(int i = 0; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }

        int count[] = new int[largest+1];
        // count frequency
        for(int i = 0; i< nums.length; i++) {
            count[nums[i]]++;
        }

        int j = 0;
        for(int i = 0; i < count.length; i++) {
            while(count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 4, 1, 3, 2, 4, 3, 7};
        countingSort(nums);
        System.out.print(Arrays.toString(nums));
    }
}
