package com.learn.java.streams;

import com.learn.java.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsFilterExample {


    public static void main(String[] args) {
        System.out.println("filter by Gender");
        StudentDataBase.getAllStudents().stream()
                .filter((student -> student.getGender().equals("female")))
                .collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("filter by Gender and Gpa");
        StudentDataBase.getAllStudents().stream()
                .filter((student -> student.getGender().equals("female")))
                .filter(student -> student.getGpa()>=3.9)
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
