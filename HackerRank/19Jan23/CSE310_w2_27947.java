import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sauravCards = new int[4];
        int[] friendCards = new int[4];

        // input for Saurav's cards
        for (int i = 0; i < 4; i++) {
            sauravCards[i] = scanner.nextInt();
        }

        // input for friend's cards
        for (int i = 0; i < 4; i++) {
            friendCards[i] = scanner.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            if (friendCards[i] < 1 || friendCards[i] > 13 || sauravCards[i] < 1 || sauravCards[i] > 13) {
                System.out.println("Invalid Input");
                System.exit(0);
            }
        }

        int sauravEven = 0;
        int sauravOdd = 0;
        int friendEven = 0;
        int friendOdd = 0;

        // counting even and odd cards for Saurav
        for (int i = 0; i < 4; i++) {
            if (sauravCards[i] % 2 == 0) {
                sauravEven++;
            } else {
                sauravOdd++;
            }
        }

        // counting even and odd cards for friend
        for (int i = 0; i < 4; i++) {
            if (friendCards[i] % 2 == 0) {
                friendEven++;
            } else {
                friendOdd++;
            }
        }

        
        if (sauravEven == friendOdd || sauravEven == friendEven) {
            System.out.println("Tie");
        }

        else if (sauravEven > sauravOdd){
            if (sauravEven > friendEven) {
                System.out.println("Saurav Won");
            }
            else {
                System.out.println("Saurav Lost");
            }

        }
        else if (sauravOdd > sauravEven) {
            if (sauravOdd > friendOdd) {
                System.out.println("Saurav Won");
            }
            else {
                System.out.println("Saurav Lost");
            }
        }
        else if (friendEven > friendOdd) {
            if (friendEven > sauravEven) {
                System.out.println("Saurav Lost");
            }
        }
        else if (friendOdd > friendEven) {
            if (friendOdd > sauravOdd) {
                System.out.println("Saurav Lost");
            }
        }
    }
}
