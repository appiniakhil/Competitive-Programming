import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String onTable = in.nextLine();

        String[] s = in.nextLine().split(" ");

        boolean flag = false;
        for (int i = 0; i < 5; i++) {
            if(s[i].charAt(0) == onTable.charAt(0) || s[i].charAt(1) == onTable.charAt(1)) {
                flag = true;
                break;
            }
        }

        if(flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}