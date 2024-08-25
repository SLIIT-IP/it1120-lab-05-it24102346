import java.util.Scanner;

public class IT24102346Lab5Q2 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of new members
        System.out.print("Enter the number of new members introduced: ");
        
        // Read the user input
        int numberOfNewMembers = scanner.nextInt();
        
        // Validate the input
        if (numberOfNewMembers < 0) {
            System.out.println("Invalid input. The number of new members must be 0 or greater.");
        } else {
            // Determine the prize based on the number of new members
            String prize;
            switch (numberOfNewMembers) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
                    break;
            }
            
            // Print the prize
            System.out.println("The prize you are entitled to is: " + prize);
        }
        
        // Close the scanner
        scanner.close();
    }
}

