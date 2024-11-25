import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
    private int id;
    private  String name;
    private int salary;

    @Override
    public int compareTo(Employee o) {
        return this.id - o.getId();
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "{ Employee Id : " + getId() + ", Employee Name : " + getName() + ", Employee Salary : " + getSalary() + " }" ;
    }
}
public class ComparableInterfaceUsingSet {
    public static void main(String[] args) {
        Set<Employee> set = new TreeSet<>();
        set.add(new Employee(45,"Aman",60000));
        set.add(new Employee(1,"Piyush",50000));
        set.add(new Employee(5,"Aatmik",60000));
        set.add(new Employee(8,"Divyansh",61000));
        System.out.println(set);


    }
}
