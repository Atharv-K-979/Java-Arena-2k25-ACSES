
class Task1 implements  Runnable{
    private final String name;

    public Task1(String name) {
        this.name = name;
    }


    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Running task A step:"+" "+i);
        }
    }
    
}

class Task2 implements  Runnable{

    private final String name;

    public Task2(String name) {
        this.name = name;
    }

    @Override
    public void run(){
        for(int i=0;i<8;i++){

            System.out.println("Running task B step:"+" "+i);

        }
    }
}

public class multitask {
    public static void main(String[] args) {
        Thread A=new Thread(new Task1("A"));
        Thread B=new Thread(new Task2("B"));

        System.out.println("starting the threads\n");
        A.start();
        B.start();

        try {
            A.join();
            B.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.err.println("all tasks finished\n");


    }
}
