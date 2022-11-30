import java.util.*;

public class ArrayListHashSet {
    public static void toHashSet() {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.addAll(Arrays.asList("Apple", "Pear", "Banana", "Apple", "Cherry", "Fig", "Orange", "Banana", "Apple"));
        System.out.println("The size of fruit list is: " + fruits.size());
        HashSet<String> fruitsHashSet = new HashSet<>();
        for (String element : fruits
        ) {
            fruitsHashSet.add(element);

        }
        System.out.println(fruitsHashSet);
        System.out.println("The size of fruit HashSet list is: " + fruitsHashSet.size());
    }
}
