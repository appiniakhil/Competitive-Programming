import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] p = new int[n];
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            ans[p[i] - 1] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}
