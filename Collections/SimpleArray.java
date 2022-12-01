import java.util.Arrays;

public class SimpleArray {
    public static void smallTask() {
        System.out.println("----- Small tasks -----");
        String[] cars = {"Subaru", "Bmw", "Suzuki"};
        System.out.println("Second item in the cars array: " + cars[1]);
        for (int i = 0; i < cars.length; i++
        ) {
            if (cars[i] == "Suzuki") {
                cars[i] = "Honda";
            }
        }
        System.out.println("Number of elements in the car array: " + cars.length);
        for (String car : cars
        ) {
            System.out.println(car);
        }
    }

    public static void finalTask() {
        System.out.println("----- Final task -----");
        int[] elements = {40, 55, 63, 17, 22, 68, 89, 97, 89};
        for (int i = 0; i < elements.length; i++) {
            if (i == elements.length - 1) {
                System.out.println(elements[i]);
            } else {
                System.out.print(elements[i] + " ");
            }
        }

    }
}
