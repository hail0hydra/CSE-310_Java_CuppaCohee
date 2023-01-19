import java.io.*;
import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N>50){
            System.out.println("Number out of limit");
        }
        else if (N<0){
            System.out.println("Number should be Positive");
        }
        else {
            int c = 0;
            if (N == 1){
                System.out.println("Non Prime Number");
            }
            else {
                for (int i = 1; i<(N/2)+1; i++){
                    if (N%i == 0){
                        c+=1;
                    }
                }
                if (c>1){
                    System.out.println("Non Prime Number");
                }
                else {
                    System.out.println("Prime Number");
                }
            }
        }
    }
}
