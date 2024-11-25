import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee1 implements Comparable<Employee1>{
    private int employeeId;
    private  String employeeName;
    private int salary;


    public int compareTo(Employee1 o) {
        return this.employeeId - o.employeeId;
    }

    public Employee1(String employeeName, int employeeId, int salary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
 class  NameComparator implements Comparator<Employee1>{
    @Override
    public int compare(Employee1 o1, Employee1 o2) {
        return o1.getEmployeeName().compareTo(o2.getEmployeeName());
    }
}

public class ComparatorInterface {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(new Employee1("Piyush",1256,50000));
        list.add(new Employee1("Ketan",2567,10000));
        list.add(new Employee1("Kartik",3600,562000));
        list.add(new Employee1("Parul",2569,59000));
        Collections.sort(list,new NameComparator());
        System.out.println(list);
    }
}
