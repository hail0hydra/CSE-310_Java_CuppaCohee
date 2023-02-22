public class thisKeyword{

    int a = 0;
    int b = 0;
    thisKeyword (int a,int b)
    {
        this.a = a;
        this.b = b;
    }

    public static void main(String...args){
        thisKeyword td = new thisKeyword(10,12);
        thisKeyword td1 = new thisKeyword(100,23);
        System.out.println(td.a);
        System.out.println(td.b);
        System.out.println(td1.a);
        System.out.println(td1.b);
    }
}


