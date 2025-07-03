import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        int cnt = 0;

        while (n > 0) {
            long dig = n % 10;
            n = n / 10;
            if (dig == 4 || dig == 7) {
                cnt++;
            }
        }

        if (cnt == 4 || cnt == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}