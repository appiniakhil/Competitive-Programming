import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        String[][] arr = new String[n][m];

        for (int i = 0; i < n; i+=2) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = "#";
            }
        }

        for (int i = 1; i < n; i+=2) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = ".";
            }
        }

        for (int i=1;i<n;i++) {
            if( (i+1) % 4 != 0) {
                arr[i][m-1] = "#";
            }
        }

        for(int i=3;i<n;i+=4)
        {
            arr[i][0] = "#";
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
