import java.util.*;

class Student {
    String name;
    double marks;

    Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class PartB {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Arjun", 82),
            new Student("Priya", 78),
            new Student("Keerti", 91),
            new Student("Mausam", 65),
            new Student("Rohit", 88)
        );

        System.out.println("Students with marks > 75, sorted by marks:");

        students.stream()
            .filter(s -> s.marks > 75) // filter
            .sorted(Comparator.comparingDouble(s -> s.marks)) // sort by marks ascending
            .map(s -> s.name) // extract names
            .forEach(System.out::println);
    }
}
