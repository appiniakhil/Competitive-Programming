import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        int total = 0, maxi = 0;

        for (int i = 0; i < n-1; i++) {
            total -= arr[i][0];
            total += arr[i][1];
            maxi = Math.max(maxi, total);
        }

        System.out.println(maxi);
    }
}