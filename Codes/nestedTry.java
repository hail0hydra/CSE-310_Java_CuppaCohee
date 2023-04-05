public class nestedTry{
    public static void main(String...args){

        try{
            int age = Integer.parseInt(args[0]);
            System.out.println("Welcome to our Code!");

            if (age > 18){
                System.out.println("Eligible to vote!");
            }
        }

        // finally {
        //     System.out.println("Testing finally in between");
        // }

        catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Supply Age as argument 0!");
        }

        finally{
            System.out.println("Thanks for using our Code!");
        }
    }
}
