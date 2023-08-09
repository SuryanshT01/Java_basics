package functions_arrays;

import java.util.Scanner;

public class functions1_ncr {
    public static int factorial(int num){
        int fact = 1;
        for (int i = 1 ;i<=num;i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args){
        int n;
        int r;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        r = s.nextInt();
        int factN = factorial(n);
        int factR = factorial(r);
        int factNR = factorial(n-r);
        int NcR = factN / (factR*factNR);
        System.out.println(NcR);
    }
}