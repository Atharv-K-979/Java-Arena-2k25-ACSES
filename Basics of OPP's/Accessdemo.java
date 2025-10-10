class person{
    public String name = "Rahul";
    protected int age = 25;
    private int salary = 10000;

    void display(){
        System.out.println("This is Class person");
        System.out.println("Name: "+ name);
        System.out.println("age : "+ age);
        System.out.println("salary: "+ salary);
    }

}

class Employess extends person{
    String company="WCE";
     void display(){
        System.out.println("\nThis is class Employee");
        System.out.println("Name: "+ name);
        System.out.println("age : "+ age);
        System.out.println("Salary cannot be accessed here ");
        System.out.println("Company: "+ company);
    }
    

}

public class Accessdemo {
    public static void main(String[] args) {
        person p1 = new person();
        p1.display();  
        Employess E1= new Employess();
        E1.display();
    }
}