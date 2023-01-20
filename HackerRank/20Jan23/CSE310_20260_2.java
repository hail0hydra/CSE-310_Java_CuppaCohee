import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;

        if (N == 2 | N == 3) {
            System.out.println("Prime Number");
            System.exit(0);
        }
        else if (N == 1) {
            System.out.println("Not Prime Number");
            System.exit(0);
        }

        for (int i = 1; i < (N/2)+1; i++) {
            if (N%i == 0) {
                count += 1;
            }
        }

        if (count > 1) {
            System.out.println("Not Prime Number");
        }
        else {
            System.out.println("Prime Number");
        }
    }
}
