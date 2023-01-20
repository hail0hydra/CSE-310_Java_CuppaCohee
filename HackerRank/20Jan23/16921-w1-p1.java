import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x < 0 || y < 0) {
            System.out.println("Invalid Input");
            System.exit(0);
        }

        System.out.println(x+"-"+y);
    }
}

