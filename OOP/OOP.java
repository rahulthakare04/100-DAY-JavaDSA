public class OOP {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColar("pink");
        System.out.println(p1.colar);
        p1.setTip(8);
        System.out.println(p1.tip);
    }
}
class Pen{
    String colar;
    int tip;
    void setColar(String newColar){
        colar=newColar;
        
    }
    void setTip(int newTip){
        tip=newTip;
    }
}

class Student{
    String name;
    int age;
    float pearsentage;
    void calPearsentage(int phy ,int math,int che){
         pearsentage=(phy+che+math)/3;

    }
}
