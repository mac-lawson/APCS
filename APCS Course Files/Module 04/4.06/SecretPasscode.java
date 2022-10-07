/**
 * Randomly generate passwords.
 *
 * @author Mac Lawson
 * @date 9/30/22
 * 
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;
import java.util.Scanner;


public class SecretPasscode
{
 //generates a random letter, lowercase or uppercase 
  /**
   * @author Mac Lawson
   * @return a random letter, uppercase or lowercase
   */
  public static char ranLetter() {
        Random r = new Random();
        Integer sel = (int)(Math.random() * 10);
        char retValue = 'a';

        if( sel <= 5) {
         retValue =  (char)(r.nextInt(26) + 'a');
        }
        else {
          retValue = (char)(r.nextInt(26) + 'A'); 
        }

        return retValue;
  }

  public static int ranNumber() {
        Integer random = (int)(Math.random() * 10);
        return random;
  }

   public static String genPassword(Integer length) throws IOException {
        String password = "";

        for(int pwCount = 0; pwCount < length; pwCount++) {
                Integer randomSelector = ((int)(Math.random() * 10));
                        if(randomSelector <= 5){
                                password += ranLetter();
                        }
                        else{
                                password += ranNumber();
                        }          
        }
        return password;
   }





    public static void main(String [] args) throws IOException
    {
        PrintWriter outFile = new PrintWriter(new File("passwords.txt"));
        Scanner sys = new Scanner(System.in);
        Scanner read = new Scanner(new File("passwords.txt"));

        int numberOf = 0;
        boolean up = false;
        System.out.println("PASSWORD GENERATOR");
        System.out.println("***********************");        
        while(!up) {

                System.out.println();
                System.out.println("Number of chars: \t");
                numberOf = Integer.parseInt(sys.nextLine());

                if (numberOf >= 6) {
                        outFile.println(genPassword(numberOf));
                        for(int i = 0; i <1; i++) {
                                System.out.println("More?");
                                String yN = sys.nextLine();
                                if(yN.contains("n")) {
                                        outFile.close();
                                        System.out.println("Here are your passwords: ");
                                        while(read.hasNext()) {
                                                System.out.println(read.next());
                                        }
                                        up = true;


                                }
                                else {
                                        System.out.println("More!");
                                }
                        }
                }
                else{System.out.println("Invalid, must be 6 or higher");}




        }

  }//end main


}//end class


