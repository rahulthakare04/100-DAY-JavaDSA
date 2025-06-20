//print the give patarn
//****
//****
//****
//****

import java.util.Scanner;

public class Que7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row : ");
        int n=sc.nextInt();
        System.out.println("enter the of colum : ");
        int m=sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
