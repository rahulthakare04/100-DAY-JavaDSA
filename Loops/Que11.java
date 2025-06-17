//given number are prime number or not 

import java.util.Scanner;

public class Que11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        boolean flage=false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flage=true;
            }
        }
        if(flage==false){
            System.out.println("the number is prime ");
        }
        else{
            System.out.println("the number is composute ");
        }
        sc.close();
    }
}
