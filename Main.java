import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Student Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Course ID: ");
            int courseId = sc.nextInt();
            System.out.print("Credits: ");
            int credits = sc.nextInt();
            if(age<17 || age>30){
                System.out.println("Invalid age. Must be between 17 and 30");
                return;
            }
            if(courseId<10000 || courseId>99999){
                System.out.println("Invalid course Id. Must be 5 digit number.");
                return;
            }
            if(credits<1||credits>30){
                System.out.println("Invalid number os credits. Must be between 1 and 30");
                return;
            }
            System.out.println("Enrollment Successfull");
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Course ID: "+courseId);
            System.out.println("Credits: "+credits);
        } catch (NumberFormatException e){
            System.out.println("Invalid input. Please enter a numeric value for age, course ID, and credits");
        }
        sc.close();
    }
}