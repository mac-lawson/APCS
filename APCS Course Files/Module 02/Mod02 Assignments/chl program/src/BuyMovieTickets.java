/**
 * Name: Mac Lawson
 * Date: 9/6/22
 * Java class to buy movie tickets and product and receipt
 */
import java.util.Scanner;
public class BuyMovieTickets {
     

    
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to BuyMovieTickets");

        System.out.print("Customer Name: ");
        String firstName = input.next();
        String lastName = input.nextLine();
        String firstInitial = firstName.substring(0, 1); 
        System.out.print("\n");    
        
        System.out.print("Today's Date (mm/dd/yyyy): ");
        String purchaseDate = input.next();
        System.out.print("\n");  

        System.out.print("Movie Selection: ");
        String movieSelected = input.next();
        System.out.print("\n"); 
        
        System.out.print("Ticket Ammount: ");
        String ticketsPurchased = input.next();
        Integer totalTickets = Integer.parseInt(ticketsPurchased);
        System.out.print("\n");  

        System.out.print("Price Per Ticket: ");
        String ticketPrice = input.next();
        Integer priceOfTickets = Integer.parseInt(ticketPrice);
        Double totalPrice = (double) priceOfTickets * (double) totalTickets;
        System.out.print("\n");  

        System.out.print("Credit/Debit Card Number (#####-###-####): ");
        String cardNumber = input.next();
        String redactedCardNumber = cardNumber.substring(10,14);
        System.out.print("\n"); 


        System.out.print("Credit/Debit Card Pin (#####): ");
        String cardPin = input.next();
        System.out.print("\n"); 
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        
        receipt();


        System.out.println("Summary of your Order: ");

        System.out.println("\tDate: " + (purchaseDate));

        System.out.println("\tName: " + (firstInitial) + ". " + (lastName));

        System.out.println("\tBanking Information : " + "#####-###-" + (redactedCardNumber));

        System.out.println("\tMovie: " + (movieSelected));

        System.out.println("\tTicket Number: " + (totalTickets));

        System.out.println("\tTicket Price: " + (ticketPrice));


        System.out.println("\tAMOUNT DUE: " + (totalPrice));






        
    }
    
    public static void receipt() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~#Your Order#~~~~~~~~~~~~~~~~~~~~~");
    }
}
