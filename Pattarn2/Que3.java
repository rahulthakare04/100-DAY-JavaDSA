package Pattarn2;// write a program to reverse the program

import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();

        //int revNum=0;

    //    while(n>0){
    //         int lastDigit=n%10;
    //         revNum+=lastDigit;
    //         revNum=revNum*10;
    //         n=n/10;
    //     }

    //     revNum=revNum/10;
    //     System.out.println(revNum);
    //     sc.close();


        int r=0;
        while(n>0){
            int ld=n%10;
            r=r*10;
            r+=ld;
            n=n/10;
        }
        System.out.println(r);
        sc.close();

    }
}
 