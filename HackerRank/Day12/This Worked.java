import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long  a=sc.nextLong();
        int count=0;
        long b=a;
        while(a!=0){
            a=a/10;
            count++;
        }
        if(b>2147483647){
            System.out.println("Invalid Number");
        }else{
        if(b>0){
          System.out.println(count);  
        }
        else{
                      System.out.println("Invalid Number");  

        }
 
        }
    }
}
