import java.util.Arrays;

public class MyLinearSearch {

    public static void main(String[] args) {
        int[] input = {7, 3, 5, 2, 1, 9, 4, 8};
        int key = 9;
        System.out.println("Input: " + Arrays.toString(input));
        System.out.println(key + " is found in position: " + search(input, key));
    }

    public static int search(int[] input, int key) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == key) {
                return i+1;
            }
        }
        return -1;
    }
}
