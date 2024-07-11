import java.util.ArrayList;
import java.util.List;

class Book {
    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

 
    public Book searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }


    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book.getId() + " - " + book.getTitle() + " by " + book.getAuthor());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

       
        library.addBook(new Book(1, "Java Programming", "John Doe"));
        library.addBook(new Book(2, "Data Structures and Algorithms", "Jane Smith"));
        library.addBook(new Book(3, "Digital Signal Processing", "Richard G.Lyons"));
        library.addBook(new Book(4, "Ponniyin Selvan", "Kalki"));
        library.addBook(new Book(5, "Harry Potter", "Joanne rowling"));
        library.addBook(new Book(6, "First Folio", "William Shakespeare"));

 
        Book foundBook = library.searchByTitle("Java ");
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook.getTitle() + " by " + foundBook.getAuthor());
        } else {
            System.out.println("Book not found");
        }

       
        library.displayBooks();
    }
}
