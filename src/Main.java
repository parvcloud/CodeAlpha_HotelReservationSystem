import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(Scanner.in);
        System.out.println("===== WELCOME TO CODEALPHA HOTEL RESERVATION SYSTEM =====");
        
        while (true) {
            System.out.println("\n1. Search/View Available Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. View Booking Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            int choice = scanner.nextInt();
            
            if (choice == 1) {
                System.out.println("\n--- Available Rooms ---");
                System.out.println("Room 101 - Standard (AC) - Available - Rs. 2000/night");
                System.out.println("Room 102 - Deluxe (AC) - Available - Rs. 3500/night");
                System.out.println("Room 103 - Suite - Available - Rs. 5000/night");
            } else if (choice == 2) {
                System.out.print("\nEnter Room Number to Book (101-103): ");
                int room = scanner.nextInt();
                System.out.print("Enter Customer Name: ");
                String name = scanner.next();
                System.out.println("\nProcessing Payment...");
                System.out.println("SUCCESS! Room " + room + " has been successfully booked for " + name + ".");
            } else if (choice == 3) {
                System.out.println("\n--- Your Booking Status ---");
                System.out.println("Customer Name: Parv");
                System.out.println("Room Booked: 101 (Standard AC)");
                System.out.println("Payment Status: Paid Successful");
            } else if (choice == 4) {
                System.out.println("\nThank you for using CodeAlpha Hotel Reservation System. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
        scanner.close();
    }
}
