

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(helper(s));
    }

    public static String helper(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            System.out.println("Digit: " + digit);
            int inverseDigit = 9 - digit;
            System.out.println("Inverse digit: " + inverseDigit);

            if (i == 0 && inverseDigit == 0) {
                result.append(digit);
            } else {
                result.append(Math.min(digit, inverseDigit));
            }
        }

        return result.toString();
    }

}