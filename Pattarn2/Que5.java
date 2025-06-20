// fing the facorial of any number 

import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();

        int facorial=1;
        for(int i=1;i<=n;i++){
            facorial=facorial*i;
        }
        System.out.println(facorial);
        sc.close();
    }
}
