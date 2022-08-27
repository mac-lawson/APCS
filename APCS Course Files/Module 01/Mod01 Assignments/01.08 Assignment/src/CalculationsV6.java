
/**
 * 
 * @author Mac Lawson
 * {@summary} Date: 8/16/22
 * {@summary} Purpose: To display different arithmetic operations using Java!
 */
public class CalculationsV6
{
    public static void main(String[ ] args)
    {
        // integer variables
        int iNum1 = 34;
        int iNum2 = 9;
        int iNum3 = 1;
        int iNum4 = 56;
        int iNum5 = 65;

        // double variables
        double dNum1 = 45.78;
        double dNum2 = 4.16;
        double dNum3 = 34.98;
        double dNum4 = 21.87;

        System.out.println("Addition");
        System.out.println( iNum1 + " + " + iNum2 + " = " + (iNum1+iNum2) );
        System.out.println( dNum1 + " + " + dNum2 + " + " + dNum3 + " = " + (dNum1+dNum2+dNum3) );
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println( iNum3 +" - " + iNum3 + " - " + iNum1 + " = " + (iNum3-iNum3-iNum1) );
        System.out.println( dNum1 + " - " + dNum4 + " = " + (dNum1-dNum4) );
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println( iNum1 + " * " + iNum2 + " = " + (iNum1*iNum2) ); 
        System.out.println(dNum2 + " * " + dNum3 + " * " + dNum3 + " = " + (dNum2*dNum3*dNum3) );
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println( iNum4 + " / " + iNum1 + " = " + (iNum4/iNum1) );
        System.out.println( dNum1 + " / " + dNum3 + " = " + (dNum1/dNum3) );
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println( iNum3 + " % " + iNum2 + " = " + (iNum3%iNum2) );
        System.out.println( dNum1 + " % " + dNum2 + " = " + (dNum1%dNum2) );
        System.out.println();

        // More int Equations!
        System.out.println( iNum2 + " / " + iNum4 + " - " + iNum5 + "= " + (iNum2/iNum4-iNum5) );
        System.out.println( iNum5 +" + " + iNum1 + " / " + iNum4 + " = " + (iNum5+iNum1/iNum4) );
        System.out.println();

        //More double Equations!
        System.out.println( dNum4 + " % " + dNum4 + " + " + dNum4 + " = " + (dNum4%dNum4+dNum4) );
        System.out.println( dNum4 + " / " + dNum3 + " + " + dNum3 + " = " + (dNum4/dNum3+dNum3) );  
        System.out.println();
        
               
    } 
} 