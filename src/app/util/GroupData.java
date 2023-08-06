package app.util;

import app.student.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupData {
    private Map<Integer, List<Student>> getGroupStudent(List<Student> students){
        students.stream().collect(Collectors.groupingBy(Student::getKuz))
                .entrySet().forEach(System.out::println);
        return (Map<Integer, List<Student>>) students;
    }

}
