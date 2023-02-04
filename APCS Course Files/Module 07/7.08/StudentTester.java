
/**
 * Tester class for student. 
 *
 * @author Mac lawson
 * @version 1/16/23
 */
import java.util.ArrayList;
public class StudentTester
{
    
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("John Doe", new int[] {90, 85, 80, 75, 70}));
        students.add(new Student("Jane Smith", new int[] {95, 88, 92, 72, 85}));
        students.add(new Student("Bob Johnson", new int[] {78, 72, 85, 90, 80}));
        students.add(new Student("Emily Williams", new int[] {90, 92, 95, 85, 88}));
        students.add(new Student("Michael Brown", new int[] {80, 75, 70, 80, 85}));
        printTable(students);
        // insert code
        
        replaceName(students, "John Doe", "Billy McDonald");
        replaceQuizGrade(students, "Emily Williams", 2, 100);
        replaceStudent(students, "Bob Johnson", "William Roberts", new int[] {90, 76, 89, 47, 100});
        insertStudent(students, "Jane Smith", "Joseph Mother", new int[] {100, 100, 100, 57, 49});
        deleteStudent(students, "Michael Brown");
        
        System.out.println("\n Deleted JD, replaced EW's 2nd Grade to a 100, replaced BJ with WR, inserted Joeseph Mother Before JS, deleted Michael Brown \n");
        printTable(students);

    }
    public static void printTable(ArrayList<Student> students) {
        
        if (students == null || students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        System.out.println("Name\t\tQuiz Scores");
        System.out.println("----------------------------------\n");

        for (Student student : students) {
            if (student != null) {
            System.out.print(student.getName());
            System.out.print("  ");
            System.out.print(student.getQuizScore(0));
            System.out.print("  ");
            System.out.print(student.getQuizScore(1));
            System.out.print("  ");
            System.out.print(student.getQuizScore(2));  
            System.out.print("  ");
            System.out.print(student.getQuizScore(3)); 
            System.out.print("  ");
            System.out.print(student.getQuizScore(4));
            System.out.print("  ");
            System.out.println();
        }
        }
    }

    public static void replaceName(ArrayList<Student> students, String currentName, String newName) {
        if (students == null || currentName == null || newName == null) {
            return;
        }
        for (Student student : students) {
            if (student != null && student.getName().equals(currentName)) {
                student.setName(newName);
                break;
            }
        }
    }

    public static void replaceQuizGrade(ArrayList<Student> students, String studentName, int quizNumber, int newScore) {
        if (students == null || studentName == null) {
            return;
        }
        for (Student student : students) {
            if (student != null && student.getName().equals(studentName)) {
                student.setQuizScore(quizNumber, newScore);
                break;
            }
        }
    }

    public static void replaceStudent(ArrayList<Student> students, String currentName, String newName, int[] newQuizScores) {
        if (students == null || currentName == null || newName == null || newQuizScores == null) {
            return;
        }
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) != null && students.get(i).getName().equals(currentName)) {
                students.set(i, new Student(newName, newQuizScores));
                break;
            }
        }
    }

    public static void insertStudent(ArrayList<Student> students, String currentName, String newName, int[] newQuizScores) {
        if (students == null || currentName == null || newName == null || newQuizScores == null) {
            return;
        }
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) != null && students.get(i).getName().equals(currentName)) {
                students.add(i, new Student(newName, newQuizScores));
                break;
            }
        }
    }

    public static void deleteStudent(ArrayList<Student> students, String studentName) {
        if (students == null || studentName == null) {
            return;
        }
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) != null && students.get(i).getName().equals(studentName)) {
                students.remove(i);
                break;
            }
        }
    }

}
    
