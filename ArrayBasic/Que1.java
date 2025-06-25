package ArrayBasic;

public class Que1 {
    public static void main(String[] args) {
        int [] marks={60,90,65,25,34,89,45,};
        int n=marks.length;
        for (int i = 0; i <n ; i++) {
            if(marks[i]<35){
                System.out.println("role no of student id : "+i);
            }

        }
    }
}
