public class Prime {
    public static void main(String[] args) {
        int num = 8;
        boolean found = false;

        for(int i = num - 1; i >= 2; i--){
            if(num % i == 0){
                found = true;
            }
        }
        if(found == false){
            System.out.println("Is Prime");
        }
        else{
            System.out.println("Is not Prime");
        }
    }
}
