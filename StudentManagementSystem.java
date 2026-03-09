import java.util.ArrayList;
import java.util.Scanner;

class Student {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                System.out.print("Enter student name: ");
                String name = scanner.nextLine();

                System.out.print("Enter marks: ");
                int marks = scanner.nextInt();

                students.add(new Student(name, marks));

                System.out.println("Student added successfully!");

            } 
            else if (choice == 2) {

                if (students.isEmpty()) {
                    System.out.println("No students found.");
                } 
                else {

                    System.out.println("\nStudent List:");

                    for (Student s : students) {
                        System.out.println("Name: " + s.name + " | Marks: " + s.marks);
                    }
                }

            } 
            else if (choice == 3) {

                System.out.println("Exiting program.");
                break;

            } 
            else {
                System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}