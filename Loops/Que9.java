//display the ap term 1 3 5 7 9 up to n n is user input 

import java.util.Scanner;

public class Que9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n term : ");
        int n =sc.nextInt();

        for(int i=1;i<=(2*n-1);i+=2){
            System.out.println(i);
            
        }
        sc.close();
    }
}
