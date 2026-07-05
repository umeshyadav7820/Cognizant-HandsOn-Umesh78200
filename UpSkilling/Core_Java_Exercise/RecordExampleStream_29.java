import java.util.*;
public class RecordExampleStream_29 {
    record person(String name,int age){}
    public static void main(String[] args) {

        List<person> arr = List.of(
                new person("Umesh",18),
                new person("Jitendra",23),
                new person("DC",24));
        arr.stream().filter(p-> p.age()>=20).forEach(System.out::println);


    }
}
