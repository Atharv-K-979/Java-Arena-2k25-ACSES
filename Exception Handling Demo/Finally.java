public class Finally {
    public static void main(String[] args) {
        //finally keyword
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
        } finally {
            System.out.println("This block always executes."); 
        }
    }
}
