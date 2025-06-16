public class Abtraction {
    public static void main(String[] args) {
        Dog mydog=new Dog();
        
    }
}
abstract class Animal{

    Animal(){
        System.out.println("animal");
    }
    String color;
    void eat(){
        System.out.println("eates ");
    }
}

class Hors extends Animal{
    Hors(){
        System.out.println("hors");
    }
    
}

class Dog extends Hors{
    Dog(){
        System.out.println("dog");
    }
}
