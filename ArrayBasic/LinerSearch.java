package ArrayBasic;

public class LinerSearch {
    public static void main(String[] args) {
        int [] arr={ 1,4,8,6,3,2,5,89,4,7,6};
        int n=arr.length;
        int target=894;

        for (int i = 0; i <n ; i++) {
            if(arr[i]==target){
                System.out.println(i);
                break;
            }
        }
        System.out.println("element is not found ");
    }

}
