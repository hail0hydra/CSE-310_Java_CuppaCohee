import java.util.*;

class InvalidException extends Exception{

    String message;

    InvalidException(String msg){
        message = msg;
    }
}

public class raise2{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter number of subjects: ");
            int subjects = sc.nextInt();

            if (subjects > 5){
                throw new ArithmeticException();
            }

            int marks[] = new int[subjects];

            System.out.println("Enter marks in each subject");
            for (int i = 0; i<subjects; i++){
                marks[i] = sc.nextInt();

                if (marks[i] > 100){
                    throw new InvalidException("No extra marks for good handwriting!");
                }
            }

            System.out.println("\nFollowing are the marks");
            for (int i = 0; i<subjects; i++){
                System.out.println(marks[i]);
            }
        }

        catch (ArithmeticException am){
            System.out.println("Can't be more than 5 subjects");
        }

        catch (InvalidException ie){
            System.out.println(ie.message);
        }
    }
}
