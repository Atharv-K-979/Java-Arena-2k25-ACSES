//Changing the Order of the Parameters of Methods
public class Sum3
{
    void ex(String x, int y) {
        System.out.println(x + " " + y);
    }
    void ex(int x, String y) {
        System.out.println(x + " " + y);
    }
    public static void main(String[] args) {
        Sum3 obj = new Sum3();
        obj.ex("Walchand", 78);
        obj.ex(78, "Walchand");
    }
}
