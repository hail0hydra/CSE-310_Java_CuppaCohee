class Parent {
    public void drive() {
        System.out.println("Parent");
    }
    public int drive(int a) {
        System.out.println("Parent with int");
        return 0;
    }
}

class Child extends Parent {

    public void drive() {
        System.out.println("Child");
    }
}

public class methodOverloading {
    public static void main(String...args) {
        Parent p = new Child();
        p.drive();
        p.drive(0); // special case, actually it is inheriting
    }
}
