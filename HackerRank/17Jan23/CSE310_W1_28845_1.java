import java.util.Scanner;

public class CSE310_W1_28845_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cbt1 = sc.nextInt();
        int cbt2 = sc.nextInt();
        int proj = sc.nextInt();
        int quiz = sc.nextInt();

        if (cbt1 <= 20 && cbt1 >= 0){
            if (cbt2 <= 20 && cbt2 >= 0){
                if (proj <= 15 && proj >= 0){
                    if (quiz <= 5 && quiz >= 0){
                        System.out.println(cbt1+cbt2+proj+quiz);
                    }
                    else {
                        System.out.println("Invalid Input");
                    }
                }
                else {
                    System.out.println("Invalid Input");
                }
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
