//Changing Data Types of the Arguments
public class Sum2 {
    int sum(int x, int y) {
        return x + y;
    }
    double sum(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        Sum2 obj = new Sum2();
        int Num1 = obj.sum(8, 5);
        double Num2 = obj.sum(4.3, 6.26);
        System.out.println("int: " + Num1);
        System.out.println("double: " + Num2);
    }
}
