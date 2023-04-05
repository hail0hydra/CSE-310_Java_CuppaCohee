class Bank{
    static int p = 1000;

    class Loan{

        int interest;

        void calcAmt(int interest) {
            int amt = p + ((p*interest*1)/100);
            System.out.println(amt);
        }
    }
}

public class Quest22Mar{
    public static void main(String...args){
        Bank b = new Bank();

        Bank.Loan l1 = b.new Loan();
        Bank.Loan l2 = b.new Loan();
        Bank.Loan l3 = b.new Loan();


        l1.calcAmt(8);
        l2.calcAmt(10);
        l3.calcAmt(12);
    }
}
