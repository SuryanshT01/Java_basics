import java.util.Scanner;

public class pattern_char2 {
    public static void main(String[] args){
        int n;
        int i = 1;

        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        while (i<=n){
            int j = 1 ;
            char ch = (char) ('A' + i -1);
            while (j<=n){
                System.out.print(ch);
                ch = (char) (ch + 1);
                j = j+1;
            }
            System.out.println();
            i = i+1;
        }
    }
}