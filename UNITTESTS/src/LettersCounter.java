import java.util.List;

public class LettersCounter {
    public int countCharacterOccurrences(Character character, String text) {
        int numberOfOccurrences = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.toUpperCase(text.charAt(i)) == Character.toUpperCase(character)) {
                numberOfOccurrences++;
            }
        }
        return numberOfOccurrences;
    }

    public int countCharacterOccurrencesInListOfStrings(Character character, List<String> stringList) {
        int numberOfOccurrences = 0;

        for (String text : stringList) {
            numberOfOccurrences += countCharacterOccurrences(character, text);

        }
        return numberOfOccurrences;
    }
}