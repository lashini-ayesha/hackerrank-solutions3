import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
      double[] ar =new double[3];
      double v=arr.length;
      int a=0, b=0, c=0;
     for(int x=0; x<v ; x++){
         if(arr[x]>0) a+=1; 
         else if(arr[x]<0) b+=1;
         else c+=1; 
     }
     ar[0] = a/v;
     ar[1] = b/v;
     ar[2] = c/v;
     for (double item: ar)
      System.out.println(item);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
