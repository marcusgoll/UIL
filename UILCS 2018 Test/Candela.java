import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class Candela {
    public static void main(String[] args) throws IOException{
        Scanner text = new Scanner(new File("candela.dat"));
        int questions = text.nextInt();
        text.nextLine();
        int targetdiff = 0;
        int targetpoints = 0;
        int points = 0;
        int pts;
        
        for(int x=1;x<=questions;x++){
            // pts[] == new int[text.nextInt()];
            int diff[] = new int[text.nextInt()];
            x = x-1;
            targetdiff += diff[x];
            // targetpoints += pts[x];
        
            if(40 >= points){
                points -= diff[x];
            }
        
    
            }
            
        
        int target1 = text.nextInt();
        int target2 = text.nextInt();
        int target3 = text.nextInt();
        
        
    


    }
}