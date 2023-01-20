// It was created just to show example of instanceof() method
//
// Not purposed towards understanding INHERITANCE


public class inheritance1{
    public static void main(String[] args){
        class Parent{}
        class Child extends Parent{} // inheritance
        Parent p = new Parent();
        Child c  = new Child();

        System.out.println(p instanceof Child);// false
        System.out.println(p instanceof Parent);// true
        System.out.println(c instanceof Child);// true

    }
}

