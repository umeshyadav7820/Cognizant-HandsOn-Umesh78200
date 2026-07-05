import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample_25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> map = new HashMap<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            map.put(id, name);
        }

        int search = sc.nextInt();

        System.out.println(map.get(search));
    }
}