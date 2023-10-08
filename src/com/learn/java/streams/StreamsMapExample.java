package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamsMapExample {

    public static List<String> namesList(){

        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                //Student as an input -> Student Name
                .map(Student::getName) //Stream<String>
                .map(String::toUpperCase) //Stream<String> -> uppercase operation on each input
                .collect(toList());

    }


    public static Set<String> namesSet(){

        Set<String> studentList = StudentDataBase.getAllStudents().stream() //Stream<Student>
                //Student as an input -> Student Name
                .map(Student::getName) //Stream<String>
                .map(String::toUpperCase) //Stream<String> -> uppercase operation on each input
                .collect(toSet()); //Set<String>

        return studentList;

    }

    public static void main(String[] args) {

        System.out.println(namesList());
        System.out.println(namesSet());

    }
}
