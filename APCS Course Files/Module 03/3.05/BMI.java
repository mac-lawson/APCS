/**
 * @author Mac Lawson
 * Date: 9/16/22
 * A program to calculate BMI
 */
import java.util.Scanner;
public class BMI {
    public static void main(String [] args) {
        String weightString;
        Scanner input = new Scanner(System.in);

        System.out.println("Name (first and last): ");
        String firstName = input.next();
        String lastName = input.nextLine();

        System.out.println("Height (5 10): ");
        Double heightFeet = Double.parseDouble(input.next());
        Double heightFeetMeters = heightFeet * 0.3048;
        Double heightInches = Double.parseDouble(input.nextLine());
        Double heightInchesMeters = heightInches * 0.0254;

        Double heightInMeters = heightFeetMeters + heightInchesMeters;

        System.out.println("Weight (lbs): ");
        Double weightLbs = Double.parseDouble(input.next());
        Double weightKg = weightLbs * 0.45359237;
        
        Double bmi = (weightKg / (Math.pow(heightInMeters, 2)));
        Double simplifiedBMI = (int)(10*bmi)/10.0;

        if (simplifiedBMI < 18.5) {
            weightString = "Underweight";
        }
        else if (simplifiedBMI > 18.5 && simplifiedBMI < 24.9) {
            weightString = "Normal";
        }
        else if (simplifiedBMI > 25.0 && simplifiedBMI < 29.9) {
            weightString = "Overweight";
            
        }
        else {
            weightString = "Obese";
        }

        System.out.println(" \nBody Mass Index Calculator: ");
        System.out.println("Name: " + (firstName) + " " + (lastName));
        System.out.println("Weight: " + (int)(10*weightLbs)/10.0);
        System.out.println("Height: " + (heightInMeters));
        System.out.println("BMI: " + simplifiedBMI);
        System.out.println("Cat: " + (weightString));




    }

    
}
