public class RefrenceVariable {
    public static void main(String[] args) {
        Vehical obj1=new car();//using refrence variabel obj
        obj1.print();

        Vehical obj2=new Vehical();
        obj2.print();
    }
}

class Vehical{
    void print(){
        System.out.println("base class(vehical)");
    }
}
class car extends Vehical{
    void print(){
        System.out.println("direive class(car)");
    }
}
