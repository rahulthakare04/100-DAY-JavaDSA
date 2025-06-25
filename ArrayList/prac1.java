package ArrayList;

/*Monotonic ArrayList (EASY)
An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
An Arraylist nums is monotone increasing if for all i <= j, nums.get(i) <= nums.get(j). An
Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.
Sample Input 1 : nums = [1,2,2,3]
Sample Output 1 : true
Sample Input 2 : nums = [6,5,4,4]
Sample Output 2 : true
Sample Input 3 : nums = [1,3,2]
Sample Output 3 : false
Constraints :
        ● 1 <= nums.size() <= 105
        ● -105 <= nums.get(i) <= 105*/


import java.util.ArrayList;

public class prac1 {

    public static boolean monotonic(ArrayList<Integer> list){

            boolean inc=false;
            boolean dec=false;
        for (int i = 0; i <list.size()-1 ; i++) {
            for (int j = i+1; j <list.size() ; j++) {

                if(list.get(i)<=list.get(j)){
                    inc=true;
                }
                else if(list.get(i)>=list.get(j)){
                    dec=true;
                }



            }

        }
        return  inc || dec;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
       list.add(3);

        System.out.println(monotonic(list));

    }
}
