import java.util.*;
import java.util.stream.*;

public class NotesDistribution {

    // A simple student: a name and a list of notes
    static class Student {
        String name;
        int[] notes;

        Student(String name, int[] notes) {
            this.name = name;
            this.notes = notes;
        }
    }

    public static Map<Integer, Integer> getNotesDistribution(List<Student> students) {
        return students.stream()
            .flatMapToInt(s -> Arrays.stream(s.notes))  // join all notes into one stream
            .filter(n -> n >= 1 && n <= 5)              // keep only valid notes
            .boxed()
            .collect(Collectors.groupingBy(
                n -> n,                                 // group by note value
                TreeMap::new,                           // keep keys sorted
                Collectors.summingInt(n -> 1)));        // count each one
    }

    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student("Steve", new int[]{5, 5, 3, -1, 6}),
            new Student("John", new int[]{3, 2, 5, 0, -3})
        );

        System.out.println(getNotesDistribution(students));
        // {2=1, 3=2, 5=3}
    }
}