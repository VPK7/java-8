package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExampleDebug {
    public static void main(String[] args) {
        Predicate<Student> studentPredicate=(student -> student.getGradeLevel()>=3);
        Predicate<Student> studentPredicate1=(student -> student.getGpa()>=3.9);
        Map<String,List<String>> studentMap1= StudentDataBase.getAllStudents().stream()
                .peek((student -> {
                    System.out.println(" After stream : "+student);
                }))
                .filter(studentPredicate)//gives stream of students
                .peek((student -> {
                    System.out.println(" After 1st filter : "+student);
                }))
                .filter(studentPredicate1)//gives stream of students
                .peek((student -> {
                    System.out.println(" After 2nd filter : "+student);
                }))
                .collect(Collectors.toMap(Student::getName,Student::getActivities));//gives <Map>
        System.out.println(studentMap1);
    }
}
