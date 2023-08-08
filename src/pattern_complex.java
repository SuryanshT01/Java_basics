import java.util.Scanner;

public class pattern_complex {
    public static void main(String[] args){
        int n;
        int i=1;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        while (i<=n){
            int j = 1;
            int k = 1;
            int l = 1;
            while(j<=(2*n-2*i)){
                System.out.print(" ");
                j = j +1;
            }
            int number = 1;
            while (k<=i){
                System.out.print(number);
                number = number+1;
                k=k+1;
            }
            while (l<=(i-1)){
                System.out.print("*");
                l = l+1;
            }
            System.out.println();
            i = i +1;
        }
    }
}