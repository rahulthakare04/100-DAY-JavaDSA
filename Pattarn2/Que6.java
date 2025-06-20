// print the number of factorial number


import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Que6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();
        int fact=1;



       for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
               fact*=j;
           }
           System.out.println(fact+" ");
           fact=1;
       }


    }
}
