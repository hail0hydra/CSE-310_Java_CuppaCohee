p:blic class Brainstormer3{
    public static void main(String[] args) {
        System.out.println(2>1||4>3?false:true);

        class X{}
        class Y extends X{}
        class Z extends Y{}

        X x1 = new Y();
        Y y1 = new Z();
        Y y2 = new Y();

        System.out.println(x1 instanceof X);
        System.out.println(x1 instanceof Z);
        System.out.println(y1 instanceof Z);
        System.out.println(y2 instanceof X);
    }
}
