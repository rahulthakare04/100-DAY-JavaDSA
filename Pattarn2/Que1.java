//wap to print the sum of digit in the number 



import java.util.Scanner;

class Que1{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();

        
        int digitSum=0;
        while(n>0){
            int lastDigit=n%10;
            n=n/10;
            digitSum+=lastDigit;

        }

        System.out.println(digitSum);
    }
}