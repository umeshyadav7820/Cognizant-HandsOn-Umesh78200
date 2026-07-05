import java.io.FileWriter;
import java.util.Scanner;

public class FileWriting_22 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        FileWriter fw = new FileWriter("output.txt",true);

        fw.write(text);

        fw.close();

        System.out.println("Data Written");
    }
}