// WAP to check whether num is Prime or not.

public class Loops {
    public static void main(String[] args) {
        int num = 8;
        bool found = false;

        for(int i = num; i >= 2; i--){
            if(num % i == 0){
                found = true;
                break
            }
        }
        if(found){
            System.out.println("Is not Prime");
        }
        else{
            System.out.println("Is Prime");
        }
    }
    
}

