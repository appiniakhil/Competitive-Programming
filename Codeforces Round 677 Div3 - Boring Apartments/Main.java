import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i=0;i<t;i++) {
            int n = in.nextInt();
            int val = noofDigits(n);
            int dig = n % 10;
            int finalVal = (dig - 1) * 10 + (val * (val + 1) / 2);
            System.out.println(finalVal);
        }
    }

    private static int noofDigits(int n) {
        int cnt = 0;

        while(n > 0) {
            cnt++;
            n /= 10;
        }

        return cnt;
    }
}
