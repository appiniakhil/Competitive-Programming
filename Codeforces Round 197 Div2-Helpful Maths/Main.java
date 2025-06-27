import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int[] arr = new int[(s.length() + 1) / 2];

        int ind = 0;
        for (int i = 0; i < s.length(); i+=2) {
            arr[ind] = Integer.parseInt(s.substring(i, i+1));
            ind++;
        }

        Arrays.sort(arr);
        String ans = "";

        for (int i = 0; i < arr.length; i++) {
            ans += arr[i];
            if (i < arr.length - 1) {
                ans += "+";
            }
        }

        System.out.println(ans);
    }
}
