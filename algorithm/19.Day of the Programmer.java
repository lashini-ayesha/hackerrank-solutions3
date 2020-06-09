import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        String dd="00", mm="09";
      if(year<=1917){
         if(year%4==0)
          dd="12";
         else
          dd="13";
      }
      else if(year==1918){
          dd="26";
      }
      else{
         if(year%100==0 && year%400!=0 || year%4!=0)
          dd="13";
         else if(year%4==0)
          dd="12";
      }
    String day= dd+"."+mm+"."+Integer.toString(year);
    return day;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
