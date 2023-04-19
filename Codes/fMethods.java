import java.io.*;

public class fMethods{
    public static void main(String...args){

        File f = new File("file1.txt");
        File p = new File("TestDir/file1.txt");
        File d = new File("./");

        try{

            System.out.println("\n\n");
            System.out.println(f.isFile());

            p.createNewFile();

            System.out.println(f.getPath());
            System.out.println(f.getAbsolutePath());

            System.out.println("\n\n\n");

            File[] files =  d.listFiles(); // return array of File Object
                                           
            for (File filex:files){
                System.out.println(filex.getName());
            }


        }

        catch(Exception ioe){
            System.out.println("Maybe the file doesn't exist");
        }
    }
}
