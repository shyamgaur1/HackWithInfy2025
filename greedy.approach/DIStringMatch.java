import java.util.*;

public class DIStringMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the pattern string (only I and D): ");
        String s = sc.nextLine();

        int n = s.length();
        int low = 0, high = n;
        int[] result = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                result[i] = low++;
            } else {
                result[i] = high--;
            }
        }

        result[n] = low; // low and high will be equal now

        System.out.println("Permutation: " + Arrays.toString(result));
        sc.close();
    }
}
