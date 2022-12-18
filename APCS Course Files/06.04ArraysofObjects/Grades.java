
/**
 * Calculates student grades
 *
 * @author Mac Lawson
 * 12/1/22
 */
public class Grades
{
    // instance variables
    private int grade1;
    private int grade2;
    private String name;
    private int diff;
    private int average;

    /**
     * Constructor for objects of class Grades
     */
    public Grades(int quiz1, int quiz2, String name1)
    {
        // initialise instance variables
        grade1 = quiz1;
        grade2 = quiz2;
        name = name1;
    }
    /**
     * Returns the differnace between the two grades
     */

    public Double differance()
    {
        return Math.abs(Double.valueOf(grade1)-Double.valueOf(grade2));
        
    }
    /**
     * Returns the average
     */
    public Double average() {
        return Double.valueOf((grade1 + grade2)/2);
    }
    /**
     * Setter for grade 1
     */
    public static void setGrade1(int grade1) {
        grade1 = grade1;
    }
    /**
     * Setter for grade 2
     */    
    public static void setGrade2(int grade2) {
        grade2 = grade2;
    }
    /**
     * Getter for grade 1
     */     
    public int getGrade1() {
        return grade1;
    }
    /**
     * Getter for grade 2
     */     
    public int getGrade2() {
        return grade2;
    }
    /**
     * Getter for name
     */     
        public String getName() {
        return name;
    }
    /**
     * Setter for name
     */     
    public static void setName(String name) {
        name = name;
    }
    /**
     * Returns string value of the Grades[] array
     */     
    public static String stringValue(Grades[] data) {
        return String.valueOf(data);
    }    
    }


