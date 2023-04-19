import java.io.*;

public class file2{
    public static void main(String...args){

        File f = new File("test.txt");

        FileReader fr = null;

        try{
            fr = new FileReader(f);

            String s = "";

            int x;
            while ((x = fr.read()) != -1){
                s+=(char)x;
            }

            String arr[] = s.split("\n");

            if (arr.length > 1){
                System.out.println(arr[1]);
            }

            else{
                System.out.println("No more than one line");
            }

        }

        catch(Exception e){

        }
    }
}
