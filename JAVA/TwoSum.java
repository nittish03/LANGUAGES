import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];

            if (map.containsKey(needed)) {
                int[] result = {map.get(needed), i};
                System.out.println(Arrays.toString(result));
                return;
            }
            map.put(nums[i], i);
        }

        System.out.println("No solution found");
    }
}