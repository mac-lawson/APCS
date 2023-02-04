/**
 * Author: Mac Lawson
 * Date: 1/6/23
 * Purpose: tester class for hurricane.java
 */
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class HurricaneTester
{
    public static void main(String[] args) throws IOException
    {
        // Read data from text file and put in an array
        File fileName = new File("hurricanedata.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;
        
        // Count number of lines in text file
        while (inFile.hasNextLine() )
        {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();
        
        // Initialize arrays based on lines counted in text file
        int[] years = new int[numValues];
        String[] months = new String[numValues];
        int[] pressures = new int[numValues];
        double[] windSpeeds = new double[numValues];
        String[] names = new String[numValues];
        int[] categories = new int[numValues];
        
        // Read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while(inFile.hasNext() )
        {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            names[index] = inFile.next();
                    
            // Convert wind speed from knots to mph
            windSpeeds[index] = windSpeeds[index] / 0.868976;
        
            // Determine category of hurricane using Saffir-Simpson Hurricane Wind Scale
            if (windSpeeds[index] < 74)
            {
                categories[index] = 1;
            }
            else if (windSpeeds[index] < 96)
            {
                categories[index] = 2;
            }
            else if (windSpeeds[index] < 111)
            {
                categories[index] = 3;
            }
            else if (windSpeeds[index] < 129)
            {
                categories[index] = 4;
            }
            else if (windSpeeds[index] < 156)
            {
                categories[index] = 5;
            }
        
            index++;
        }
        inFile.close();

        
        // Create an ArrayList of Hurricane objects using the data
        ArrayList<Hurricane> hurricanes = new ArrayList<>();
        for (int i = 0; i < numValues; i++)
        {
            hurricanes.add(new Hurricane(years[i], names[i], months[i], categories[i], pressures[i], windSpeeds[i]));
        }
        
        // Prompt user for range of years
        Scanner in = new Scanner(System.in);
        System.out.print("Enter start year: ");
        int startYear = in.nextInt();
        System.out.print("Enter end year: ");
        int endYear = in.nextInt();
        // Calculate averages for category, wind speed, and pressure for the given year range
        int numStorms = 0;
        int sumCategory = 0;
        double sumWindSpeed = 0.0;
        int sumPressure = 0;
        int minCategory = Integer.MAX_VALUE;
        double minWindSpeed = Double.MAX_VALUE;
        int minPressure = Integer.MAX_VALUE;
        int maxCategory = Integer.MIN_VALUE;
        double maxWindSpeed = Double.MIN_VALUE;
        int maxPressure = Integer.MIN_VALUE;
        int[] numCategory = new int[6];
        for (Hurricane h : hurricanes)
        {
            if (h.getYear() >= startYear && h.getYear() <= endYear)
            {
                numCategory[h.getCat()]++;
                numStorms++;
                sumCategory += h.getCat();
                sumWindSpeed += h.getWindspeed();
                sumPressure += h.getPressure();
                minCategory = Math.min(minCategory, h.getCat());
                minWindSpeed = Math.min(minWindSpeed, h.getWindspeed());
                minPressure = Math.min(minPressure, h.getPressure());
                maxCategory = Math.max(maxCategory, h.getCat());
                maxWindSpeed = Math.max(maxWindSpeed, h.getWindspeed());
                maxPressure = Math.max(maxPressure, h.getPressure());
            }
        }
        double avgCategory = (double) sumCategory / numStorms;
        double avgWindSpeed = sumWindSpeed / numStorms;
        double avgPressure = (double) sumPressure / numStorms;
        
        // Print results in user-friendly format
        System.out.println("Year            Hurricane Name          Category           Wind Speed (mph)           Pressure (mb)");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        for (Hurricane h : hurricanes)
        {
            if (h.getYear() >= startYear && h.getYear() <= endYear)
            {
                System.out.println(h);
            }
        }
        
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        String AVERAGE = "AVERAGE";
        String MINIMUM = "MINIMUM";
        String MAXIMUM = "MAXIMUM";
        System.out.printf("%s\t\t %.2f\t\t %.2f\t\t %.1f\n", AVERAGE, avgCategory, avgWindSpeed, avgPressure);
        System.out.println();
        System.out.printf("%s\t\t %d\t\t %.2f\t\t %d\n", MINIMUM, minCategory, minWindSpeed, minPressure);
        System.out.println();
        System.out.printf("%s\t\t %d\t\t %.2f\t\t %d\n", MAXIMUM, maxCategory, maxWindSpeed, maxPressure);
        System.out.println();
        System.out.println("Number of category 1 hurricanes: " + numCategory[1]);
        System.out.println("Number of category 2 hurricanes: " + numCategory[2]);
        System.out.println("Number of category 3 hurricanes: " + numCategory[3]);
        System.out.println("Number of category 4 hurricanes: " + numCategory[4]);
        System.out.println("Number of category 5 hurricanes: " + numCategory[5]);


    }
}
