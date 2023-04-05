import java.util.Scanner;
class InvalidMarksException extends Exception{
    String message;
    InvalidMarksException(String msg) {
        super(msg);
    }
}

class HelloWorld {
    void fun() throws InvalidMarksException{
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        System.out.print("Enter number of subjects; ");
        int n = sc.nextInt();
        try {
            if(n>5) throw new ArithmeticException("you might not have studied more than 5 subjects");
            System.out.println("Enter marks in "+n+" subjects");
            for(int i=0;i<n;i++) {
                marks[i] = sc.nextInt();
                if(marks[i]>100) throw new InvalidMarksException("cannot score more than zero");
            }
        }
        catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
    }
    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        hw.fun();

    }
}
