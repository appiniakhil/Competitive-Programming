import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int x3 = in.nextInt();

        int[] coordinates = {x1, x2, x3};
        Arrays.sort(coordinates);

        int val = coordinates[2] - coordinates[0];
        System.out.println(val);
    }
}
