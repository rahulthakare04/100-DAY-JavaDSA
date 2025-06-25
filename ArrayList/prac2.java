package ArrayList;
/*Lonely Numbers in ArrayList (MEDIUM)
You are given an integer arraylist nums. A number x is lonely when it appears only once, and
no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.
Return all lonely numbers in nums. You may return the answer in any order.
Sample Input 1 : nums = [10,6,5,8]
Sample Output 1 : [10,8]
Explanation :
- 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.
- 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums.
- 5 is not a lonely number since 6 appears in nums and vice versa.
Hence, the lonely numbers in nums are [10, 8].
Note that [8, 10] may also be returned.
Sample Input 2 : nums = [1,3,5,3]
Sample Output 2 : [1,5]
Explanation :
- 1 is a lonely number since it appears exactly once and 0 and 2 does not appear in nums.
- 5 is a lonely number since it appears exactly once and 4 and 6 does not appear in nums.
- 3 is not a lonely number since it appears twice.
Hence, the lonely numbers in nums are [1, 5].
Note that [5, 1] may also be returned.
Constraints :
● 1 <= nums.size() <= 105
● 0 <= nums.get(i) <= 106

 */


import java.util.ArrayList;

public class prac2 {

    public static ArrayList<Integer> lonlyNumber(ArrayList<Integer> list){

        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j <list.size()-1 ; j++) {
                if(list.get(i)-list.get(j)==1 || list.get(i)-list.get(j)==-1  ){
                    list.remove(i);
                    list.remove(j);
                }
                else if(list.get(i).equals(list.get(j))){
                    list.remove(i);
                    list.remove(j);
                }

            }

        }
        return  list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);

        System.out.println(lonlyNumber(list));


    }
}
