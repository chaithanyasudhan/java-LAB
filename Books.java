import java.util.Scanner;

class Book {
    private String name;
    private String author;
    private int price;
    private int numPages;

    Book(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getNumPages() {
        return numPages;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Author: " + author + ", Price: " + price + ", Pages: " + numPages;
    }
}

public class Books {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the number of books:");
        int n = obj.nextInt();
        obj.nextLine();

        Book[] b = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.println("Enter book name:");
            String name = obj.nextLine();
            System.out.println("Enter author name:");
            String author = obj.nextLine();
            System.out.println("Enter price:");
            int price = obj.nextInt();
            System.out.println("Enter number of pages:");
            int numPages = obj.nextInt();
            obj.nextLine();
            b[i] = new Book(name, author, price, numPages);
        }

        System.out.println("\nDetails of all books:");
        for (int i = 0; i < n; i++) {
            System.out.println("Book " + (i + 1) + ": " + b[i].toString());
        }

        obj.close();
    }
}