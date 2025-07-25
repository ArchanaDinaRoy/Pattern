package Basic;

import java.util.Scanner;

public class pattern8_butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // upper part
        for(int i =1; i<=n;i++)
        {
            // 1st half start
            for(int j =1; j<=i;j++)
            {
                System.out.print("*");
            }

            // space
            int space = 2*(n-i);
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }

            //2nd half star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower part
        for(int i =n; i>=1;i--)
        {
            // 1st half start
            for(int j =1; j<=i;j++)
            {
                System.out.print("*");
            }

            // space
            int space = 2*(n-i);
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }

            //2nd half star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
