import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            List<Integer> list = new ArrayList<>();

            int place = 1;

            while (n > 0) {
                int digit = n % 10;

                if (digit != 0) {
                    list.add(digit * place);
                }
                n /= 10;
                place *= 10;
            }

            System.out.println(list.size());

            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        in.close();
    }
}