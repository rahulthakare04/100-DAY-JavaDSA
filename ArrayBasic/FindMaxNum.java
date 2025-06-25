package ArrayBasic;
// find the max number in the array
public class FindMaxNum {
    public static void main(String[] args) {
        int [] arr={1,5,3,2,4,7,8,6,89,41,56,-1,-5,32};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(" max number is : "+max);

    }
}
