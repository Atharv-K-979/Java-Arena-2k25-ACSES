// This program demonstrates exception handling in Java using try-catch
public class DivisionExample {
    public static void main(String[] args) {
        try {
            int a = 10;      // Initialize variable 'a' with value 10
            int b = 0;       // Initialize variable 'b' with value 0 (will cause division by zero)
            
            // Attempt to divide 'a' by 'b' — this will throw an ArithmeticException
            int c = a / b;
            
            // This line will not be executed if an exception occurs
            System.out.println("Result: " + c);
            
        } catch (ArithmeticException e) {
            // This block handles the division by zero error
            System.out.println("Cannot divide by zero!");
        }
    }
}
