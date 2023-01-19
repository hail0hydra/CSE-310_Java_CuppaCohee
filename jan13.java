// filetname and Parent class name should be same

import java.lang.Math;
import java.util.Scanner;
public class jan13{
    public static void main(String[] args) {
        // check if a number is perfect sqaure or not
        // int roll, regn;
        //
        // String name;
        //
        int number;


        Scanner sc = new Scanner(System.in);


        // System.out.print("Enter  Roll number: ");
        // roll = sc.nextInt();

        // System.out.print("\nEnter name:  ");
        // name = sc.next();

        // System.out.print("\nEnter Regn. number: ");
        // regn = sc.nextInt();

        System.out.print("\nEnter a number:  ");
        number = sc.nextInt();

        String s = String.valueOf(number);

        // System.out.println("\n\n"+roll+"\n"+name+"\n"+regn);

        // if ((((Object)Math.sqrt(x))).getClass().getName() == "java.lang.Integer") {
        // System.out.println("Perfect Square");
        // }
        //
        System.out.println("Number of digits in "+number+" is: "+s.length());
}
}

