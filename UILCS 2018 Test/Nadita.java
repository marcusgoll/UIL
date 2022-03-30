import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Nadita {

    public static void main(String[] args) throws IOException{
        Scanner text = new Scanner(new File("nandita.dat"));
        
        for(int x=1;x<=3;x++){
            String month = text.next();
            String date[] = text.next().split(",");
            Integer day = Integer.valueOf(date[0]);

            int year = text.nextInt();
            String shortYear = String.valueOf(year).substring(2);
            String monthNumber = "00";
            if( month.contains("JANUARY")){
                monthNumber = "01";
            }
            if( month.contains("FEBRUARY")){
                monthNumber = "02";
            }
            if( month.contains("MARCH")){
                monthNumber = "03";
            }
            if( month.contains("APRIL")){
                monthNumber = "04";
            }
            if( month.contains("MAY")){
                monthNumber = "05";
            }
            if( month.contains("JUNE")){
                monthNumber = "06";
            }
            if( month.contains("JULY")){
                monthNumber = "07";
            }
            if( month.contains("AUGUST")){
                monthNumber = "08";
            }
            if( month.contains("SEPTEMBER")){
                monthNumber = "09";
            }
            if( month.contains("OCTOBER")){
                monthNumber = "10";
            }
            if( month.contains("NOVEMBER")){
                monthNumber = "11";
            }
            if( month.contains("DECEMBER")){
                monthNumber = "12";
            }

            out.printf("%s/%02d/%s\n",monthNumber,day,shortYear);
            out.printf("%02d.%s.%s\n",day,monthNumber,year);
            out.printf("%s-%s-%02d\n",year,monthNumber,day);
            out.println("=====");
                
            
        }
        

    }
}