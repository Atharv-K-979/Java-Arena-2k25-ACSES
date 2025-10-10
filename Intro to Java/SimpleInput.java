import java.util.Scanner; // Import Scanner class

public class SimpleInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter your age: "); // Ask user for input
        int age = sc.nextInt();               // Read integer input from user

        System.out.println("Your age is: " + age); // Display the input

        sc.close(); // Close the scanner
    }
}