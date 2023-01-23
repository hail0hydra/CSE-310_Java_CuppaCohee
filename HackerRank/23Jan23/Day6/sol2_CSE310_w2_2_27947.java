import java.io.*;
import java.util.*;

public class CSE310_w2_2_27947{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (!(x>=0 && x<=127 && y>=0 && y<=127)){
            System.out.println("Invalid");
            System.exit(0);
        }
        else if (x == y) {
            System.out.println("No");
            System.exit(0);
        }

        int i = x;

        while (i <= y) {
            if (i == y){
                System.out.println("Yes");
                System.exit(0);
            }

            i = i*2;
        }

        System.out.println("No");
    }
}
