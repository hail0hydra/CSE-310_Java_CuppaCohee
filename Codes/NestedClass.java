class Cricket{

    Cricket() {
        System.out.println("Cricket's Constructor");
    }

    int score; // `private` is access specifier

    void playGame() {
        Prizes p = new Prizes();
        p.distributePrizes();
    }

    class Prizes{ // inner class
        Prizes() {
            System.out.println("Prizes's Constructor");
        }
        void distributePrizes() {
            System.out.println("You got a prize "+score);
        }
    }

}

public class NestedC{

    public static void main(){

        Cricket c1 = main(String...args)
    }
}


public class NestedClass {
    public static void main(String...args){
        Cricket c1 = new Cricket();
        c1.score = 101;
        // c1.playGame(); // this will also create a class of Prizes. See inside

        System.out.println("");

        // Creating Object of inner Class
        Cricket.Prizes p1 = new Cricket().new Prizes();
        Cricket.Prizes p2 = new Cricket().new Prizes();
        p1.distributePrizes();

        System.out.println("");

        //another way

        Cricket.Prizes p3 = c1.new Prizes();
        p3.distributePrizes();
        Cricket.Prizes p4 = c1.new Prizes();
        p4.distributePrizes();
    }
}
