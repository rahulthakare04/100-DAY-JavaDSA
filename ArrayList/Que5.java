package ArrayList;

// container with most water

import java.util.ArrayList;

public class Que5 {


    public static int mostWater(ArrayList<Integer> height){
        int maxWater=0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht=Math.min(height.get(i),height.get(j));
                int wt=j-i;
                int water=ht*wt;
                maxWater=Math.max(maxWater,water);

            }
        }
       return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int maxWater=mostWater(height);
        System.out.println("max water : "+maxWater);

    }
}
