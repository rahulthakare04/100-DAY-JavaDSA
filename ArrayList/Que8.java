package ArrayList;

// pair sum 1
//find the any pair in sorted array list has the target sum
//list [1 2 3 4 5 6] target sum =5


import java.util.ArrayList;

public class Que8 {
    public static boolean pairSum1(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;

        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;

            }
            else if(list.get(lp)+list.get(rp)<target){
                lp++;
            }else{
                rp--;
            }
        }
         return false;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(pairSum1(list,5));

    }



}
