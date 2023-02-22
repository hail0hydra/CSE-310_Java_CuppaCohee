class Car{
    void drive(){
        System.out.println("Driving Car");
    }

    void playMusic(){
        System.out.println("Playing Music");
    }
}

class Mustang extends Car{
    void drive(){ //method overriding
        System.out.println("Driving a Mustang");
    }
    void drive(int speed){ //function overloading
        System.out.println("Driving a Mustang");
    }

    void fly(){
        System.out.println("Flying a Mustang");
    }
}

public class inheritance{
    public static void main(String...args){
        Car c =  new Car();
        c.drive();

        Mustang m = new Mustang();
        m.drive();

        Car cc = new Mustang();
        cc.drive();

        //cc.fly(); // compile time error
        
        // Below line is Just 
        // Mustang w = new Car();
        // w.fly();

    } 
}
