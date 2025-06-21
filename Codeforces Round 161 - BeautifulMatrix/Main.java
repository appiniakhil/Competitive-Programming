import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] matrix = new int[5][5];
        int i1 = 0, j1 = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = in.nextInt();

                if (matrix[i][j] == 1) {
                    i1 = i;
                    j1 = j;
                }
            }
        }

        int val = abs(i1 - 2) + abs(j1-2);
        System.out.println(val);
    }
}
