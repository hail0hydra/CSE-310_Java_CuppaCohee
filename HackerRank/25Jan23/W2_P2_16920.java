import java.io.*;
import java.util.*;

public class W2_P2_16920{
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        double P = sc.nextDouble();
        double GST = sc.nextDouble();

        if (!(P > 0)){
            System.exit(0);
        } 

        int x = (int)(Math.floor(P+(Math.floor(P)*(GST/100))));
        System.out.println(x);

        // using Math.floor()
    }
}
