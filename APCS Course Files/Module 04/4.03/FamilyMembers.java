import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 * @author Mac Lawson
 * AP Computer Science A
 * 9/26/22
 * A program demonstrating reading text files and comparing their values
 */
public class FamilyMembers
{
    public static void main(String[] args) throws IOException {
        String scan = "";
        File fileName = new File("familyMembers.txt");
        Scanner file = new Scanner(fileName);
        Integer totalFamilies = 0;
        Integer onlyGirlFamilies = 0;
        Integer onlyBoyFamilies = 0;
        Integer bothFamilies = 0;




        String nextLn;

        while (file.hasNext()) {

            totalFamilies ++;
            nextLn = file.next();
            String raw = String.valueOf(nextLn);
            if(raw.contains("BB")) {
                onlyBoyFamilies ++;
            } else if (raw.contains("GG")) {
                onlyGirlFamilies ++;
            } else {
                bothFamilies ++;
            }



        }
        file.close();

        System.out.println("Total Families " + (totalFamilies));
        System.out.println("Number of families with: ");
        System.out.println("Two boys represents " + ((double)(onlyBoyFamilies)/(double)(totalFamilies)) * 100 + "%");
        System.out.println("Two girls represents " + ((double)(onlyGirlFamilies)/(double)(totalFamilies)) * 100 + "%");
        System.out.println("One boy and one girl represents " + ((double)(bothFamilies)/(double)(totalFamilies)) * 100 + "%");





    }
}
