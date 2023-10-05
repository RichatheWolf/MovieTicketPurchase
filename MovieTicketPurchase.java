/**
 * Purpose: To display the receipt for a certain online purchase made by a certain customer.
 *
 * @author Richa Limaye
 * @version 10/04/2023
 */

import java.util.Scanner;
import java.lang.Math;

public class MovieTicketPurchase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNumber = (int) ((10 * Math.random()) + 1);

        System.out.println("Good Evening.");

        System.out.print("Please enter your first and last name: ");
        String name = input.nextLine();

        System.out.print("Please enter today's date (mm/dd/yyyy): ");
        String date = input.nextLine();

        System.out.print("What movie would you like to watch?");
        String movie = input.nextLine();

        System.out.print("How many tickets would you like to purchase?");
        int ticketquantity = input.nextInt();

        System.out.print("What is the ticket price? $");
        double ticketprice = input.nextDouble();
        input.nextLine();

        System.out.println("Do you wish to buy food (Y/N)");
        String yesorno = input.nextLine();
        int dquantity = 0;
        if (yesorno.equals("Y")) {
            System.out.println("How Many?");
            dquantity = input.nextInt();
        }

        double totalprice = (ticketquantity * ticketprice) + (dquantity * 5);

        input.nextLine();

        System.out.print("Enter your debit card number (with dashes please!) (#####-###-####): ");
        String cardnumber = input.nextLine();

        input.nextLine();

        System.out.print("Enter your PIN (####): ");
        String pin = input.next();

        System.out.println();
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
        System.out.print("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");

        System.out.println();
        System.out.println("Your e-Receipt");
        System.out.println();
        System.out.println(date.replace("/", "-"));
        System.out.println("Order Number #" + randomNumber);
        System.out.println("\t" + name.charAt(0) + ". " + name.substring(name.lastIndexOf(' ')));
        System.out.println("\tAccount: #####-###-" + cardnumber.substring(10));
        System.out.println("\tMovie: " + movie);
        System.out.println("\tNumber of Tickets: " + ticketquantity);
        System.out.println("\tTicket Price: " + ticketprice);
        System.out.println("\tFood: " + dquantity + " items.");
        System.out.println("\tFood Price: $" + ((dquantity*5)));
        System.out.println("\t$" + totalprice + " will be debited to your account.");
        System.out.println();
        System.out.println("\tThank you. Enjoy your movie tonight.");
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
        System.out.print("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");


    }
}
