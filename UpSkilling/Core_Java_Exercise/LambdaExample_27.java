import java.util.ArrayList;
import java.util.Collections;

public class LambdaExample_27 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Ravi");
        list.add("Aman");
        list.add("Vikas");

        Collections.sort(list, (a, b) -> a.compareTo(b));

        System.out.println(list);
    }
}