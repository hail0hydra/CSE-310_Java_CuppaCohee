import java.util.*;

public class Collection{
    public static void main(String...args){

        ArrayList<String> cars = new ArrayList<String>(); // we can do this without mentioning String as well
        cars.add("Porsche");
        cars.add("Nano");
        cars.add("Safari");
        cars.add("Mustang");

        System.out.println(cars);
        System.out.println(cars.contains("Mustang"));
        cars.remove("Nano");

        ArrayList<String> vehicles = new ArrayList<String>();

        vehicles.add("dbz");
        vehicles.add("hayabuza");
        vehicles.addAll(cars);

        System.out.println(vehicles);
        System.out.println(vehicles.containsAll(cars));
        vehicles.removeAll(cars);

        cars.add("dbz");
        vehicles.retainAll(cars);

        System.out.println(vehicles);

        cars.clear();

        System.out.println(cars.isEmpty());

        System.out.println(vehicles.size());

        System.out.println(vehicles.toArray()); // return object
        System.out.println(vehicles.hashCode());


        vehicles.add("one");
        vehicles.add("two");

        Iterator it = vehicles.Iterator();
    }
}
