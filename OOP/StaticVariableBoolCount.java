public class StaticVariableBoolCount {
    public static void main(String[] args) {
        System.out.println(Book.count);
        Book b1=new Book(200);
        Book b2=new Book(250);
        System.out.println(Book.count);
    }
}
class Book{
    int price;
    static int count;

    public Book(int price){
        this.price=price;
        count++;
    }
}


