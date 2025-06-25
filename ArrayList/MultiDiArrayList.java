package ArrayList;
//multidimensional ArrayList
//1 2 3 4 5
//2 4 6 8 10
//3 6 9 12 15
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MultiDiArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();

        for (int i = 1; i <=5 ; i++) {
            list1.add(1*i);
            list2.add(2*i);
            list3.add(3*i);

        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);


        //retrieve the element of the ArrayList

        for(int i=0;i<mainList.size();i++){
            ArrayList currList=mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+ " ");
            }
            System.out.println();
        }
    }
}
