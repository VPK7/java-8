package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {

         //students name and their activities in a map. name as key and activities as value
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                                                .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(studentMap);

        //apply condition
        Predicate<Student> studentPredicate=(student -> student.getGradeLevel()>=3);
        Predicate<Student> studentPredicate1=(student -> student.getGpa()>=3.9);
        Map<String,List<String>> studentMap1=StudentDataBase.getAllStudents().stream()
                .filter(studentPredicate)//gives stream of students
                .filter(studentPredicate1)//gives stream of students
                .collect(Collectors.toMap(Student::getName,Student::getActivities));//gives <Map>
        System.out.println(studentMap1);

        //predicate internal
        Map<String,List<String>> studentMap2=StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel()>=3)
                .filter(student -> student.getGpa()>=3.9)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(studentMap2);

    }
}
