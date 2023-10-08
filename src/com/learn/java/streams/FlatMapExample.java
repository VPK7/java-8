package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

    public static List<String> printStudentActivities(){
        return StudentDataBase.getAllStudents().stream()//stream of Students
                .map(Student::getActivities)// stream of list of strings
                .flatMap(List::stream)//stream of strings
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println("printStudentActivities : "+printStudentActivities());
    }
}
