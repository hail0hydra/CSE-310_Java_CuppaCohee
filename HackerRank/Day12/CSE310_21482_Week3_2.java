import java.util.*;
import java.io.*;

public class CSE310_21482_Week3_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = "";
        s1+=sc.nextLine();
        String s2 = "";
        s2+=sc.nextLine();
        String s3 = "";
        s3+=sc.nextLine();

        if ((s1.charAt(s1.length()-1)) == ' ') { // added because
            s1 = s1.substring(0,s1.length()-1);
        }

        if (s2.charAt(s2.length()-1) == ' ') {
            s2 = s2.substring(0,s2.length()-1); // for some reason,
        }

        if (s3.charAt(s3.length()-1) == ' ') { // the last space char was to be
            s3 = s1.substring(0,s3.length()-1); // not COUNTED!!!!!
        }
        
        if (s1.length() > 50 || s2.length() > 50 || s3.length() > 50) {
            System.exit(0);
        }
        else if (s1.length() == s2.length() && s2.length() == s3.length()) {
            System.out.println(-1);
            System.exit(0);
        }
        else {
            int g = Math.max(Math.max(s1.length(),s2.length()),s3.length());
            System.out.println(g);
        }

    }

}
