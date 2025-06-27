import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        String ans = s.substring(0, 1).toUpperCase() + s.substring(1, s.length());

        System.out.println(ans);
    }
}
