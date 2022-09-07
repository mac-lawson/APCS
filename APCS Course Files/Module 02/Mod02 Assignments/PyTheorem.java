/**
 * 
 * Currency Converter
 * {@summary} Date: 9 - 1 - 22
 * {@summary} Purpose: Calculate the hyp. of two triangles
 * @author Mac Lawson
 */
public class PyTheorem {
    public static void main(String[ ] args) {
        //define local variables
        int min = 5;
        int max = 23;
        Integer side1A = (int) (min + (max - min) * Math.random());
        Integer side2A = (int) (min + (max - min) * Math.random());
        Double hypotenuse1 = Math.sqrt(Math.pow((double) side1A, 2) + Math.pow((double) side2A, 2));
        Integer side1B = (int) (min + (max - min) * Math.random());
        Integer side2B = (int) (min + (max - min) * Math.random());
        Double hypotenuse2 = Math.sqrt(Math.pow((double) side1B, 2) + Math.pow((double) side2B, 2));

        //display data

        System.out.println("Triangle 1 \t" +  "Side 1: " + side1A + "\t" + "Side 2: " + side2A + "\t" + "Hypotenuse: " + hypotenuse1 );
        System.out.println("Triangle 2 \t" +  "Side 1: " + side1B + "\t" + "Side 2: " + side2B + "\t" + "Hypotenuse: " + hypotenuse2 );

        
    }
}
