import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - $" + salary;
    }
}

public class PartA {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Arjun", 55000));
        employees.add(new Employee(1, "Priya", 72000));
        employees.add(new Employee(2, "Keerti", 48000));

        // Sort by salary ascending using lambda
        employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));

        System.out.println("Employees sorted by salary:");
        employees.forEach(System.out::println);
    }
}
