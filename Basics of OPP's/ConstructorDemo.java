class Student {
    String name;
    int age;
    Student() {
        name = "Om";
        age = 19;
    }
    Student(String n, int a) {
        name = n;
        age = a;
    }
    void display() {
        System.out.println("The name of the student is " + name + " and his age is " + age);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.display();
        Student student2 = new Student("Ronak", 20);
        student2.display();
    }
}
