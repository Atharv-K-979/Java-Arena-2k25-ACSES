/*
WAP to perform +, -, *, / operator for two numbers.
Use a switch statement to perform the operation:

*/

public class Switch {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;

        char operator = '+';
    
        switch(operator){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            
        }
    }
    

}


