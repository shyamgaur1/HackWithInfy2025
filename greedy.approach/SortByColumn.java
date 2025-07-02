import java.util.Arrays;

public class SortByColumn {
    public static void main(String[] args) {
        int[][] arr = {
            {3, 5, 1},
            {9, 2, 4},
            {7, 6, 8}
        };

        int columnIndex = 1; // sort based on this column
        Arrays.sort(arr, (a, b) -> Integer.compare(a[columnIndex], b[columnIndex]));

        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
