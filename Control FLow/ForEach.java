// WAP to print each letter in newline of a String.

public class ForEach {
    public static void main(String[] args) {
        String name = "Subodhi";

        for(char c : name.toCharArray()){
            System.out.println(c);
        }
    }
}
