package ArrayBasic;
//calculating the sum of all element of array
public class Que2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        int sum=0;
        for (int i = 0; i <n ; i++) {
            sum+=arr[i];
        }
        System.out.println("sum of all array element is : "+sum);
    }

}
