package CodeforcesGlobalRound8Cplusequal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noOfTestCases = in.nextInt();

        for (int i = 0; i < noOfTestCases; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int cnt = 0;

            while (Math.max(a, b) <= n) {
                if (a < b) {
                    a += b;
                } else {
                    b += a;
                }

                cnt++;
            }

            System.out.println(cnt);
        }
    }
}
