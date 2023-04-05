import java.util.*;

public class averageExp{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);

        try{

            float a = sc.nextFloat();
            float b = sc.nextFloat();

            if (b == a+1 || a == b){
                System.out.println(0);
                System.exit(0);
            }

            float average = ((a+1)+(b-1))/2;

            System.out.println(average);
        }

        catch (InputMismatchException im){
            System.out.println("Enter an INT");
        }

    }
}
