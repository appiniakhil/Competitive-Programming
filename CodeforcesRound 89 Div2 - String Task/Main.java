import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            Character c = Character.toLowerCase(s.charAt(i));
            if (!isVowel(c)) {
                ans.append(".");
                ans.append(c);
            }
        }


        System.out.println(ans.toString());
    }

    private static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
            return true;
        }
        return false;
    }
}