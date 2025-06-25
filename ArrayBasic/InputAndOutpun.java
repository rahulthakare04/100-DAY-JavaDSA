package ArrayBasic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InputAndOutpun {
    public static void main(String[] args) {

//        int [] arr={ 10,20,30,40,50,60};
//        int n=arr.length;
//        //how to print the array
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//    }

        // inpu for the arry

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array size: ");
        int m=sc.nextInt();
        int [] arr1=new int[m];
        System.out.println("enter the element of array ");
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }

        for (int i = 0; i <m ; i++) {
            System.out.println(arr1[i]);

        }

    }
}
