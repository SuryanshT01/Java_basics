import java.util.Scanner;

public class checkPrimality2 {
    public static void main(String[] args) {
        int n, i = 2;
//        boolean isPrime = true;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        while (i <= n / 2) {
            if (n % i == 0) {
                System.out.println("composite");
                return;
//                isPrime = false;
            }
            i = i + 1;
        } System.out.println("prime");
//        if (isPrime) {
//            System.out.println("Prime");
//        } else {
//            System.out.println("composite");
//        }
    }
}
