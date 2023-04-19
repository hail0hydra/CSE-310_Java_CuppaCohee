import java.util.Scanner;
import java.io.*;

public class QuestFile{
    public static void main(String...args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your ID: ");

        String name = sc.nextLine();


        File ef = new File(name);

        FileWriter ff1 = null;
        FileWriter ff2 = null;
        File f1 = new File(name+"/eligible_x.txt");
        File f2 = new File(name+"/notEligible_y.txt");


        try{
            //Create directory of name 
            ef.mkdir();



            f1.createNewFile();



            f2.createNewFile();
        }

        catch(Exception e){

        }

        System.out.print("\n\nEnter no. of family members: ");
        int f = sc.nextInt();

        for (int i = 0; i<f; i++){
            System.out.println("\nEnter member's name: ");
            String fnl = sc.nextLine();
            String fn = sc.nextLine();

            System.out.println("\nEnter member's age: ");
            int age = sc.nextInt();


            if (age >= 18){
                x = x+1;
                // enter into eligible_x
                try{

                    ff1 = new FileWriter(f1, true);
                    ff1.append(fn+":"+age+"\n");
                    ff1.flush();
                }

                catch(IOException e){
                    try{
                        ff1.close();
                    }
                    catch(IOException xe){

                    }
                }
            }

            else{

                y = y+1;

                // enter into not notEligible_y
                try{

                    ff2 = new FileWriter(f2, true);
                    ff2.write(fn+":"+age);
                    ff2.flush();
                }

                catch(IOException ioe){
                    try{
                        ff2.close();
                    }
                    catch(IOException io){

                    }

                }
            }

        }

        File r1 = new File (name+"/eligible_"+x+".txt");
        File r2 = new File (name+"/notEligible_"+y+".txt");

        f1.renameTo(r1);
        f2.renameTo(r2);
    }
}
