class Employee {
    String name;
    int id;

    void getDetails(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void showDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

class Manager extends Employee {
    String department;

    void setDepartment(String department) {
        this.department = department;
    }

    void showManagerInfo() {
        System.out.println("Manager of " + department + " department.");
    }
}

public class single {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.getDetails("Gourov", 101);
        m.setDepartment("IT");

        System.out.println("--- Manager Info ---");
        m.showDetails();
        m.showManagerInfo();
    }
}
