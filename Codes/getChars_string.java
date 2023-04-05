public class getChars_string{
    public static void main(String...args){

        String s = "Java Programming Language";

        char[] ch = new char[20];
        s.getChars(5,17,ch,0); //where to start, where to end, where to copy, at which index to copy

        System.out.println(ch);
    }
}
