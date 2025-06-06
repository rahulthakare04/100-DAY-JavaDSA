import java.util.*;


public class InputOutputSeatching {

    public static boolean searching(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.println("("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        //creating 2D array and input i j
        int arr[][]=new int[3][3];
        int n=arr.length ,m=arr[0].length;
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        //print the array
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("the key found at index : "+arr[i][j]+" ");
            }
            System.out.println();
        }

        searching(arr, 6);
        sc.close();

    }
}
