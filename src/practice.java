import java.util.Scanner;

public class practice {
    public static void main(String[] args){
            int n;
            Scanner s = new Scanner(System.in);
            n = s.nextInt();
            int divisor = 2;
            while (divisor<n/2){
                if (n%divisor==0){
                    System.out.println("not prime");
                    return;
                }else {
                    divisor = divisor + 1;
                }

            }System.out.println("prime");
//            int a = 1;
//            int b =1;
//            int c = 0;
 //            System.out.println(a);
//            System.out.println(b);
//            for (int i =8;i!=0;i--){
//                c = a + b;
//                a =b;
//                b = c;
//                System.out.println(i--);
//            }
    }
}

//Fibonacci series is 1 1 2 3 5 8 13 21 34 55...
//F(1) = F(2) = 1;
//f(n) = f(n-1) + f(n-2);
