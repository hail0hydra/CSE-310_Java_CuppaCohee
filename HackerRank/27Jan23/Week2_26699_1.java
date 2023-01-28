import java.io.*;
import java.util.*;

public class Week2_26699_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rate = sc.nextDouble();

        if (rate < 1) {
            System.exit(0);
        }

        if (rate > 5) {
            System.out.println("101");
            System.exit(0);
        }

        System.out.println("thanks");
    }
}
