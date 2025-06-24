import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        while (k > 0) {
            int lastDigit = n % 10;

            if (lastDigit == 0) {
                n /= 10;
            } else {
                n -= 1;
            }

            k--;
        }

        System.out.println(n);
    }
}
