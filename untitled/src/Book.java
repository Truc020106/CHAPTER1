public class Book {
    private String Name;
    private Author author;
    private double price;
    private int quantity;

    public  Book(String Name, Author author,)

    public Book(String Name, Author author, double price, int quantity) {
        this.Name=Name;
        this.author=author;
        this.price=price;
        this.quantity=quantity;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Name='" + Name + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
