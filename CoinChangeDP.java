import java.util.Arrays;

public class CoinChangeDP {

    public static void coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];  // DP table to store min coins for each amount
        int[] lastCoin = new int[amount + 1]; // To track which coin was last used

        Arrays.fill(dp, Integer.MAX_VALUE); // Initialize with large number
        dp[0] = 0; // Base case: 0 coins needed for 0 amount

        // Build up the dp table
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i && dp[i - coin] != Integer.MAX_VALUE) {
                    if (dp[i - coin] + 1 < dp[i]) {
                        dp[i] = dp[i - coin] + 1;
                        lastCoin[i] = coin;
                    }
                }
            }
        }

        // Output result
        if (dp[amount] == Integer.MAX_VALUE) {
            System.out.println("No solution possible.");
        } else {
            System.out.println("Minimum number of coins needed: " + dp[amount]);
            System.out.print("Coins used: ");
            int current = amount;
            while (current > 0) {
                System.out.print(lastCoin[current] + " ");
                current -= lastCoin[current];
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] coins = {9, 6, 5, 1}; // Coin denominations
        int amount = 11; // Total amount to make
        coinChange(coins, amount);
    }
}
