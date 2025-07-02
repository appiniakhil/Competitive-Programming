import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        boolean allUpper = true;
        boolean firstLowerRestUpper = true;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                allUpper = false;
                break;
            }
        }

        if (Character.isLowerCase(s.charAt(0))) {
            for (int i = 1; i < s.length(); i++) {
                if (Character.isLowerCase(s.charAt(i))) {
                    firstLowerRestUpper = false;
                    break;
                }
            }
        } else {
            firstLowerRestUpper = false;
        }

        if (allUpper) {
            System.out.println(s.toLowerCase());
        } else if (firstLowerRestUpper) {
            String result = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
            System.out.println(result);
        } else {
            System.out.println(s);
        }
    }
}