import javax.crypto.MacSpi;

/**
 * 
 * @author Mac Lawson
 * @version 10-5-22
 * 
 * Math Trick
 *
 */

public class MathTrick {
	
	/**
	 * 
	 ******  DO NOT USE ARRAYS OR CONVERT NUMBERS TO STRING UNTIL STEP 7 ******
	 *
	 */
	
	// Step 1) Creates a random 3 digit (100-999) number where the first and last digit differ by more than one
	// Hint: Use Math.random() to create number in the correct range
	// 		 use modulus to find the last digit and divide by 100 for the first digit.
	//		 calculate the difference, which method can you use so it doesn't matter how the numbers are subtract?
	// 		 while the difference of the digits is less than 2, create a new random number and try again

	public static int getRandomNum() 
	{	int num = 0;
		int firstDigit = 0;
		int middleDigit = 0;
		int lastDigit = 0;
		boolean keepRunning = true;
		while(keepRunning) {
			firstDigit = (int)(Math.random() * 10);
			middleDigit = (int)(Math.random() * 10);
			lastDigit = (int)(Math.random() * 10);

			if((firstDigit - lastDigit) < 7 ) {keepRunning = true;}
			if((lastDigit) == 0) {keepRunning = true;}
			if((lastDigit) == 0) {keepRunning = true;}
			if((middleDigit) == 0) {keepRunning = true;}


			if((firstDigit - lastDigit) == 4) {break;}
		}

		String intString1 = String.valueOf(firstDigit);
		String intString2 = String.valueOf(middleDigit);
		String intString3 = String.valueOf(lastDigit);
		String fullString = intString1 += intString2 += intString3;

		num = Integer.parseInt(fullString);
		

		return num;
	}

	// Step 2 & 4) reverse the digits of a number
	// Hint: to reverse a number without converting it to a String:
	//		create a new variable to store the reversed number
	//		while the original number > 0
	//		for each digit, multiply the new variable by 10 (to make room for the new digit) 
	//		then add the last digit (remember modulus?) to the new variable
	//		divide the original number by 10 to get rid of the last digit
	//	Ex: 584--> (0 x 10) + 4 = 4 ; 58--> (4 x 10) + 8 = 48; 5-->(48 x 10) + 5 = 485

	public static int reverseDigits (int num, int rev) {
		
		
		while(num != 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num /= 10;
		 }
		 
		 return rev;
	}
	
	// Step 7) replace characters in a String according to the chart
	// Hint: Loop through the String and "replace" the numbers with the corresponding letter
	public static String replaceLtr(String str)
	{
		str = str.replace('0','Y');str = str.replace('1','M');str = str.replace('2','P');str = str.replace('3','L');str = str.replace('4','R');str = str.replace('5','O');str = str.replace('6','F');str = str.replace('7','A');str = str.replace('8','I');str = str.replace('9','B');
			
		return str;
	}
	
	// Step 8) reverse the letters in a String
	// Hint: start with an empty String variable 
	//		 loop through the original word   
	//		 add one letter at time to the new variable using concatenation and .substring()
	public static String reverseString(String str) {
		StringBuilder sb=new StringBuilder(str);  
		sb.reverse();  
		return sb.toString();  	
	}

	public static Integer subSmallFromLarge(int int1, int int2) {
		Integer returnValue;
		if((int1 < int2)){
			returnValue = int2 - int1;
		}
		else {
			returnValue = int1 - int2;
		}
		return returnValue;
	}
		
	public static void main(String[] args) 
	{
//		1.	Generate a random 3-digit number so that the first and third digits differ by more than one.
		Integer dig1 = getRandomNum();
		System.out.println("THE STARTING NUMBER: " + dig1);

//		2.	Now reverse the digits to form a second number.
		Integer reved = reverseDigits(dig1, 0);
		System.out.println("THE REVERSED NUMBER: " + reved);

//		3.	Subtract the smaller number from the larger one.
		Integer rev2 = subSmallFromLarge(dig1, reved);
		System.out.println("THE DIFFERENCE IS: " + rev2);
//		4.	Now reverse the digits in the answer you got in step 3 and add it to that number.
		Integer rev3 = reverseDigits(rev2, 0);
		Integer rev4 = rev2 + rev3;
		System.out.println("THE REVERSED NUMBER ADDED TO THE DIFFERENCE IS : " + rev4);
//		5.	Multiply by one million.
		Integer rev5 = rev4 * 1000000;
		System.out.println("THE NUMBER X 1,000,000 IS: " + rev5);

//		6.	Subtract 733,361,573.
		Integer rev6 = (rev5 - 733361573);
		System.out.println("THE NUMBER SUBTRACTED IS (AND CONVERTED TO STRING): " +rev6);


//		7.	Convert the number to a string in order to replace the numbers with letters.
// 				Ex: String str = String.valueOf(myNumber);
		String str1 = String.valueOf(rev6);
		// System.out.println(str1);
//			Then, replace each of the digits in your answer, with the letter it corresponds to using the table in the instructions.
		String final1 = replaceLtr(str1);
		System.out.println("THE REPLACED STRING IS: " +final1);

		
//		8.	Now reverse the letters in the string to read your message backward.
		System.out.println("THE REVERSED NUMBER IS: " + reverseString(final1));
	} // end main
} // end class
