import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double fahrenheit = 0;
        double celsius = 0;
        String trash = "";
        boolean done = false;
        System.out.println("\nCelsius to fahrenheit converter");
        do {
            System.out.print("\nEnter the Celsius temperature: ");

            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine(); // clears line
                done = true; //valid number
            }
            else {
                trash = in.nextLine();
                System.out.println("\nYou put temperature as: " + trash);
                System.out.println("That is an invalid temperature!");
            }
        }while(!done);
        // Valid Temperature at this point
        fahrenheit = (celsius * 1.8) + 32;
        System.out.println(String.format("\n%.1f", + celsius) + "C equals " + String.format("%.1f", fahrenheit) + "F");
        if (celsius == 0) {
            System.out.println("The freezing point of water");
        }
        if (celsius == 100) {
            System.out.println("The boiling point of water");
        }
    }
}