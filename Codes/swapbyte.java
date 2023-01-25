// Not completed
public class swapbyte{
    public static void main(String[] args){
        byte s=5,u=10;


        int a = Integer.parseInt(s);
        int b = Integer.parseInt(u);

        System.out.println("Pre Swap\n a: "+a+"\n b: "+b);
        //Swap
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Post Swap\n a: "+a+"\n b: "+b);
    }
}
