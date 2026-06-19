public class JumpGame1 {

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};

        int farthest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > farthest) {
                System.out.println(false);
                return;
            }

            farthest = Math.max(farthest, i + nums[i]);

            if (farthest >= nums.length - 1) {
                System.out.println(true);
                return;
            }
        }

        System.out.println(true);
    }
}

// i = 0
// farthest = max(0, 0 + 2) = 2
// farthest = 2 > 0 = 2
// farthest = 2 , nums.length - 1 = 4

// i = 1
// farthest = max(2, 1 + 3) = 4
// farthest = 4 > 1 = 4
// farthest = 4 , nums.length - 1 = 4

