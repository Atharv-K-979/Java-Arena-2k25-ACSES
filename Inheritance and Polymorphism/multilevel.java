// Base class
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

// Derived from Employee
class Manager extends Employee {
    String department;

    void setDepartment(String department) {
        this.department = department;
    }

    void showManagerInfo() {
        System.out.println("Manager of " + department + " department.");
    }
}

// Derived from Manager (Multilevel)
class SeniorManager extends Manager {
    int teamSize;

    void setTeamSize(int size) {
        this.teamSize = size;
    }

    void showSeniorManagerInfo() {
        System.out.println("Senior Manager of " + department + " department, handling " + teamSize + " members.");
    }
}

// Main class
public class multilevel {
    public static void main(String[] args) {
        SeniorManager sm = new SeniorManager();
        sm.getDetails("Gourov", 101);
        sm.setDepartment("IT");
        sm.setTeamSize(10);

        System.out.println("--- Senior Manager Info ---");
        sm.showDetails();
        sm.showManagerInfo();
        sm.showSeniorManagerInfo();
    }
}