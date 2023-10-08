package com.learn.java.FunctionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> p1=(s)->s.getGradeLevel()>=3;
    Predicate<Student> p2=(s)->s.getGpa()>=3.9;
    BiConsumer<String, List<String>> studentBiConsumer=(name,activies)-> System.out.println(name+" : "+activies);

    Consumer<Student> studentConsumer=(student -> {
        if (p1.and(p2).test(student)){
            studentBiConsumer.accept(student.getName(),student.getActivities());
        }
    });
    public void printNameAndActivites(List<Student> students){
        students.forEach(studentConsumer);
    }
    public static void main(String[] args) {
       List<Student> studentList= StudentDataBase.getAllStudents();
       new PredicateAndConsumerExample().printNameAndActivites(studentList);
    }
}
