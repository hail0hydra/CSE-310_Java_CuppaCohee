import java.util.*;

public class CommanLineArgs{
    public static void main(String[] args) {
        float x = Float.parseFloat(args[0]);
        float y = Float.parseFloat(args[1]);
        int d = Integer.parseInt(args[2]);

        for (float i = x; i<y; i=i+d){
            System.out.println(i);
        }
    }
}
