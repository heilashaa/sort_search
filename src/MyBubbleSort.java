import java.util.Arrays;

public class MyBubbleSort {
    public static void main(String[]args) {
        int[] input = {7, 3, 5, 2, 1, 9, 4, 8};
        System.out.println("Input: " + Arrays.toString(input));
        sort(input);
        System.out.println("Sorted: " + Arrays.toString(input));
    }

    public static void sort(int[] input) {
        int inputLength = input.length;
        int temp;
        for (int i=0; i<inputLength; i++) {
            for (int j=1; j<(inputLength-i); j++) {
                if (input[j-1] > input[j]) {
                    temp = input[j-1];
                    input[j-1] = input[j];
                    input[j] = temp;
                }
            }
        }
    }
}
