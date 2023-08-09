package basics_loop_patterns;

import java.util.Scanner;

public class pattern_diamond {
    public static void main(String[] args){
        int n;
        int i =1;
        int p = 1;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        // For upper half of the diamond
        while(i<=n/2+1){
            int j=1;
            int k=1;
            while(j<=n/2-i+1){
                System.out.print(" ");
                j = j+1;
            }
            while(k<=2*i-1){
                System.out.print("*");
                k = k + 1;
            }
           System.out.println();
            i = i + 1;
        }
// For lower half of the diamond
        while(p<=n/2){
            int q=1;
            int r=1;
            while (q<=p){
                System.out.print(" ");
                q = q+1;
            }
            while (r<=(n-2*p)){
                System.out.print("*");
                r = r+1;
            }
            System.out.println();
            p = p + 1;
        }
    }
}