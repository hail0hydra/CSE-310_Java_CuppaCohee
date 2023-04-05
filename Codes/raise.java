import java.util.*;

public class raise{
    public static void main(String...args){

        try{
            int age = Integer.parseInt(args[0]);
            System.out.println("Welcome to our Code!");

            if (age > 100 || age< 1){
                throw new InputMismatchException();
            }

            if (age > 18){
                System.out.println("Eligible to vote!");
            }
        }

        catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Supply Age as argument 0!");
        }

        catch (InputMismatchException im){
            System.out.println("Sike! I threw it :)");
        }

        finally{
            System.out.println("Thanks for using our Code!");
        }
    }
}
