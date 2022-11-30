import java.util.*;

public class ArrayListMap {
    public static void toMap(){
        System.out.println("--------- To map -------");
        ArrayList<Student> students = new ArrayList<>();
        students.addAll(Arrays.asList(
                new Student("Jonas", 20, 3),
                new Student("Petras", 27, 5),
                new Student("Joana", 25, 4),
                new Student("Paulina", 26, 3),
                new Student("Rita", 23, 6)));
        Map<Integer,Student> studentMap= new HashMap<>() ;
        int index =1;
        for (Student student:students){
            student.setId(index);
            studentMap.put(index, student);
            index++;

        }
        System.out.println(studentMap);
        //1st option for: Take 4 index Student and change his grade and age.
        Student student= new Student();
        student = studentMap.get(4);
        student.setAge(21);
        student.setGrade(2);
        studentMap.put(4,student);

        //2nd option for:Take 4 index Student and change his grade and age.
        studentMap.replace(4,new Student(studentMap.get(4).getName(),21,2));

        for (Integer mapIndex:studentMap.keySet()
        ) {
            System.out.println("Index and values:"+ mapIndex+ "; "+studentMap.get(mapIndex).toString());

        }
    }
}