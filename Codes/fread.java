import java.io.*;

public class fread{
    public static void main(String...args){

        File f = new File("file1.txt");

        try{
            FileReader fr = new FileReader(f);
            // System.out.println(fr.read()); // return type is int, so it returns ASCII value of first char


            int x = 0;
            while ((x = fr.read()) != -1){

                // x = fr.read();

                System.out.print((char)x);
            }
            System.out.println("\n");

        }
        catch(FileNotFoundException fnf){

        }
        catch(IOException ioe){

        }
    }
}
