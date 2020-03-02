import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;

public class OddOrEven
{
    public static void main( String args[] ) throws IOException
    {
        File f = new File("oddoreven.dat");
        Scanner file = new Scanner(f);
        int size = file.nextInt();
        file.nextLine();
        for(int i = 0; i < size; i++)
        {
            int num = file.nextInt();
        }
    }
}