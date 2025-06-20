// wap to fing the product od digit of the give number 

import java.util.Scanner;

public class Que2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();

        int product=1;

        while(n>0){
            int lastDigit=n%10;
            product*=lastDigit;
            n=n/10;
        }
        System.out.println(product);
        sc.close();
    }
}
