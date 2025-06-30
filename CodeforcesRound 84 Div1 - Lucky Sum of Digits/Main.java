package CodeforcesRound84Div1LuckySumofDigits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // 4x + 7y = n

        int cnt4=-1, cnt7=-1;

        for (int y=0;y<=n/7;y++) {
            int rem = n - 7*y;

            if (rem >= 0 && rem % 4 == 0) {
                int x = rem / 4;

                if (cnt4 == -1 || x < cnt4) {
                    cnt4 = x;
                    cnt7 = y;
                }
            }
        }

        if (cnt4 == -1) {
            System.out.println("-1");
        } else {
            StringBuilder ans = new StringBuilder();
            for (int i=0;i<cnt4;i++) {
                ans.append("4");
            }

            for (int i=0;i<cnt7;i++) {
                ans.append("7");
            }

            System.out.println(ans.toString());
        }

    }
}
