public class inheritance{
    public class Parent{};
    public class Child extends Parent{}; // inheritance
    public  class TestInstanceOf{
        Parent p = new Parent();
        Child c  = new Child();
    }
    public static void main(String[] args){

        System.out.println(p instanceof Child);// false
        System.out.println(p instanceof Parent);// true
        System.out.println(c instanceof Child);// true
    }
}

