import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();

        int totalCost = k * w * (w+1) / 2;

        int borrow = totalCost - n;

        System.out.println(Math.max(0, borrow));
    }
}
