import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cost = scanner.nextInt();
        double GST = 18.0;

        if (cost > 450) {
            double price = cost + (cost * GST / 100);
            System.out.println(price);
        } else {
            System.out.println("Invalid Input");
        }
    }
}
