import java.util.ArrayList;
import java.util.Comparator;

import java.util.Objects;

public class Library {
    private ArrayList<Book> listOfBooks;

    public int getNumberOfBooks() {
        return listOfBooks.size();
    }

    public Book findBookByTitle(String title) {
        for (Book book : listOfBooks) {
            if (book.getBookTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public Book getBookWithHighestNumberOfPages() {
        listOfBooks.sort(Comparator.comparing(Book::getNumberOfPages).reversed());
        return listOfBooks.get(0);

    }

    public ArrayList<Book> getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(ArrayList<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library)) return false;
        Library library = (Library) o;
        return Objects.equals(getListOfBooks(), library.getListOfBooks());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getListOfBooks());
    }

    @Override
    public String toString() {
        return "Library{" + "listOfBooks=" + listOfBooks + '}';
    }


    public Library() {
    }
}

