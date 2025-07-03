import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        map.put("Tetrahedron", 4);
        map.put("Cube", 6);
        map.put("Octahedron", 8);
        map.put("Dodecahedron",12);
        map.put("Icosahedron", 20);

        int n = in.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            String figure = in.next();
            if (map.containsKey(figure)) {
                sum += map.get(figure);
            }
        }

        System.out.println(sum);
    }
}
