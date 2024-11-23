import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Student implements  Comparable<Student>{
    private int rollNumber;
    private String name;

    @Override
    public int compareTo(Student o) {
        return this.rollNumber - o.rollNumber;
    }

    public Student(int rollNumber,String name){
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{ Student Name: " + getName()+" Roll Number " + getRollNumber() + "}";
    }
}
public class ComparableInterfaceDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Student(10,"Student1"));
        list.add(new Student(100,"Student2"));
        list.add(new Student(3,"Student3"));
        list.add(new Student(8,"Student4"));
        list.add(new Student(10,"Student5"));
        Collections.sort(list);
        System.out.println(list);
    }
    
}
