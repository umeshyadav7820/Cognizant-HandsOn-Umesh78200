
class car{
    String make;
    int year;
    String model;
    void display(){
        System.out.println(make);
        System.out.println(model);
        System.out.println(year);
    }

}
public class Main_17 {
    public static void main(String[] args) {
        car swift = new car();
        swift.make = "maruti";
        swift.year = 2026;
        swift.model = "top";
        swift.display();
    }
}

