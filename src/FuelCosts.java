import java.util.Scanner;

public class FuelCosts{
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // Declare Variables
        double gasInTank = 0;
        double dollarsPerGallon = 0;
        double milesPerGallon = 0;
        double distance = 0;
        double costPerMile = 0;
        double gasCost = 0;
        String trash = "";
        boolean done = false;
        System.out.println("\nFuel Management");
        do{
            System.out.print("\nHow many gallons of gas do you have?: ");
            if (in.hasNextDouble()) {
                gasInTank = in.nextDouble();
                in.nextLine(); // clears line
                done = true; // valid number
            }
            else{
                trash = in.nextLine();
                System.out.println("You stated the number of gallons of gas was: " + trash);
                System.out.println("Please enter the correct number for the gallons of gas. ");
            }
        }while(!done);
        done = false;
        do{
            System.out.print("What miles per gallon do you get? ");
            if(in.hasNextDouble()) {
                milesPerGallon = in.nextDouble();
                in.nextLine(); // clears the line
                done = true; // valid number
            }
            else{
                trash = in.nextLine();
                System.out.println("\n You stated the miles per gallon was: " + trash);
                System.out.println("Please enter a valid number for the mpg. ");
            }
        }while(!done);
        done = false;
        do{
            System.out.print("What is the price per gallon for gas? $");
            if(in.hasNextDouble()) {
                dollarsPerGallon = in.nextDouble();
                in.nextLine(); // clears line
                done = true; // valid number
            }
            else{
                trash = in.nextLine();
                System.out.println("\nYou said the price for gas was: " + trash);
                System.out.println("Please enter a valid price for the gallon of gas.");
            }
        }while(!done);
        costPerMile = dollarsPerGallon/milesPerGallon;
        gasCost = costPerMile*100;
        System.out.println("\nTo travel 100 miles it would cost: $" + String.format("%.2f", + gasCost));
        distance = gasInTank*milesPerGallon;
        System.out.println("With the " + gasInTank + " gallons of gas you currently have, you can travel " + distance + " miles.");
        }

}
