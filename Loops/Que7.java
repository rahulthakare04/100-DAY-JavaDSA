//print the table of n ,n is the user inpust 

import java.util.Scanner;

public class Que7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the n : ");
        int n=sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
        sc.close();
    }
}
