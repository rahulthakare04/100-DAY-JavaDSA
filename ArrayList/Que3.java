package ArrayList;
//swapiing of two number on the index
//given the two index swap the value of two index

import java.util.ArrayList;

public class Que3 {

    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(8);
        list.add(2);
        list.add(1);
        System.out.println(list);
        int idx1=1;
        int idx2=3;

        swap(list,idx1,idx2);
        System.out.println(list);
    }
}
