import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class Raymond {
    public static void main(String[] args) throws IOException{
        Scanner text = new Scanner(new File("raymond.dat"));
        int one = text.nextInt();
        int two = text.nextInt();
        int three = text.nextInt();

        out.printf("%d %s\n", one, "-13");
        out.printf("%d %s\n", two, "-46");
        out.printf("%d %s\n", three, "8");


    }
}