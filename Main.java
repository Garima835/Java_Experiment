import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L; 

    private int studentID;
    private String name;
    private double grade;

    public Student(int studentID, String name, double grade) {
        this.studentID = studentID;
        this.name = name;
        this.grade = grade;
    }

    public int getStudentID() { return studentID; }
    public String getName() { return name; }
    public double getGrade() { return grade; }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student(101, "Arjun", 9.5);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(student);
            System.out.println("Student object has been serialized to 'student.ser'.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student deserializedStudent = (Student) ois.readObject();
            System.out.println("Student object has been deserialized.");
            System.out.println("Student ID: " + deserializedStudent.getStudentID());
            System.out.println("Name: " + deserializedStudent.getName());
            System.out.println("Grade: " + deserializedStudent.getGrade());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
