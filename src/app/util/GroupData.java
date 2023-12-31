package app.util;

import app.student.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupData {
    public static Map<Integer, List<Student>> getGroupStudent(List<Student> students){
        return  students.stream().collect(Collectors.groupingBy(Student::getKuz));


    }

    public static Map<Speciality, Long> getSpel(List<Student> students){
        return students.stream().
                collect(Collectors.groupingBy(Student::getSpec,
                Collectors.counting()));
    }

    public static void getOutput2(Map<Speciality, Long> students){
        students.forEach((s, count) -> System.out.println(s + ": " + count));
    }


public static void getOutput(Map<Integer, List<Student>> students){
    students.entrySet().forEach(System.out::println);
}
}
