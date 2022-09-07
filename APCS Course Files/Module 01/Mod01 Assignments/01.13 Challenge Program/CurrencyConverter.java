/**
 * 
 * Currency Converter
 * {@summary} Date: 8 - 26 - 22
 * {@summary} Purpose: To calculate currency conversions and money spent along with remaining funds on a trip. 
 * @author Mac Lawson
 */
import java.lang.Math;
public class CurrencyConverter
{
    public static void main(String [ ] args)
    {   
        double startingUSDollars = 5000.00;		// US Dollars.
        double pesosSpent = 489;            // Mexican pesos spent.
        double pesoExchangeRate = 19.91;    // US Dollars to Pesos.
        double yensSpent = 98000.4;		// Yens spent.
        double yenExchangeRate = 137.01;	  // exchange rate of US Dollars to Yen.
        double eurosSpent = 624.95;			// Euros spent in Europe.
        double euroExchangeRate =  1.0527;	// US Dollars to Euros.
        double dollarsSpentInMexico = pesosSpent / pesoExchangeRate;      //dollars spent in Mexico.
        double dollarsSpentInJapan = yensSpent / yenExchangeRate;	// dollars spent in Japan.
        double dollarsSpentInEurope = eurosSpent / euroExchangeRate;		//dollars spent in Europe.
        double remainingUsDollars = startingUSDollars - dollarsSpentInMexico - dollarsSpentInJapan - dollarsSpentInEurope;        // local variable for US Dollars remaining.
        
        // Info
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Mexican pesos
        System.out.println("Starting USD:   " + startingUSDollars);
        System.out.println("USD spent in Mexico:   " + dollarsSpentInMexico);

        // Japanese yen
        System.out.println("USD spent in Japan:   " + dollarsSpentInJapan);

        // Euros
        System.out.println("USD spent in Europe:   " + dollarsSpentInEurope);


        //print output to the screen
        System.out.println("Remaining USD:   " + remainingUsDollars);




 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenirs!");
		System.out.println("USD");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Souvenir #1
		int costItem1 = 9;  						//cost 
		int budget1 = 100;   						//budget 
		int totalItem1 = budget1 / costItem1; 		//items
		double fundsRemaining1 = budget1 % totalItem1;  //remaining

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItem1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);

		//Souvenir #2
		double costItem2 = 45;  						//cost 
		int budget2 = 1000;   							//budget 
		int totalItem2 = (int) (budget2 / costItem2); 	//items
		double fundsRemaining2 = budget2 % totalItem2;  	//items

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItem2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } 
}