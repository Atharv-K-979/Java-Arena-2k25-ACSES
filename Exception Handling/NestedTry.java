// This program demonstrates the concept of nested try-catch blocks in Java
public class NestedTry {
    public static void main(String[] args) {
        try {
            // Outer try block
            int[] arr = {10, 20, 30};  // Declare and initialize an integer array

            try {
                // Inner try block
                // Attempt to access index 5 (which does not exist) and divide by zero
                // This will first throw an ArrayIndexOutOfBoundsException
                int result = arr[5] / 0;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                // Inner catch block — handles division by zero errors
                System.out.println("Inner catch: Division by zero");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            // Outer catch block — handles array index out-of-range errors
            System.out.println("Outer catch: Array index out of range");
        }
    }
}
