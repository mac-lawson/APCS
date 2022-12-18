
/**
 * Tester of grades.java
 *
 * Mac Lawson
 * 12/1/22
 */
public class GradesTester
{



    public static void main(String args[])
    {
            Grades line1 = new Grades(45, 90, "Matt");
            Grades line2 = new Grades(78, 88, "Sarah");
            Grades line3 = new Grades(93, 99, "Kelly");
            Grades line4 = new Grades(94, 86, "David");
            Grades line5 = new Grades(92, 89, "Joe");
        String[] set1 = {line1.getName(),String.valueOf(line1.getGrade1()), String.valueOf(line1.getGrade2()), String.valueOf(line1.differance()),String.valueOf(line1.average())  };
        String[] set2 = {line2.getName(),String.valueOf(line2.getGrade1()), String.valueOf(line2.getGrade2()), String.valueOf(line2.differance()),String.valueOf(line2.average())  };
        String[] set3 = {line3.getName(),String.valueOf(line3.getGrade1()), String.valueOf(line3.getGrade2()), String.valueOf(line3.differance()),String.valueOf(line3.average())  };
        String[] set4 = {line4.getName(),String.valueOf(line4.getGrade1()), String.valueOf(line4.getGrade2()), String.valueOf(line4.differance()),String.valueOf(line4.average())  };
        String[] set5 = {line5.getName(),String.valueOf(line5.getGrade1()), String.valueOf(line5.getGrade2()), String.valueOf(line5.differance()),String.valueOf(line5.average())  };

        
        
        /**
         * Prints the results
         */
        System.out.println("\t\tQuiz Results");
        System.out.printf("%s %13s %13s %13s %13s %n", "Student Name", "Quiz 1 Grade", "Quiz 2 Grade", "Differance", "Average");
        System.out.println("==============================================================================");
        for(String x: set1) {
            System.out.printf(x + "\t\t");
        }
        System.out.println("");
        for(String x: set2) {
            System.out.printf(x + "\t\t");
        }
        System.out.println("");
        for(String x: set3) {
            System.out.printf(x + "\t\t");
        }
        System.out.println("");
        for(String x: set4) {
            System.out.printf(x + "\t\t");
        }
        System.out.println("");
        for(String x: set5) {
            System.out.printf(x + "\t\t");
        }
    }
}
