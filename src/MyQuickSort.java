import java.util.Arrays;

public class MyQuickSort {

    public static void main(String[] args) {
        int[] input = {7, 3, 5, 2, 1, 9, 4, 8};
        System.out.println("Input: " + Arrays.toString(input));
        int low = 0;
        int high = input.length - 1;
        sort(input, low, high);
        System.out.println("Sorted: " + Arrays.toString(input));
    }

    public static void sort(int[] input, int low, int high) {
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        int opora = input[middle];
        int i = low, j = high;
        while (i <= j) {
            while (input[i] < opora) {
                i++;
            }
            while (input[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            sort(input, low, j);
        if (high > i)
            sort(input, i, high);
    }
}
