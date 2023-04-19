import java.io.*;
import java.util.Scanner;

public class files{
    public static void main(String...args){

        Scanner sc = new Scanner(System.in);

        File f = new File("file1.txt");

        FileWriter fw = null;


        System.out.println("File Size before data: "+f.length()+"\n\n\n");

        try{
            fw = new FileWriter(f, true);

            System.out.print("Car Name: ");
            String a  = sc.nextLine();
            System.out.print("Model: ");
            String b  = sc.nextLine();
            System.out.print("Manufacture Year: ");
            String c  = sc.nextLine();

            fw.append("\n\nCar name: "+a+"\nModel: "+b+"\nManufacture: "+c+"\n\n");
            fw.flush(); // to flush away garbage from stream

            System.out.println("\n\n\nFile Size after data: "+f.length()+"\n\n\n");
        }

        catch(IOException ioe){
            try{
                fw.close();
            }
            catch(IOException io){

            }
        }
    }
}
