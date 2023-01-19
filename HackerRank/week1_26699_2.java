// Work Around
//
// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;
// import java.util.Scanner;
//
// public class Solution {
//
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         
//         int x = sc.nextInt();
//         
//         System.out.println(x*2+" "+x);
//     }
// }
//
//
// Original
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = x*2;
        
        x = x+y;
        y = x-y;
        x = x-y;
        
        System.out.println(x+" "+y);
    }
}
