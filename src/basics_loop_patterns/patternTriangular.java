package basics_loop_patterns;

import java.util.Scanner;

public class patternTriangular {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i<=n){
            int j = 1;
            while (j<=i){
                System.out.print(j);
                j = j + 1;
            }
            i = i + 1;
            System.out.println();
        }
    }
}
