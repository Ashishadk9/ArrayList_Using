import java.util.ArrayList;

public class StudentDemo {
    public static void main(String[] args) {
        // Creating an ArrayList to store Student objects
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ram", 20, 85.5));
        students.add(new Student("John", 10, 38.0));
        students.add(new Student("Smith", 12, 72.0));
        for (Student student : students) {
            System.out.println("Student Details:");
            student.displayDetails();
            System.out.println("Passed:"+ student.hasPassed());
            System.out.println();
        }
    }
}
