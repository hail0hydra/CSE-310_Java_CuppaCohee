public class PeterQuest{
    public static void main(String[] args) {
        float x = Float.parseFloat(args[0]);
        float y = Float.parseFloat(args[1]);
        int n = Integer.parseInt(args[2]);


        for (float i = x; i<y; i++){
            if (i % n == 0){
                System.out.println(i);
            }
        }
    }
}
