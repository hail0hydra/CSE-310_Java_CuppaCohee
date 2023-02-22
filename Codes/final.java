class Car{
    void drive() {
        System.out.println("Car Driven in parent");
    }
}


final class Bus{ // can't inherit
    void honk(){
        System.out.println("Bus Honked");
    }
}



public class Final extends Bus{

    void drive()
    {
        System.out.println("Car Driven in child");
    }

    public static void main(String a[]){

       Final m = new Final();
       m.drive();
       m.honk();
    }
}
