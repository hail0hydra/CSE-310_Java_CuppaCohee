import java.util.*;

class myExp extends Exception{
    String m;

    myExp(String msg){
        this.m = msg;
    }
}


class HelloWorld{

    void display() throws InterruptedException{
        for (int i=10; i>=1; i--){
            System.out.println(i);
            Thread.sleep(500); // sleep throws InterruptedException
        }
    }

    void divide(int x, int y) throws ArithmeticException{
        System.out.println(x/y);
    }

    void testThrows() throws myExp{
        throw new myExp("Hello");
    }


}

public class throwsK {
    public static void main (String...args){

        HelloWorld hw = new HelloWorld();

        try{
            hw.display(); // since throws is mentioned, error will occur at this line
        }

        catch (Exception e){

            // This doesn't work

            System.out.println("\n\nException\n\n");
            e.printStackTrace(); 
        }

        hw.divide(4,2);

        try{
        hw.divide(2,0);
        }
        catch (ArithmeticException ae){
            System.out.println("Can't divide by Zero");
        }

        try{
        hw.testThrows();
        }

        catch(myExp me){
            System.out.println(me.m);
        }
    }
}
