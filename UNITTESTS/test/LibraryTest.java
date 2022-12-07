import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;


public class LibraryTest {
    Library library = new Library();

    @BeforeEach
    public void setListOfThreeBooks() {
        library.setListOfBooks(new ArrayList<>(List.of(new Book(150, "Nature"), new Book(100, "Science"), new Book(200, "Architecture"))));
    }

    @Test
    public void Should_ReturnListOfThreeBooks_When_ListSetWithSetListOfThreeBooks() {
        Assertions.assertEquals(List.of(new Book(150, "Nature"), new Book(100, "Science"), new Book(200, "Architecture")), library.getListOfBooks());
    }

    @Test
    public void Should_ReturnThree_When_ListSetWithSetListOfThreeBooks() {
        Assertions.assertEquals(3, library.getNumberOfBooks());
    }

    @Test
    public void Should_ReturnNull_When_BookIsNotFoundByTitle() {
        Assertions.assertEquals(null, library.findBookByTitle("History"));
    }

    @Test
    public void Should_ReturnBook_When_BookIsFoundByTitle() {
        Assertions.assertEquals(new Book(200, "Architecture"), library.findBookByTitle("Architecture"));
    }

    @Test
    public void Should_ReturnBook_When_BookHasHighestNumberOfPages() {
        Assertions.assertEquals(new Book(200, "Architecture"), library.getBookWithHighestNumberOfPages());
    }

}
