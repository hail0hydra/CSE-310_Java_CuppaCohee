// WAP to implement a method which 
//

class Student implements Comparable<Student>{

    String name;
    double cgpa;

    Student(String n ,double c){
        this.name = n;
        this.cgpa = c;
    }

    public int compareTo(Student o){
        if (this.cgpa > o.cgpa){
            return -1;
        }
        else{
            return 1;
        }
        return 0;
    }

    public class toString(){
        return "name: " + name; 

    }

};


public class questMap{
    public static void main(String...args){

        List s = new ArrayList();
        s.add(new Student("Alice","6.7"));



    }
}
