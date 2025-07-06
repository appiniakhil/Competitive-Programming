import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        StringBuilder ans = new StringBuilder();

        int idx = 0;
        int skip = 1;

        while (idx < n) {
            ans.append(s.charAt(idx));
            idx += skip;
            skip++;
        }

        System.out.println(ans);
        in.close();
    }
}