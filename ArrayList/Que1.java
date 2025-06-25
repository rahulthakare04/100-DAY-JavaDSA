package ArrayList;
// reverse of the array list
//[1 2 3 4 5]
//[5 4 3 2 1]

import java.util.ArrayList;



public class Que1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i) +" ");
        }
    }
}
