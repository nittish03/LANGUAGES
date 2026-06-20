import java.util.*;

public class CoinChange {

    public static void main(String[] args) {

        int[] gems = {2, 1, 4};
        int amount = 12;

        System.out.println(minGems(gems, amount));
    }

    static int minGems(int[] gems, int amount) {

        int[] dp = new int[amount + 1];

        Arrays.fill(dp, amount + 1);

        dp[0] = 0;

        for (int i = 0; i < gems.length; i++) {

            int gem = gems[i];

            for (int currAmount = gem;
                 currAmount <= amount;
                 currAmount++) {

                dp[currAmount] = Math.min(
                        dp[currAmount],
                        dp[currAmount - gem] + 1
                );
            }
        }

        return dp[amount] > amount
                ? -1
                : dp[amount];
    }
}