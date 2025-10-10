//changing the no of parameters
class Sum1 {
    int sum(int x, int y) {
        return x + y;
    }
    int sum(int x, int y, int z) {
        return x + y + z;
    }
    public static void main(String[] args) {
        Sum1 obj = new Sum1();
        int s1 = obj.sum(3, 2);
        int s2 = obj.sum(1, 2, 3);
        System.out.println("Sum of 2 parameters: " + s1);
        System.out.println("Sum of 3 parameters: " + s2);
    }
}
