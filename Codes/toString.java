public class toString{
    public static void main(String[] args){
        int value = 30;
        String s1 = String.valueOf(value);
        // System.out.prinltn(s1+10); // gives error
        System.out.prinltn(s1+""+10); // concatenate
    }
}
