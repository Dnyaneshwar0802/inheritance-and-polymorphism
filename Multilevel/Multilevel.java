
public class Multilevel {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, "A");
        Teacher teacher = new Teacher("Mr. Smith", 45, "Mathematics");

        System.out.println("Student Details:");
        student.displayDetails();

        System.out.println("\nTeacher Details:");
        teacher.displayDetails();
    }
}
