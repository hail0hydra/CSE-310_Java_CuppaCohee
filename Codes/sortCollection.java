import java.util.*;


public class sortCollection{
    public static void main(String...args){



        // comparator is an interface. we have created its anonymous class j=hwere. We gave new definition to its method compare.
        Comparator<Integer> com = new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2){
                if (o1%10 > o2%10){
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        };
        // this method overriding is done to check only last digit of numbers for comparison

        ArrayList<Integer> a = new ArrayList<Integer>();

        a.add(12);
        a.add(10);
        a.add(20);
        a.add(23);
        a.add(9);

        System.out.println(a);

        Collections.sort(a, com); // putting in comparator as an arg as well

        System.out.println(a);
    }
}
