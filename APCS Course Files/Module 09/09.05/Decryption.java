import java.util.Scanner;

/*
 * By Mac Lawson
 * Date: 3/9/2023
 * Purpose: Encrypt and decrypt messages using a Caesar shift cipher
 * 
 */
public class Decryption 
{
	//variables
	private final int shiftKey;
	private String encryptedMessage;

	//getters
	public int getShiftKey()
	{
		return shiftKey;
	}

	public String getEncryptedMessage()
	{
		return encryptedMessage;
	}

	//constructor
	Decryption(Scanner in)
	{
		shiftKey = getShiftKey(in);
		encryptedMessage = getMessage(in);
	}

	//other methods

	//get the shift key
	public int getShiftKey(Scanner in)
	{
		String returnString = "";
		System.out.println("Please enter in the number (0-25) by which the message was shifted");

		//get input for shift and handle errors
		int shift = in.nextInt();
		if(shift > 25)
		{
			shift %= 25;
		}
		else if(shift < 0)
		{
			shift = -shift;
			shift %= 25;
		}
		return shift;
	}

	//get the plain text message
	public String getMessage(Scanner in)
	{
		//prompt user
		System.out.println("Please enter the message to be decrypted without using any punctuation");

		//get the message
		in.nextLine();
		String message = in.nextLine();

		return message;
	}

	//generate the cipher alphabet based on the key
	public static String generateAlphabet(String alphabet, int shiftKey)
	{
		//new alphabet for getting values
		String doubleAlphabet = alphabet + alphabet;
		char[] shiftAlphabetCharArray = new char[26];

		//create the new alphabet using the shift
		for(int i = 0; i < 26; i ++)
		{
			shiftAlphabetCharArray[i] = doubleAlphabet.charAt(i + shiftKey);
		}

		String shiftAlphabet = stringFromCharArray(shiftAlphabetCharArray);

		//print out alphabet
		System.out.println("Shifted alphabet:");
		System.out.println(shiftAlphabet);

		return shiftAlphabet;
	}

	//string from char array
	private static String stringFromCharArray(char[] array)
	{
		String returnString = "";
		for(char character : array)
		{
			returnString += character;
		}
		return returnString;
	}

	//decrypt message
	public static String decryptMessage(String normalAlphabet, String shiftedAlphabet, String message, int shiftKey)
	{
		normalAlphabet = reverseShiftAlphabet(normalAlphabet, shiftKey);
		//create message to return
		char[] messageArray = message.toCharArray();
		char[] returnArray = new char[messageArray.length];

		//go through and get the corresponding values from the shifted alphabet
		for(int i = 0; i < returnArray.length; i++)
		{
			//add the character
			try
			{
				returnArray[i] = shiftedAlphabet.charAt(normalAlphabet.indexOf(messageArray[i]));
			}
			catch(java.lang.StringIndexOutOfBoundsException e)
			{
				//I appologize for using try/catch.
			}

		}	
		//create the string to be returned
		String returnString = stringFromCharArray(returnArray);

		//print out
		System.out.println("Decrypted message:");
		System.out.println(returnString);

		return returnString;
	}

	//reverse shift alphabet
	public static String reverseShiftAlphabet(String alphabet, int shiftKey)
	{
		shiftKey = 25 - shiftKey;
		//new alphabet for getting values
		String doubleAlphabet = alphabet + alphabet;
		char[] shiftAlphabetCharArray = new char[26];

		//create the new alphabet using the shift
		for(int i = 0; i < 26; i ++)
		{
			shiftAlphabetCharArray[i] = doubleAlphabet.charAt(i + shiftKey);
		}

		String shiftAlphabet = stringFromCharArray(shiftAlphabetCharArray);

		//print out alphabet
		System.out.println("Shifted alphabet:");
		System.out.println(shiftAlphabet);

		return shiftAlphabet;
	}


}
