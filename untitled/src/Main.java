import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Author author  = new Author("Truc", "trungtruc.020105@gmail.com",'m');
        Book book = new Book("Truc", "Trung", 160,100);
        System.out.println(author.toString());
        System.out.println(book.toString());
    }
}