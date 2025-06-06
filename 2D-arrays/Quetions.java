public class Quetions {




    public static int findSeven(int arr[][],int key){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    count++;
                }
                System.out.println();
            }
        }
        return count;
    }



    public static int secondRowSum(int nums[][]){
        int sum=0;
        
            for(int j=0;j<nums[0].length;j++){
                sum+=nums[1][j];
            }
        
        return sum;
    }


    public static void transpose(int arr[][],int row,int col ){
       int tp[][]=new int [col][row];
       
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                tp[j][i]=arr[i][j];

            }
        }
        //for printing the transport matrix 
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(tp[i][j]+" ");

            }
            System.err.println();
        }
    }
    public static void main(String[] args) {
        //  int arr[][]={{4,7,8},{8,8,7}};
        // int key=7;
        //  int count=findSeven(arr, key);
        //  System.out.println("the "+key+" found "+count+" time");

        // int nums[][]={{1,4,9},{11,4,3},{2,2,3}};
        // int sum =secondRowSum(nums);
        // System.out.println("sum of second row is : "+sum);
        int row=2,col=3;
        int arr[][]={{4,7,8},{8,8,7}};
        transpose(arr,row,col);
        

    }
    
}
