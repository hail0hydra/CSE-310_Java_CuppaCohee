class Bank{
    int time = 1;

    void processLoan() {

        int a;

        class Loan{ // local class
            void show() {
                display();
            }
        }
    }

    void display() {
        // We can't access Loan class here
        processLoan();
    }

}

public class Quest22Mar{
    public static void main(String...args){


    }
}
