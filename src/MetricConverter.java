import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Declare Variables
        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        double mileConversion = 0.000621371;
        double footConversion = 3.2808399;
        double inchConversion = 39.3700787;
        String trash = "";
        boolean done = false;
        System.out.println("\nMetric Converter");
        do{
            System.out.print("\nEnter a value in meters to convert: ");
            if(in.hasNextDouble()) {
                meters = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else{
                trash = in.nextLine();
                System.out.println("The meter measurement was: " + trash);
                System.out.println("Enter a valid number in meters.");
            }
        }while(!done);
        miles = meters * mileConversion;
        feet = meters * footConversion;
        inches = meters * inchConversion;
        if (meters <=20) {
            System.out.println("\nMiles: " + String.format("%m,.4f", miles));
        }else {
            System.out.println("\nMiles: " + String.format("%,.2f", miles));
        }
        System.out.println("Feet: " + String.format("%,.2f", feet));
        System.out.println("Inches: " + String.format("%,.2f", inches));
    }
}
