import java.io.*;

class Laptop implements Serializable{
    String Brand;
    String ID;
    int WarrantyYears;
}
    
public class SerDeser{
    public static void main(String...args) throws IOException{
        Laptop lp = new Laptop();
        lp.Brand = "hp";
        lp.ID = "x123";
        lp.WarrantyYears = 5;


        File f = new File("test.txt");

        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);


        oos.writeObject(lp);
    }
}
