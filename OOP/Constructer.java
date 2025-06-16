public class Constructer {
public static void main(String[] args) {
    Student stud=new Student();
}    
}

class Student{
    String name;
    int mark;

    Student(){
        System.out.println("constructer is called");
    }

}
