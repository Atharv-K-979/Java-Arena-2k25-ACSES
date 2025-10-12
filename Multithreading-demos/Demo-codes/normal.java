class Task1{
    public void work(){
        for(int i=0;i<10;i++){
            System.out.println("Running task A step:"+" "+i);
        }
    }
}

class Task2{
    public void work(){
        for(int i=0;i<8;i++){
            System.out.println("Running task B step:"+" "+i);
        }
    }
}


public class normal {
    public static void main(String[] args) {
        Task1 A = new Task1();
        Task2 B = new Task2();
        A.work();
        System.out.println("\n");
        B.work();
        System.out.println("done tasks");
    }
}
