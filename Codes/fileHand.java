import java.io.*;

public class fileHand{
    public static void main(String...args){
        File f = new File("F:\\LPU\\Semester 4\\JAVA - CSE 310\\Codes\\file1.txt"); // creates only object and not file
        File f1 = new File("../Notes/file2.txt");
        
        try{
            if (f.createNewFile()){
                System.out.println("File Created on absolute path");
            }

            else{
                System.out.println("File already exists");
            }


            if (f1.createNewFile()){
                System.out.println("File Created on relative path");
            }

            else{
                System.out.println("File already exists");
            }
        }

        catch(IOException io){
            System.out.println("Could not be created");
        }

    }
}
