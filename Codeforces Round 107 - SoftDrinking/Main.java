import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int p = scanner.nextInt();
        int nl = scanner.nextInt();
        int np = scanner.nextInt();

        int totalDrink = (k * l) / nl;
        int totalToast = c * d;
        int totalSalt  = p / np;

        int maxToasts = (Math.min(totalDrink,Math.min(totalToast, totalSalt))) / n;

        System.out.println(maxToasts);
    }
}
