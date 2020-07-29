import java.util.Arrays;

public class MyBinarySearch {

    public static void main(String[] args) {
        int[] input = {7, 3, 5, 2, 1, 9, 4, 8};
        int key = 9;
        System.out.println("Input: " + Arrays.toString(input));
        System.out.println(key + " is found in position: " + search(input, key));
    }

    public static int search(int input[], int key) {
        int firstIndex = 0;
        int lastIndex = input.length - 1;
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;

            if (input[middleIndex] == key) {
                return middleIndex+1;
            } else if (input[middleIndex] < key) {
                firstIndex = middleIndex + 1;
            } else if (input[middleIndex] > key) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}
