import java.util.Random;
import java.util.Scanner;

public class GuessNumber_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int num = r.nextInt(100) + 1;
        int guess = 0;

        while (guess != num) {
            guess = sc.nextInt();

            if (guess > num)
                System.out.println("Too High");
            else if (guess < num)
                System.out.println("Too Low");
            else
                System.out.println("Correct");
        }
    }
}