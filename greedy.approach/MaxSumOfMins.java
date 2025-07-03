import java.util.*;

public class MaxSumOfMins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of pairs (n): ");
        int n = sc.nextInt();
        int[] nums = new int[2 * n];

        System.out.print("Enter " + (2 * n) + " numbers: ");
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);  // Sort the array

        int sum = 0;
        for (int i = 0; i < 2 * n; i += 2) {
            sum += nums[i];  // Add every first element in the pair
        }

        System.out.println("Maximum sum of minimums: " + sum);
        sc.close();
    }
}
