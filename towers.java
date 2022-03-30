// EVERY PROGRAM NEEDS THIS
// START
import java.util.*; // Needed for Scanner
import java.io.*; // Need for Scanner
import static java.lang.System.*; // Do not have to write System.out.println()

public class towers { // HAS TO BE the same name as the saved file

    public static void main(String[] args) throws IOException{ // Required Must memorize
        Scanner game = new Scanner(new File("towers.dat")); // Scanner Name and where to pull dat file
        int n = game.nextInt(); // Read number of loops to make from first number in dat file and make it an int
        game.nextLine(); // Go to next line, the first of the actual dat file contents
        for(int x=1;x<=n;x++) { // Loop through the number of loops from the first number
// END
            String text = game.nextLine(); // Read line and save as a String
            
            String s[] = text.split(" "); // Split string when a space appears " " This creates an array for your string. 
            int length[] = new int[s.length]; // Save new string array as an int so that we can do calculations with them.
            for(int i = 0 ; i < s.length ; i++) // Loop through each numbered array with spaces in between
                length[i] = Integer.parseInt(s[i]); // Save numbers as int array length
                out.print(length[0]+" "); // Output First number
                out.println(length[1]); // Output Second Number
                
            int p1 = length[0]; // Save first number to player 1
            int p2 = length[1]; // Save second number to player 2
            
            int total = p1 + p2; // Add two numbers together

            if (total % 2 == 0) { // Divide number by 2 and see if there is a remainder. No remainder = Even number
                out.println("P2"); // If number is Even Player 2 wins
            }
            else {
                out.println("P1"); // If number is Odd Player 1 wins
            }
        }
    }

}