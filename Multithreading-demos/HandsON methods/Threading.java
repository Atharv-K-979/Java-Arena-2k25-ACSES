class Thrd implements Runnable{
    private final String name;

    public Thrd(String name) {
        this.name = name;
    }

    @Override
    public void run(){
        for(int i=0;i<10;i++){
            if(i==3){
                try{
                    Thread.sleep(2000);
                }
                catch (InterruptedException e){
                    System.out.println("Thread Interrupted");
                }
            }
            System.out.println("Thread A is performing "+i+"th step");
        }
    }
    
}

public class Threading{
    public static void main(String[] args) {
        Thread A=new Thread(new Thrd("A"));
        A.start();
        System.out.println("Priority: "+A.getPriority());
        A.setPriority(9);
        System.out.println("Priority: "+A.getPriority());
        
        try{
            A.join();
        }catch(InterruptedException e){
            
        }
        System.out.println("a thread finished");
    }
}