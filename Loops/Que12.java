//write a program to find the digit of number 

import java.util.Scanner;

public class Que12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n =sc.nextInt();
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("digit of the number is "+count);
        sc.close();
    }
    
}
