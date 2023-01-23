import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < 0 || a > 127 || b < 0 || b > 127) {
            System.out.println("Invalid Input");
        } else if (a << Integer.numberOfLeadingZeros(a) == b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
