import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
         String[] ar= s.split("[\\D]+");
         String[] ar2= s.split("[:\\d]+");
    if(ar[0].equals("12")  && ar2[1].equals("AM")){
             ar[0]="00";
         }

        if(ar2[1].equals("PM") && !ar[0].equals("12")){

             int time= (Integer.parseInt(ar[0])) +12;
             ar[0]= Integer.toString(time);
         }
         
        return (ar[0]+":"+ar[1]+":"+ar[2]);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
