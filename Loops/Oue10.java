// find the hiehst factor of any number

import java.util.Scanner;

public class Oue10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();

        int hf=1;
        // for(int i=1;i<=n-1;i++){
        //     if(n%i==0){
        //         hf=i;
                
        //     } 
        // }
        // System.out.println(hf);



        for(int i=n-1; i>=1;i--){
            if(n%i==0){
                hf=i;
                break;
            }
        }
        System.out.println(hf);
        sc.close();
    }
}
