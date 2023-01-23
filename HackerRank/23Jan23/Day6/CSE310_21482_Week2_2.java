import java.io.*;
import java.util.*;

public class CSE310_21482_Week2_2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < 0 || a > 127 || b < 0 || b > 127) {
            System.out.println("Invalid");
        } else if ((a >> Integer.numberOfTrailingZeros(a)) == b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
    }
}
