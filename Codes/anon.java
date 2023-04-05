// abstract class Bike {
interface Bike{

    // abstract void run();
    // void run(); // can have only one undefined method to be inherited by lambda expression


    void lamb();

    default void repair(){
        System.out.println("Repairing a Bike");
    }
}

class car{

    car() {
        System.out.println("Bike constructor");
    }

   void lamb(){};

    void repair(){
        System.out.println("Repairing a Bike");
    }
}


public class anon{
    public static void main(String...args){
        // Bike b = new Bike() // creating object for anonymous class with reference variable of Bike class
        // { // anonmous class starts, inheriting Bike class
        //     void run() {
        //         System.out.println("Bike is Running");
        //         applyBreak();
        //     }
        //
        //
        //     void applyBreak() { // we can call this inside over-ridden methods
        //         System.out.println("Break Applied");
        //     }
        // };
        //
        // b.run();
        // b.repair();
        // b.applyBreak(); // this will not be called as the object is of Bike Type.

        Bike b1 = () -> { // lambda expression
            System.out.println("Lambda Expression");
        };

        b1.lamb();

        car b2 = new car() {
            public void lamb(){
                System.out.println("Lamb in Anon");
            }
        };

        b2.lamb();
    }
}
