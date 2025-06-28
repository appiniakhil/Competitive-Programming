import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        int maxIndex = 0, minIndex = 0, maxValue = Integer.MIN_VALUE, minValue = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }

        for (int i = n-1; i >= 0; i--) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }

        }

        int ans = maxIndex + n - minIndex-1;

        if (maxIndex > minIndex) {
            ans--;
        }

        System.out.println(ans);
    }
}
