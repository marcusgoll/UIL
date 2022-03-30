// EVERY PROGRAM NEEDS THIS
// START
import java.util.*; // Needed for Scanner
import java.io.*; // Need for Scanner
import static java.lang.System.*; // Do not have to write System.out.println()

public class Bayani { // HAS TO BE the same name as the saved file

    public static void main(String[] args) throws IOException{ // Required Must memorize
        Scanner text = new Scanner(new File("bayani.dat")); // Scanner Name and where to pull dat file
        double total = 0; // Save a variable called total as a double
        int bills = 8; // In dat file, first line is not the # of loops. So we set the number of bills/loops here.
        for(int i=1;i<=bills;i++){ // Loop through the 5 bills
            double nextBill = Double.parseDouble(text.next()); // This line saves each number in the string as a double for calculations
            total+=nextBill; // += Every loop adds the new bill to the total.
            out.printf("%s %s %6.2f\n","       ","$",nextBill); // String1 = spaces to match output required. String2 = $.
            //For the number format %6.2f. The 6 gives us the # of digits spacing in front of decimal and the .2 gives us the number to round to.
            // \n = new line for the format print, same as println() 
        }
        out.printf("%s %6.2f\n","Total = $",total); // Last format print where string is my Total = $ and output the total.
    }
}