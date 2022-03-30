import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Max {

    public static void main(String[] args) throws IOException{
        Scanner text = new Scanner(new File("max.dat"));  
        for(int i=1;i<=5;i++){
            String t = text.nextLine();
            int length = t.length();
            
            for(int x=1;x<=length;x++) {
                int n = x - 1;
                String s[] = t.split("");
                String check = s[n];
                // out.print(check);
                if(check.contains("A")){
                    out.print("Alpha ");
                }
                if(check.contains("B")){
                    out.print("Bravo ");
                }
                if(check.contains("C")){
                    out.print("Charlie ");
                }
                if(check.contains("D")){
                    out.print("Delta ");
                }
                if(check.contains("E")){
                    out.print("Echo ");
                }
                if(check.contains("F")){
                    out.print("Foxtrot ");
                }
                if(check.contains("G")){
                    out.print("Golf ");
                }
                if(check.contains("H")){
                    out.print("Hotel ");
                }
                if(check.contains("I")){
                    out.print("India ");
                }
                if(check.contains("J")){
                    out.print("Juliet ");
                }
                if(check.contains("K")){
                    out.print("Kilo ");
                }
                if(check.contains("L")){
                    out.print("Lima ");
                }
                if(check.contains("M")){
                    out.print("Mike ");
                }
                if(check.contains("N")){
                    out.print("November ");
                }
                if(check.contains("O")){
                    out.print("Oscar ");
                }
                if(check.contains("P")){
                    out.print("Papa ");
                }
                if(check.contains("Q")){
                    out.print("Quebec ");
                }
                if(check.contains("R")){
                    out.print("Romeo ");
                }
                if(check.contains("S")){
                    out.print("Sierra ");
                }
                if(check.contains("T")){
                    out.print("Tango ");
                }
                if(check.contains("U")){
                    out.print("Uniform ");
                }
                if(check.contains("V")){
                    out.print("Victor ");
                }
                if(check.contains("W")){
                    out.print("Whiskey ");
                }
                if(check.contains("X")){
                    out.print("Xray ");
                }
                if(check.contains("Y")){
                    out.print("Yankee ");
                }
                if(check.contains("Z")){
                    out.print("Zulu ");
                }
                if(check.contains("0")){
                    out.print("Zero ");
                }
                if(check.contains("1")){
                    out.print("Wun ");
                }
                if(check.contains("2")){
                    out.print("Too ");
                }
                if(check.contains("3")){
                    out.print("Tree ");
                }
                if(check.contains("4")){
                    out.print("Fower ");
                }
                if(check.contains("5")){
                    out.print("Fife ");
                }
                if(check.contains("6")){
                    out.print("Six ");
                }
                if(check.contains("7")){
                    out.print("Seven ");
                }
                if(check.contains("8")){
                    out.print("Ait ");
                }
                if(check.contains("9")){
                    out.print("Niner ");
                }
                
            }

            out.println();
        }
        

    }
}