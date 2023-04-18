/**
 * This is a class that tests the Deck class.
 *
 *  Mac Lawson
 *  4/17/23
 *  */

public class DeckTester
{
   /**
    * The main method in this class checks the Deck operations for consistency.
    * @param args is not usemyDeck.
    */
   public static void main(String[] args)
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
      /* Uncomment blocks of code to test the Deck class */

        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace"};
        String[] suits = {"hearts", "diamonds", "clubs", "spades"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        // create a deck with 10 cards
        Deck deck = new Deck(ranks, suits, values);
        System.out.println("***** Original Deck Methods *****\n");
        System.out.println(deck.toString());

        // test isEmpty and size methods
        System.out.println("isEmpty: " + deck.isEmpty());
        System.out.println("size: " + deck.size());

        // deal a card
        System.out.println("\n***** Deal a Card *****\n");
        Card c = deck.deal();
        System.out.println("deal: " + c.toString());

        // test shuffle method
        System.out.println("\n***** Shuffling *****\n");
        deck.shuffle();
        System.out.println(deck.toString());

      /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */

      // System.out.println("\n**** 52 Card Deck shuffle Tests ****");
      // String[] ranks52 = {"ace"};
      // String[] suits52 = {"spades"};
      // int[] pointValues52 = {1};

      // System.out.println("  The Starting Deck ");

      // System.out.println("  The Deck After Dealing a Card" );

      // System.out.println("  Shuffleing the Deck ");


   }
}
