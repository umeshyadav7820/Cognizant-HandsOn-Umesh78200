import java.util.*;
public class Check_30 {
    static void check( Object obj){
        switch(obj){
            case Integer i -> System.out.println("integer " + i);
            case String i -> System.out.println("String " +i);
            case Double i -> System.out.println("Double " + i);
            case Float i -> System.out.println("Float " + i);
            default -> System.out.println("Unknown");


        }
    }
    public static void main(String[] args) {
        check(100);
        check("Umesh");
        check(23.50);
        check(1232.4455);
        //check();
    }
}
