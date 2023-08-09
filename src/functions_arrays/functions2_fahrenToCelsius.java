package functions_arrays;

import java.util.Scanner;

public class functions2_fahrenToCelsius {
    public static void fahrenToCelsius(int S,int E,int W){
        int celsius;
        for (int i=S;i<=E;i=i+W){
            celsius = (5 * (i -32))/9;
            System.out.println(i + " -> " + celsius);
        }
    }
    public static void main(String[] args){
        int S,E,W;
        Scanner s = new Scanner(System.in);
        S = s.nextInt();
        E = s.nextInt();
        W = s.nextInt();
        fahrenToCelsius(S,E,W);
    }
}