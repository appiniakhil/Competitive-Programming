import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean flag = false;

        for (int i = 0; i < n; i++) {
            int k = in.nextInt();
            if(k == 1) {
                flag = true;
            }
        }

        if (flag) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }

    }
}
