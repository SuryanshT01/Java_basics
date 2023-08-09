package functions_arrays;

import java.util.Scanner;

public class functions3_checkFibonacci {
    public static void checkFibonacci(int n){
        int a=1;
        int b=1;
        int c;
        while (a<n){
            c = a + b;
            a = b ;
            b = c;
        }
        if (a == n){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
    public static void main(String[] args){
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        checkFibonacci(n);
    }
}