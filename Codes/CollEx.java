import java.util.*;

class Student implements Comparable<Student>{

    int age;
    String name;

    Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int compareTo(Student o){
        if (this.age > o.age){
            return 1;
        }
        else
        {
            return -1;
        }
    }

    public String toString(){
        return "Age: " + age + " Name: " + name;
    }
};

public class CollEx{

    public static void main(String...args){

        Comparator<Object> com = new Comparator<Object>(){
            public int compare(Object o1, Object o2){

                Student s1 = (Student)o1;
                Student s2 = (Student)o2;

                if (s1.age > s2.age){
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        };



        ArrayList<Student> st = new ArrayList();

        st.add(new Student(17, "Rohan"));
        st.add(new Student(24, "Henry"));
        st.add(new Student(18, "Alice"));
        st.add(new Student(16, "Jay"));

        Collections.sort(st,com); // with Comparator
        System.out.println(st);

        Collections.sort(st); // with Comparable
        System.out.println(st);
    }
}
