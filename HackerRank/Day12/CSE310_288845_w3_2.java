import java.util.*;
import java.io.*;

public class CSE310_288845_w3_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String num = String.valueOf(n);

        if (n < 0) {
            System.exit(0);
        }
        else {
            if (num.charAt(0) == '0'){
                num = num.substring(1,num.length());
            }

            System.out.println(num.length());
        }
    }
}
