public class thisquest{
    String s1,s2;
    int a,b;

    thisquest(){
        this.a = 0;
        this.b = 0;
        this.s1 = null;
        this.s1 = null;
    }

    thisquest(int a, int b){
        this.a  = a;
        this.b = b;
    }

    thisquest(String s1, String s2)
    {
        this(2,9); // calling constructor ----> BOOM!
        this.s1 = s1;
        this.s2 = s2;
    }

    void show(){
        System.out.println("Sum: "+a+b+"\nConcat: "+s1+" "+s2);
    }
    public static void main(String...args) {
        thisquest q1 = new thisquest();
        q1.show();

        thisquest q2 = new thisquest(2,5);
        q2.show();

        thisquest q3 = new thisquest("Java", "Rocks");
        q3.show();
    }
}
