import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("input.txt");
        Scanner reader = new Scanner(f);

        int total = 0;
        while(reader.hasNextInt()){
            int x = reader.nextInt();
            total += x;
        }
        System.out.println("total = " + total);
    }
}
