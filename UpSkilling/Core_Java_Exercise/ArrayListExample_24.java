import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample_24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}