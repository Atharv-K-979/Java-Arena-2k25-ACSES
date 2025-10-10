/*
WAP to assign grade to student's marks.
1. 90+ : A
2. 70 - 89 : B
3. 40 - 69 : C
4. 40- : F
 
*/

public class conditional {
    public static void main(String[] args) {
        int marks = 100;

        if(marks >= 90){
            System.out.println("A");
        }
        else if(marks >= 70){
            System.out.println("B");
        }
        else if(marks >= 40){
            System.out.println("C");
        }
        else{
            System.out.println("F");
        }
    }
}
