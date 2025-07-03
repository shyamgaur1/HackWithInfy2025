import java.util.*;

public class TwoChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int n = sc.nextInt();           // Number of chocolates

        int[] prices = new int[n];

        System.out.print("Enter prices of chocolates: ");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();   // Input prices
        }

        System.out.print("Enter amount of money you have: ");
        int money = sc.nextInt();       // Amount you have

        Arrays.sort(prices);            // Sort prices in ascending order

        int cost = prices[0] + prices[1]; // Cost of two cheapest chocolates

        if (cost <= money) {
            System.out.println("Remaining money: " + (money - cost));
        } else {
            System.out.println("Not enough money to buy two chocolates. Remaining money: " + money);
        }

        sc.close();
    }
}
