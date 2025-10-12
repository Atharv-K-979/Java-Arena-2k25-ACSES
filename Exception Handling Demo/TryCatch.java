public class TryCatch {
     // try & catch Keyword
     public static void main(String[] args) {
        try{
            int result =10/0;
            System.out.println("Result: "+result);
        } catch(ArithmeticException e){
            System.out.println("Error: Divison by zero is not allowed!");
        }
    }
}
