/**
 * @author Mac Lawson
 * AP Computer Science A
 * 11/11/22
 * Program to demonstrate class implementation
 */
public class StudentTesterV3 {
    
    public static void main(String[ ] args){
        calculate calc=new calculate();

        System.out.println(" \t \t \t \t   Grades");
        System.out.println("____________________________________________________________________________________");
        System.out.printf("Grade 1: 90.0\t");
        System.out.printf("Grade 2: 86.0\t");

        System.out.printf("Average: " + calc.average(90.0, 86.0) + "\t");
        System.out.println("Difference: " + calc.differance(90.0, 86.0));



    }

    
   
}