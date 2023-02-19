import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the number of gallons of gas in the tank
        System.out.print("Enter the number of gallons of gas in the tank: ");
        
        // Read the number of gallons of gas input from the user
        double gallons = input.nextDouble();
        
        // Prompt the user to enter the fuel efficiency in miles per gallon
        System.out.print("Enter the fuel efficiency in miles per gallon: ");
        
        // Read the fuel efficiency input from the user
        double efficiency = input.nextDouble();
        
        // Prompt the user to enter the price of gas per gallon
        System.out.print("Enter the price of gas per gallon: ");
        
        // Read the price of gas input from the user
        double price = input.nextDouble();
        
        // Check if the input is valid
        if (gallons <= 0 || efficiency <= 0 || price <= 0) {
            System.out.println("Invalid input.");
        } else {
            // Calculate the cost per 100 miles
            double costPer100Miles = 100 / efficiency * price;
            
            // Calculate the distance the car can go with the gas in the tank
            double distance = gallons * efficiency;
            
            // Output the results
            System.out.println("The cost per 100 miles is: " + costPer100Miles);
            System.out.println("The car can go " + distance + " miles with the gas in the tank.");
        }
    }
}
