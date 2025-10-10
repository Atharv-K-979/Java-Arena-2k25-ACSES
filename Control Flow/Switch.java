/*
Write a Java program to tell the current day as per its number.

Use a switch statement to perform the operation:

1 : Sunday
2 : Monday
3 : Tuesday
4 : Wednesday
5 : Thursday
6 : Friday
7 : Saturday

*/

public class Switch {
    public static void main(String[] args) {
        int day = 1;
    
        switch(day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }
    }
    

}

