
/**
 * Annual Weather object class
 * 
 * @author Mac Lawson
 * 11/18/22
 */

public class CityWeatherV1 {
    // private instance variables - three arrays
    private static String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };     //complete initialization of months array
    private static double [] temperature ={58.4, 60.0,64.7,68.9,74.8,79.7,81.7,81.5,79.9,74.0,67.0,60.8};     //complete initialization of temperatures array
    private static double [] precipitation ={3.1,2.7,3.8,2.5,3.3, 5.7,5.2,6.1,6.6,4.5,3.0,2.7};     //complete initialization of precipitation array
    private static String tUnit = "f";
    private static String mUnit = "i";
    private static Double finalT;
    private static Double finalM;

    // constructor with parameters
    public CityWeatherV1(String tempUnit, String measureUnit) {
        tUnit = tempUnit;
        mUnit = measureUnit;
    }

    // setters and getters for each private instance variable

    // method to calculate the average of temperature
    public static Double average() {
        Double avg = 0.0;
        Double holder = 0.0;
        Double temp = 0.0;
        Double finalVal = 0.0;
        for(int i = 0; i < temperature.length; i++) {
            holder = temperature[i];
            avg = (avg + holder);
        }
        finalVal = avg / temperature.length;
        return(finalVal);
       }

    // method to calculate total precipitation array
    public static Double total() {
        Double avg = 0.0;
        Double holder = 0.0;
        Double temp = 0.0;
        Double finalVal = 0.0;
        for(int i = 0; i < precipitation.length; i++) {
            holder = precipitation[i];
            avg = (avg + holder);
        }
        return(avg);
       }
 
        
        

    // method to calculate temperature in Celsius (current index of temperature array passed as a parameter) - to be completed in 6.02
    public static Double fToC(Double f) {
        return(((f - 32) * 5)/9);
    }
    
    // method to calculate precipitation in centimeters (current index of precipitation array passed as a parameter) - to be completed in 6.02
    public static Double iToC(Double i) {
        return(i * 2.54);
    }

    private static String city = "Daytona Beach";  //choose a city from the table provided
    private static String state = "Florida";  //choose a city from the table provided


    private static String tempLabel = "F";    //initialize to F
    private static String precipLabel = "in."; //initialize to in
    



    
    public static void printResult() {

        System.out.println();
        System.out.printf("           Weather Data");
        System.out.printf("      Location: " + city +", " + state);
        System.out.printf("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();
        System.out.printf("***************************************************");
        for( int index = 0; index < temperature.length; index++)
        {
            
            System.out.printf(month[index] + "\t\t" + temperature[index] + "\t\t" + precipitation[index] + "\n");
        }
        if(tUnit.contains("c") && mUnit.contains("c") ) {finalT = fToC(average()); finalM = iToC(total());}
        else if(tUnit.contains("c") && mUnit.contains("i") ) {finalT = fToC(average()); finalM = total();}
        else if(tUnit.contains("f") && mUnit.contains("c") ) {finalT = average(); finalM = iToC(total());}

        else{
            finalT = average();
            finalM = total();
        }

        System.out.printf("Average: " + finalT + "\tTotal: " + finalM);

    
    }    

}
