import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();

            int firstOne = -1;
            int lastOne = -1;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    firstOne = i;
                    break;
                }
            }

            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == '1') {
                    lastOne = i;
                    break;
                }
            }

            if (firstOne == -1) {
                System.out.println(0);
                continue;
            }

            int zerosToErase = 0;
            for (int i = firstOne; i <= lastOne; i++) {
                if (s.charAt(i) == '0') {
                    zerosToErase++;
                }
            }

            System.out.println(zerosToErase);
        }
        scanner.close();
    }
}