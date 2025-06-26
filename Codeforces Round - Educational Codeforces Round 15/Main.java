import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int maxLength = 1, currLength = 1;
        for (int i = 1; i < n; i++) {
            if(arr[i-1] < arr[i]){
                currLength++;
                maxLength = Math.max(maxLength, currLength);
            } else {
                currLength = 1;
            }
        }

        System.out.println(maxLength);
    }
}
