package CodeforcesRound547Div3Game23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        if (n2 % n1 != 0) {
            System.out.println("-1");
            return;
        }

        int cnt = 0;
        int ratio = n2 / n1;

        while(ratio != 1) {
            if(ratio % 2 == 0) {
                cnt++;
                ratio /= 2;
            } else if(ratio % 3 == 0) {
                cnt++;
                ratio /= 3;
            } else {
                cnt = -1;
                break;
            }
        }

        System.out.println(cnt);
    }
}
