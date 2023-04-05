class Bank{
    int time;
    int a;

    static int c = 10;

    static class Loan {
        
        int interest;

        void processLoan(){
            Bank b = new Bank();
            System.out.println(b.time);
        }

        void fun() {
            Bank b = new Bank();
            System.out.println(b.a);
            System.out.println(b);
            System.out.println(c);
        }
    }
}

public class NestedContd{
    public static void main(String...args){
        Bank B = new Bank();

        Bank.Loan l = new Bank.Loan();
        l.fun();
        l.processLoan();

    }
}
