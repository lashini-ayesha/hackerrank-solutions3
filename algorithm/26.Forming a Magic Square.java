import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
   
 LinkedList<Integer> list1= new LinkedList<>(Arrays.asList(2,7,6,9,5,1,4,3,8));
List<Integer> list2 = new ArrayList<Integer>();
 int min=100;
 for(int p=0; p<3; p++){
     for(int q=0; q<3; q++){
         list2.add(s[p][q]);
     }
 }  
for (int x=0; x<4; x++){ //90 degree conversion
    int countA=0, count=0;
    for(int y=2;y>=0; y--){
        int countB=0;
        int z=y;
        while(countB<3){
            countA= countA + Math.abs(list1.get(z)-list2.get(count));
            list1.add(list1.get(z));
            list1.remove(z);
            countB++;
            count++;
            z=z+y;
        }
    }
    if(countA<min){
        min=countA;
    }
}
int countC=0, count1=0;
    for(int y=2;y>=0; y--){
        int countD=0;
        int z=0;
        while(countD<3){
            countC= countC + Math.abs(list1.get(z)-list2.get(count1));
            list1.add(list1.get(z));
            list1.remove(z);
            countD++;
            count1++;
            z=z+y;
        }
    }
     if(countC<min)
        min=countC;

for (int x=0; x<3; x++){ //-90 degree conversion
    int countA=0, count=0;
    for(int y=2;y>=0; y--){
        int countB=0;
        int z=y;
        while(countB<3){
            countA= countA + Math.abs(list1.get(z)-list2.get(count));
            list1.add(list1.get(z));
            list1.remove(z);
            countB++;
            count++;
            z=z+y;
        }
    }
    if(countA<min){
        min=countA;
    }
}


 return min;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
