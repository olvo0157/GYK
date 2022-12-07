import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LettersCounterTest {
    LettersCounter lettersCounter = new LettersCounter();

    @Test
    public void testCalculationOfCharacterOccurrences() {
        int expected = 2;
        int actual = lettersCounter.countCharacterOccurrences('t', "Tekstas");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculationOfCharacterOccurrencesInListOfString() {
        int expected = 3;
        int actual = lettersCounter.countCharacterOccurrencesInListOfStrings('t', List.of("Tekstas", "Sakinys", "Taskas"));
        Assertions.assertEquals(expected, actual);
    }
}