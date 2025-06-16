public class Inheritance {

    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
    }
}
class Animal{
    String colar;

    void eat(){
        System.out.println("eates");
    }
    void drink(){
        System.out.println("drink");
    }
    void run(){
        System.out.println("runs");
    }
}

class Fish extends Animal {
    void fethers(){
        System.out.println("feathers ");
    }
}