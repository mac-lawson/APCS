/**
 * Annual Weather client class
 * 
 * @author Mac Lawson
 * 11/18/22
 */
import java.util.Scanner;
public class CityWeatherTesterV1
{

     
        
    public static void print(String x) {
        System.out.println(x);
    }
   
    public static CityWeatherV1 city; 
    public static void main (String [ ] args)
    {

        //Declare and initialize variables
        Scanner in = new Scanner(System.in);  //will be used in 6.02
        System.out.println("Unit for temperature? (f/c): ");
        String tmpUnit = in.next();
        System.out.println("Unit for measurement? (i/c): ");
        String msreUnit = in.next();


        CityWeatherV1 city2 = new CityWeatherV1(tmpUnit, msreUnit);

        city2.printResult();
        

    

        
    }//end main
}//end class

