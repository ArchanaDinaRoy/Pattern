package Basic;

import java.util.Scanner;

public class pattern9_rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1; i<=n; i++)
        {
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            // star
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
