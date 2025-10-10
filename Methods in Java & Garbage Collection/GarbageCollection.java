public class GarbageCollection {
   public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        obj1 = null;
        System.gc();
        System.out.println("End of main method");
    }  
}
class MyClass {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector called for MyClass object");
    }
}
