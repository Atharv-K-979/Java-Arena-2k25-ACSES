// This program demonstrates nested try-catch blocks along with the use of 'throw'
public class hands_on_3 {
    public static void main(String[] args) {
        try {
            // Outer try block
            int[] arr = {10, 20, 30};  // Declare and initialize an integer array

            try {
                // Inner try block
                // Attempt to access an invalid index — this will cause an exception
                int result = arr[5] / 0;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                // Inner catch block — handles division by zero errors
                System.out.println("Inner catch: Division by zero");
            }

            // Manually throwing an exception using 'throw'
            // Even though the above code caused an array error,
            // this part will demonstrate how to throw a custom exception manually
            throw new ArrayIndexOutOfBoundsException("Manually thrown exception after inner try-catch");

        } catch (ArrayIndexOutOfBoundsException e) {
            // Outer catch block — handles both real and manually thrown array index errors
            System.out.println("Outer catch: " + e.getMessage());
        }

        System.out.println("Program continues normally after exception handling.");
    }
}
