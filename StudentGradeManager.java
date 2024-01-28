package task4d;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGradeManager {
    private Map<String, Integer> studentGrades;

    public StudentGradeManager() {
        studentGrades = new HashMap<>();
    }

    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student " + name + " added with grade " + grade);
    }

    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            int removedGrade = studentGrades.remove(name);
            System.out.println("Student " + name + " removed with grade " + removedGrade);
        } else {
            System.out.println("Student " + name + " not found");
        }
    }

    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            int grade = studentGrades.get(name);
            System.out.println("Grade for student " + name + ": " + grade);
        } else {
            System.out.println("Student " + name + " not found");
        }
    }

    public static void main(String[] args) {
        StudentGradeManager gradeManager = new StudentGradeManager();
        Scanner scanner = new Scanner(System.in);

        try {
            // Example usage
            gradeManager.addStudent("Alice", 85);
            gradeManager.addStudent("Bob", 90);

            // Display grades
            gradeManager.displayGrade("Alice");
            gradeManager.displayGrade("Bob");

            // Remove a student
            gradeManager.removeStudent("Alice");

            // Display grades after removal
            gradeManager.displayGrade("Alice");
            gradeManager.displayGrade("Bob");

            // Uncomment the following lines to test invalid inputs
            /*
            gradeManager.displayGrade("Charlie");
            gradeManager.removeStudent("Charlie");
            gradeManager.addStudent("David", -5);
            */
        } finally {
            scanner.close();
        }
    }
}

