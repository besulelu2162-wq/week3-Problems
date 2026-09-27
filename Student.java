public class Student {

    String name;
    int attendance;

    // Static variables
    static String collegeName =
            "SRM Institute of Science and Technology";

    static int studentCount = 0;

    // Constructor
    public Student(String name, int attendance) {

        this.name = name;
        this.attendance = attendance;

        studentCount++;
    }

    // Static method
    public static void printCollegeInfo() {

        System.out.println(collegeName);
        System.out.println(
            "Students created: " + studentCount
        );
    }

    public static void main(String[] args) {

        Student student1 =
                new Student("Ravi", 90);

        Student student2 =
                new Student("Anitha", 95);

        Student.printCollegeInfo();
    }
}