import java.io.*;
import java.util.*;

public class Week2_26699_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        int x = (int)(Math.ceil(a));
        int y = (int)(Math.ceil(b));
        int z = (int)(Math.ceil(c));

        System.out.println(x+" "+y+" "+z);
    }
}
