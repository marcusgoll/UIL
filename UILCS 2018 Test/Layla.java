import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class Layla {
    public static void main(String[] args) throws IOException{
    Scanner text = new Scanner(new File("layla.dat"));
    
    for(int x=1;x<=4;x++){
        int one = text.nextInt(); 
        int two = text.nextInt();
        double three = text.nextDouble();
        String four = text.next();
        
        if (four.contains("A")){
            double line1 = three;
            double line2 = three/one;
            double line3 = three/(one*two);
            out.printf("%s %.3f\n", "A = ", line1);
            out.printf("%s %.3f\n", "B = ", line2);
            out.printf("%s %.3f\n", "C = ", line3);
        }
        if (four.contains("B")){
            double line1 = three*one;
            double line2 = three;
            double line3 = three/two;
            out.printf("%s %.3f\n", "A = ", line1);
            out.printf("%s %.3f\n", "B = ", line2);
            out.printf("%s %.3f\n", "C = ", line3);
        }
        if (four.contains("C")){
            double line1 = one*two*three;
            double line2 = two*three;
            double line3 = three;
            out.printf("%s %.3f\n", "A = ", line1);
            out.printf("%s %.3f\n", "B = ", line2);
            out.printf("%s %.3f\n", "C = ", line3);
        }
    
        out.println("=====");


        
    }
    


    }
}