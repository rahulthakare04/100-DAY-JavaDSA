package ArrayList;

import java.util.ArrayList;

// find the max element in the array list
public class Que2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(5);
        list.add(9);
        list.add(8);
        list.add(2);
        list.add(1);

        System.out.println(list);
        int max=Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }

        System.out.println("max element is : "+ max);
    }
}
