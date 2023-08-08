import java.util.Scanner;

public class for_loop_fibonacci {
    public static void main(String[] args){
            int n;
            Scanner s = new Scanner(System.in);
            n = s.nextInt();
            int a = 1;
            int b =1;
            int c = 0;
            System.out.println(a);
            System.out.println(b);
            for (int i =1;i<=n-2;i++){
                c = a + b;
                a =b;
                b = c;
                System.out.println(c);
            }
    }
}

//Fibonacci series is 1 1 2 3 5 8 13 21 34 55...
//F(1) = F(2) = 1;
//f(n) = f(n-1) + f(n-2);
