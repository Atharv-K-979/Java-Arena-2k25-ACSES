class Thrd extends Thread
{
    int no;
    String nm;
     Thrd(String tnm,int n)
     {
        super(tnm);
        nm=tnm;
        no=n;
     }
     void tstart()
     {
        start();
     }
     public void run()
     {
        for(int i=1;i<=no;i++)
        {
            System.out.println(nm+" "+i);
            try
            {
                Thread.sleep(2000);
            }
            catch(Exception e){}
        }
     }
}
public class Threaddemo
{
    public static void main(String[] args)
    {
        System.out.println("Main Starts");
        Thrd a=new Thrd("A",3);
        Thrd b=new Thrd("B",5);
        a.tstart();
        b.tstart();
         try {
            a.join();
            b.join(); 
        } catch (Exception e) {}

        System.out.println("Main Ends");
    }
}