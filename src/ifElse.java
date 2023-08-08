import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        if (a >= 0 && b >= 0) {
            System.out.println("Both the numbers are positive");
        } else if (a < 0 && b < 0) {
            System.out.println("Both the number are negative");
        } else {
            System.out.println("One of the number is positive and other is negative");
        }
    }
}