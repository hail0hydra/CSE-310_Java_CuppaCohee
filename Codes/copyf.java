import java.io.*;

public class copyf{
    public static void main(String...args){

        File f1  = new File("file1.txt");

        File f2 = new File("test.txt");

        FileWriter fw = null;
        FileReader fr = null;

        try{

            fw = new FileWriter(f2,true);
            fr = new FileReader(f1);

            int x;
            String str = "";
            while ((x = fr.read()) != -1){
                str+=(char)x;
            }

            fw.write(str);
            fw.flush();
        }

        catch(Exception e){

        }

        finally{

            try{
                fw.close();
                fr.close();
            }

            catch(IOException ioe){

            }
        }
    }
}
