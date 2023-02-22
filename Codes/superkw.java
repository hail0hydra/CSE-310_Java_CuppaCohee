class Car {
    Car() {
        System.out.println("Driving a car");
    }
    void showWheels() {
        System.out.println("No wheels RN");
    }

    int Manufacture = 1964;
}

class Ford extends Car {
    Ford() {
        super(); // actually this is being done, INVISIBALLY
        System.out.println("Driving a Ford Mustang");
        super.showWheels();
        System.out.println(super.Manufacture);
    }
}

public class superkw{
    public static void main(String...args) {
        Ford f = new  Ford(); // should display only Ford println, but doesotherwise.
    }
}
