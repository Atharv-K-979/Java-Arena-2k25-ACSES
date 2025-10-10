class Demo {

int instanceVar = 10;       // instance variable
static int staticVar = 20;   // static variable

void show() {
int localVar = 30; // local variable
System.out.println("Local Variable: " + localVar);
System.out.println("Instance Variable: "+ instanceVar);
System.out.println("Static Variable: "+ staticVar);
}

public static void main(String[] args) {
Demo obj = new Demo(); // creating object
obj.show();

}
}