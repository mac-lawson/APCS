/**
 * Mac Lawson
 * A program to calculate the TDEE of a person!
 * Date: 9/20/22
 * AP Comp Sci A
 */
import java.util.Scanner;
public class TDEE {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Double activityFactor = 0.0;
        Boolean genderMale = false;
        Boolean genderFemale = false;

        System.out.println("Please Enter Your Name: ");
        String personName = input.nextLine();

        System.out.println("Please Enter Your BMR: ");
        Double personBMR = Double.parseDouble(input.nextLine());

        System.out.println("Please Enter Your Gender (M / F): ");
        String personGender = (input.nextLine()); 

        genderMale = personGender.equalsIgnoreCase("M");
        genderFemale = personGender.equalsIgnoreCase("F");


        System.out.println(genderFemale);
        System.out.println(genderMale);

        System.out.println("\n");

        System.out.println("[0] Resting: \t Sleeping, reclining");
        System.out.println("[1] Sedentary: \t Minimal movement, mainly sitting/lying down (e.g., watching TV, reading, etc.)");
        System.out.println("[2] Light: \t Office work, sitting (e.g., walking, laundry, walking on level ground at 2.5 – 3.0 mph)");
        System.out.println("[3] Moderate: \t Office work, sitting Light manual labor (e.g., dancing, cycling, gardening, etc.)");
        System.out.println("[4] Very Active: \t Hard manual labor (e.g., team sports, climbing, agricultural labor, etc.)");
        System.out.println("[5] Extremely Active: \t Heavy manual labor (e.g., full-time athletes, construction workers, etc.)");

        System.out.println("\n");

        System.out.println("Enter the number assigned to your respective activity level (as the letter appears on the prompt): ");
        Integer personActivityLevel = Integer.parseInt(input.next());

        if(genderMale) {
            if(personActivityLevel == 0) {activityFactor = 1.0;}
            if(personActivityLevel == 1) {activityFactor = 1.3;}
            if(personActivityLevel == 2) {activityFactor = 1.6;}
            if(personActivityLevel == 3) {activityFactor = 1.7;}
            if(personActivityLevel == 4) {activityFactor = 2.1;}
            if(personActivityLevel == 5) {activityFactor = 2.4;}
        }
        else{
            if(personActivityLevel == 0) {activityFactor = 1.0;}
            if(personActivityLevel == 1) {activityFactor = 1.3;}
            if(personActivityLevel == 2) {activityFactor = 1.5;}
            if(personActivityLevel == 3) {activityFactor = 1.6;}
            if(personActivityLevel == 4) {activityFactor = 1.9;}
            if(personActivityLevel == 5) {activityFactor = 2.2;}

        }
 
        Double tdee = (personBMR * activityFactor);

        System.out.println("\n");

        System.out.println("Results: ");
        System.out.println("Name: \t" + (personName) + " " + "Gender: \t" + (personGender));
        System.out.println("BMR: \t" + (personBMR));
        System.out.println("Activity Factor: \t" + (activityFactor));
        System.out.println("TDEE: \t" + (tdee) + " calories");






        
    }
}
