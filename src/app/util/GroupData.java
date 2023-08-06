package app.util;

import app.student.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupData {
    public static Map<Integer, List<Student>> getGroupStudent(List<Student> students){
        return  students.stream().collect(Collectors.groupingBy(Student::getKuz));


    }
public static void getOutput(Map<Integer, List<Student>> groupStudent){
    groupStudent.entrySet().forEach(System.out::println);
}
}
