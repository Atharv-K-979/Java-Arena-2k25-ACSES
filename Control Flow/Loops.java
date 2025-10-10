// WAP to check whether num is Prime or not.

public class Loops {
    public static void main(String[] args) {
        int num = 8;
        int count = 0;

        for(int i = num; i >= 1; i--){
            if(num % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Is Prime");
        }
        else{
            System.out.println("Is not Prime");
        }
    }
    
}
