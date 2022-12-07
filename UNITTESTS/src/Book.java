import java.util.Objects;

public class Book {
    private int numberOfPages;
    private String bookTitle;

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public Book(int numberOfPages, String bookTitle) {
        this.numberOfPages = numberOfPages;
        this.bookTitle = bookTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getNumberOfPages() == book.getNumberOfPages() && Objects.equals(getBookTitle(), book.getBookTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumberOfPages(), getBookTitle());
    }

    @Override
    public String toString() {
        return "Book{" + "numberOfPages=" + numberOfPages + ", bookTitle='" + bookTitle + '\'' + '}';
    }
}
