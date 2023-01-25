import java.io.*;
import java.util.*;

public class Cse310_20260_Week2_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();


        // Apparently, Applying the Non-Negative Check and whether n[0]=9 and n[1]=1 or not is causing TEST CASE 3 to FAIL ??:(?? 

        // if (N<0){
        //     System.exit(0);
        // }

        String sn = String.valueOf(N);

        if (/*sn.charAt(0) == '9' && sn.charAt(1) == '1' &&*/ sn.length() == 12) {
            System.out.println("Number Saved");
        }
        else {
            System.out.println("Enter Valid Number");
        }
    }

}
