package logic.preparation.streamapi;

import logic.entities.Students;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.List.of;

public class StreamFindTopperOfSubject {
    public static void main(String[] args) {

       // id   Name        Age      Stream 			    Marks
       // 1    Avinash     30		Mechanical		    122
       // 2    Joe         56       Computer			67
       // 3    Kartik      25	    Mechanical		    164
       // 4    Zoe         30	    Biotech				26
       // 5    Chetan      26	    Instrumentation	    43
       // 6    Shubham     30		Biotech				126

        System.out.println("----------------------------------------------------");
        System.out.println("Find the highest marks Student from each department");
        System.out.println("----------------------------------------------------");

//        List<Students> listOfStud = new ArrayList<>();
//        listOfStud.add(new Students(1, "Avinash", 30, "Mechanical", 122));
//        listOfStud.add(new Students(2, "Joe", 56, "Computer", 67));
//        listOfStud.add(new Students(3, "Karthik", 25, "Mechanical", 164));
//        listOfStud.add(new Students(4, "Zoe", 30, "Biotech", 26));
//        listOfStud.add(new Students(5, "Chetan", 26, "Instrumentation", 43));
//        listOfStud.add(new Students(6, "Shubham", 30, "Biotech", 126));

        List<Students> ccStudent = Arrays.asList(
            new Students(1, "Avinash", 30, "Mechanical", 122),
            new Students(2, "Joe", 56, "Computer", 67),
            new Students(3, "Karthik", 25, "Mechanical", 164),
            new Students(4, "Zoe", 30, "Biotech", 26),
            new Students(5, "Chetan", 26, "Instrumentation", 43),
            new Students(6, "Shubham", 30, "Biotech", 126)
        );

        List<Students> sortedStudents = ccStudent.stream()
                .sorted((s1, s2) -> s1.getStream().compareTo(s2.getStream()))
                .collect(Collectors.toList());

        System.out.println(sortedStudents);

        Map<String, Optional<Students>> highestStreamStudent = ccStudent.stream()
                .collect(Collectors.groupingBy(
                   Students::getStream,
                   Collectors.reducing((s1, s2) -> s1.getMarks() > s2.getMarks() ? s1 : s2)
                ));

        System.out.println(""+highestStreamStudent);
    }
}
