import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Declare Variables
        double width = 0;
        double height = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        String trash = "";
        boolean done = false;
        System.out.println("\nRectangle information");
        do{
            System.out.print("\nEnter the width of the rectangle: ");
            if(in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else{
                trash = in.nextLine();
                System.out.println("The width was: " + trash);
                System.out.println("Please enter a valid number.");
            }
        }while(!done);
        done = false;
        do{
            System.out.print("Enter the height of the rectangle: ");
            if(in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else{
                trash = in.nextLine();
                System.out.println("\nThe height was: " + trash);
                System.out.println("Please enter a valid height.");
            }
        }while(!done);
        area = width * height;
        perimeter = 2 * (width + height);
        diagonal = Math.sqrt((width * width) + (height * height));
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: "+ diagonal);
    }
}
