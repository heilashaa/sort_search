public class Stars {

    public static void main(String[] args) {
        int starsSize = 10;
        for (int i = starsSize; i > 0; i--) {
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
