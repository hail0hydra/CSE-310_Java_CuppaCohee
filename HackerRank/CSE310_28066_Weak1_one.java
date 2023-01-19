import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class CSE310_28066_Weak1_one{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double mean = ((a+b+c)/3.0)*10;

        int x = (int)mean;
        double y = x/10.0;

        System.out.println(y);

        // float rounded = (float) Math.round(mean * 10) / 10;
        //System.out.println(rounded);

        // System.out.printf("%.1f",mean);
    }
}
