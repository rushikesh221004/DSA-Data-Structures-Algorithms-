import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5, 1, 3, 2, 4));
        Collections.sort(nums);
        System.out.print(nums);
    }

}
