import java.util.Scanner;

public class IT24102346Lab5Q3 {
    // Constants
    private static final int ROOM_CHARGE_PER_DAY = 48000;
    private static final int MIN_DATE = 1;
    private static final int MAX_DATE = 31;
    
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the start date and end date
        System.out.print("Enter the start date (day of the month): ");
        int startDate = scanner.nextInt();
        
        System.out.print("Enter the end date (day of the month): ");
        int endDate = scanner.nextInt();
        
        // Validate the input
        if (startDate < MIN_DATE || startDate > MAX_DATE || endDate < MIN_DATE || endDate > MAX_DATE) {
            System.out.println("Error: Dates must be between " + MIN_DATE + " and " + MAX_DATE + ".");
        } else if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
        } else {
            // Calculate the number of days reserved
            int numberOfDays = endDate - startDate;
            
            // Check if the reservation qualifies for a discount
            int discountRate = 0;
            if (numberOfDays >= 5) {
                discountRate = 20;
            } else if (numberOfDays >= 3) {
                discountRate = 10;
            }
            
            // Calculate the total amount to be paid
            int totalCharge = numberOfDays * ROOM_CHARGE_PER_DAY;
            int discountAmount = totalCharge * discountRate / 100;
            int finalAmount = totalCharge - discountAmount;
            
            // Print the results
            System.out.println("Number of days reserved: " + numberOfDays);
            System.out.println("Discount Rate: " + discountRate + "%");
            System.out.println("Total amount to be paid: Rs " + finalAmount);
        }
        
        // Close the scanner
        scanner.close();
    }
}

