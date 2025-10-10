public class ArraysDemo {
    public static void main(String[] args) {
        
        // 1. Simple Integer Array
        int[]numbers = {10,20,30,40,5};
        // for(int n: numbers){
        //     System.out.println(n+ "");
        // }
        // System.out.println();
       

        // Find maximum number
        // int max= numbers[0];
        // for(int i=1;i<numbers.length;i++){
        //     if(numbers[i]>max){
        //         max= numbers[i];
        //     }
        // }
        // System.out.println("Maximum value "+ max);

       

        // Print array in reverse order
        for(int i=numbers.length-1;i>=0;i--){
            System.out.println(numbers[i]+" ");
        }
        

        
    }
}
git push -u origin main --force
