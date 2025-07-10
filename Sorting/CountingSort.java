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

    /* 
    public static void countingSort(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < nums.size(); i++) {
            largest = Math.max(largest, nums.get(i));
        }

        ArrayList<Integer> count = new ArrayList<>();
        for(int i = 0; i <= largest; i++) {
            count.add(0);
        }
        for(int i = 0; i < nums.size(); i++) {
            count.set(nums.get(i), count.get(nums.get(i)) + 1);
        }

        int j = 0;
        for(int i = 0; i < count.size(); i++) {
            while (count.get(i) > 0) {
                nums.set(j, i);
                j++;
                //count[i]--;
                count.set(i,  count.get(i) - 1);
            }
        }

    }
        */

    public static void main(String[] args) {
        int nums[] = {1, 4, 1, 3, 2, 4, 3, 7};
        countingSort(nums);
        System.out.print(Arrays.toString(nums));
    }
}
