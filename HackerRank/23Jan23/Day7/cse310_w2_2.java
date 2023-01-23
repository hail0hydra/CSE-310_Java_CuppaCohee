import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class  Solution{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age <= 18) {
            System.out.println("Not eligible");
        } else {
            System.out.println("Eligible");
        }
    }
}
