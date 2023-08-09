package basics_loop_patterns;

import java.util.Scanner;

public class pattern_isoceles {
    public static void main(String[] args){
        int n;
        int i =1;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        while(i<=n){
            int j=1;
            int k=1;
            int l=1;
            while(j<=(n-i)){
                System.out.print(" ");
                j = j+1;
            }
            int number1 = 1;
            while(k<=i){
                System.out.print(number1);
                number1 = number1 + 1;
                k = k + 1;
            }
            int number2=i-1;
            while(l<=i-1){
                System.out.print(number2);
                number2 = number2 -1;
                l = l+1;
            }
           System.out.println();
            i = i + 1;
        }
    }
}