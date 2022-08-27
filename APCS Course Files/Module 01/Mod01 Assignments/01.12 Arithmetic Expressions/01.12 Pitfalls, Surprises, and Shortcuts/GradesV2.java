/**
 * 
 * Grade Calculator
 * {@summary} Date: 8 - 23 - 22
 * {@summary} Purpose: To calculate information about grades including average score, total points, etc.
 * @author Mac Lawson
 */
public class GradesV2 {

    public static void main(String[ ] args)
    {
        //local variables       
        int totalTests = 0;            
        int testGrade = 0;           
        int totalPoints = 0;          
        double averageScore = 0.0;         
             
                
        //Test Number: 1
        testGrade = 100;         //grade 
        totalPoints += testGrade;  //add test grade to total points
        totalTests++;             //number of tests increased by one
        averageScore = ((double)totalPoints / (double)totalTests);  //calculate the average by dividing the totalpoints by the numTests
        System.out.print("\t\tNumber of Tests: " + totalTests);
        System.out.print("\t\tNew Test Grade: " + testGrade);
        System.out.print("\t\tTotal Points: " + totalPoints);
        System.out.println("\t\tAverage Score: " + averageScore);
        
        //Test Number: 2
        testGrade = 80;         //grade 
        totalPoints += testGrade;  //add test grade to total points
        totalTests++;             //number of tests increased by one
        averageScore = ((double)totalPoints / (double)totalTests);  //calculate the average by dividing the totalpoints by the numTests
        System.out.print("\t\tNumber of Tests: " + totalTests);
        System.out.print("\t\tNew Test Grade: " + testGrade);
        System.out.print("\t\tTotal Points: " + totalPoints);
        System.out.println("\t\tAverage Score: " + averageScore); 
        
        //Test Number: 3
        testGrade = 91;         //grade 
        totalPoints += testGrade;  //add test grade to total points
        totalTests++;             //number of tests increased by one
        averageScore = ((double)totalPoints / (double)totalTests);  //calculate the average by dividing the totalpoints by the numTests
        System.out.print("\t\tNumber of Tests: " + totalTests);
        System.out.print("\t\tNew Test Grade: " + testGrade);
        System.out.print("\t\tTotal Points: " + totalPoints);
        System.out.println("\t\tAverage Score: " + averageScore);

        //Test Number: 4
        testGrade = 67;         //grade 
        totalPoints += testGrade;  //add test grade to total points
        totalTests++;             //number of tests increased by one
        averageScore = ((double)totalPoints / (double)totalTests);  //calculate the average by dividing the totalpoints by the numTests
        System.out.print("\t\tNumber of Tests: " + totalTests);
        System.out.print("\t\tNew Test Grade: " + testGrade);
        System.out.print("\t\tTotal Points: " + totalPoints);
        System.out.println("\t\tAverage Score: " + averageScore);        
    }
}

