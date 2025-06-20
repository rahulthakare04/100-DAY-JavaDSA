// wap to to print the sum of given number and the rever number 

import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();
        int original=n;

        int rev=0;
    

        while (n!=0){
            int lastDigit=n%10;
            rev=rev*10;
            rev=rev+lastDigit;
            n=n/10;
        }

       int sum=rev+original;
       System.out.println(sum);
       sc.close();
    }
}
