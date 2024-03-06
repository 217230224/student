import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of students: ");
            int numStudents = scanner.nextInt();
            scanner.nextLine();

            Student[] students = new Student[numStudents];

            for (int i = 0; i < numStudents; i++) {
                System.out.println("Enter details for Student " + (i + 1) + ":");
                System.out.print("Student ID: ");
                String studentID = scanner.nextLine();
                System.out.print("Student Name: ");
                String studentName = scanner.nextLine();
                System.out.print("Number of Extra Activities: ");
                int numExtraActivities = scanner.nextInt();
                scanner.nextLine();

                Student student = new Student(studentID, studentName, numExtraActivities);

                for (int j = 0; j < numExtraActivities; j++) {
                    System.out.print("Enter Extra Activity " + (j + 1) + ": ");
                    String activity = scanner.nextLine();
                    student.addExtraActivity(j, activity);
                }

                students[i] = student;
            }

            System.out.println("\nStudent Details:");
            for (Student student : students) {
                System.out.println(student.toString());
            }
        }
    }
}