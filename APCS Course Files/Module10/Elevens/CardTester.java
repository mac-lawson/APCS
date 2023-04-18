/**
 * This is a class that tests the Card class.
 *
 *  Mac Lawson
 *  4/17/23
 *  */

public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
  Card one = new Card("3", "Hearts", 3);
  Card two = new Card("2", "Spades",3);
  Card three = new Card("3", "Hearts", 3);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1:  ****");
      System.out.println("  rank: " + one.rank());
      System.out.println("  suit: " + one.suit());
      System.out.println("  pointValue: " + one.pointValue());
      System.out.println("  toString: " + one.toString());
      System.out.println();

      // Test card 2


      System.out.println("**** Tests Card 2: ****");
      System.out.println("  rank: " + two.rank());
      System.out.println("  suit: " + two.suit());
      System.out.println("  pointValue: " + two.pointValue());
      System.out.println("  toString: " + two.toString());
      System.out.println();

      // Test card 3
      Card aceHearts = new Card("ace", "hearts", 1);

      System.out.println("**** Tests Card 3: ****");
      System.out.println("  rank: " + three.rank());
      System.out.println("  suit: " + three.suit());
      System.out.println("  pointValue: " + three.pointValue());
      System.out.println("  toString: " + three.toString());
      System.out.println();

      // Test matches() method
	    System.out.println("One matches two?" + one.matches(two));
  System.out.println("One matches three?" + one.matches(three));

   }
}
