import java.util.*;

class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int duplicate = -1, missing = -1;
        Set<Integer> set = new HashSet<>();
        
        // Find the duplicate number
        for (int num : nums) {
            if (set.contains(num)) {
                duplicate = num;
            }
            set.add(num);
        }
        
        // Find the missing number
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                missing = i;
                break;
            }
        }
        
        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 2, 2, 4};
        int[] result1 = sol.findErrorNums(nums1);
        System.out.println(Arrays.toString(result1)); // Output: [2, 3]

        int[] nums2 = {1, 1};
        int[] result2 = sol.findErrorNums(nums2);
        System.out.println(Arrays.toString(result2)); // Output: [1, 2]
    }
}
