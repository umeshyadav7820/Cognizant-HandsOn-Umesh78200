public class MethodOverLoading_12 {
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a , int b, int c){
        System.out.println(a+b+c);
    }
    void add(double a,double b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        MethodOverLoading_12 method = new MethodOverLoading_12();
        method.add(1,3);
        method.add(4.5,6.7);
        method.add(6,7);

    }
}
