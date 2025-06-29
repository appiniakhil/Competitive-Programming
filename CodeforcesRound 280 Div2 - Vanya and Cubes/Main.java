import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int ind = 1, totalCubes = 0, height = 0;
        boolean flag = true;
        while (flag) {
            int cubeNeeded = (ind * (ind+1))/2;

            if (totalCubes + cubeNeeded > n) {
                flag = false;
                break;
            }
            totalCubes += cubeNeeded;
            height++;
            ind++;
        }

        System.out.println(height);
    }
}
