// EVERY PROGRAM NEEDS THIS
// START
import java.util.*; // Needed for Scanner
import java.io.*; // Need for Scanner
import static java.lang.System.*; // Do not have to write System.out.println()

public class Grades { // HAS TO BE the same name as the saved file

    public static void main(String[] args) throws IOException{ // Required Must memorize
        Scanner grades = new Scanner(new File("grades.dat")); // Scanner Name and where to pull dat file
        int n = grades.nextInt(); // Read number of loops to make from first number in dat file and make it an int
        grades.nextLine(); // Go to next line, the first of the actual dat file contents
        for(int x=1;x<=n;x++) { // Loop through the number of loops from the first number
            String first = grades.next(); // Make first name a string
            String last = grades.next(); // Make last name a string
            double total = 0; // establish a double number for total to get decimal points
            for(int i=1; i<=6;i++) { // Each person has exactly 6 grades, so run the loop to cature all grades.
                total+=grades.nextInt(); // NextInt stays on same line but moves to the next number. += is to add the new numbers to the old number, running count.
            }
            double avg = total/6.0; // 6 grades take the average
            out.printf("%s, %s %.2f\n",last,first,avg); 
            // BIGGEST HELP HERE. printf is format print you get to hand place where everything goes
            // %s = string, %.2f = 2 decimal #, \n = new line
            // the last part is which string we are using plus the avg number we calculated.
            
        }
    }
}