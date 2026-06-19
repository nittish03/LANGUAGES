public class JumpGame2 {
    public static void main(String[] args) {

// ----------------------------------------------------------------------
int[] nums = {1,1,1,1,1}; 

int jumps = 0;
int currentEnd = 0;
int farthest = 0;

for (int i = 0; i < nums.length - 1; i++) {
    farthest = Math.max(farthest, i + nums[i]);

    if (i == currentEnd) {
        jumps++;
        currentEnd = farthest;
    }
}

System.out.println(jumps);

// i = 0
// farthest = max(0, 0 + 1) = 1
// i == 0 , currentEnd = 0
// jumps = 1
// currentEnd = 1

// i = 1
// farthest = max(1, 1 + 1) = 2
// i == 1 , currentEnd = 1
// jumps = 1
// currentEnd = 2

// i = 2
// farthest = max(2, 2 + 1) = 3
// i == 2 , currentEnd = 2
// jumps = 2
// currentEnd = 3

// i = 3
// farthest = max(3, 3 + 1) = 4 
// i == 3 , currentEnd = 3
// jumps = 3
// currentEnd = 4

// i = 4
// farthest = max(4, 4 + 1) = 5
// i == 4 , currentEnd = 4
// jumps = 4   
// currentEnd = 5


















// ----------------------------------------------------------------------
    }
}
