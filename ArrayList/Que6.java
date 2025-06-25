package ArrayList;

import java.util.ArrayList;

public class Que6 {



    public static int mostWater(ArrayList<Integer> height){
        int maxWater=0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            int ht=Math.min(height.get(lp),height.get(rp));
            int wt=rp-lp;
            int water =ht*wt;
            maxWater=Math.max(maxWater,water);
            if(lp<rp)
                lp++;
            else
                rp--;

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
