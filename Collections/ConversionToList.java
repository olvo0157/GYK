import java.util.*;

public class ConversionToList {
    public static void task() {
        System.out.println("Conversion to List task");
        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> intList = new ArrayList<>();
        for (int member : intArray
        ) {
            intList.add(member);
        }
        System.out.println(intList);

        List<Student> students = new ArrayList<>();
        students.addAll(Arrays.asList(
                new Student("Jonas", 20, 3),
                new Student("Petras", 27, 5),
                new Student("Joana", 25, 4),
                new Student("Paulina", 26, 3),
                new Student("Rita", 23, 6)));
        students.removeIf((Student age) -> (age.getAge() > 25));
        System.out.println(students);
    }
}
