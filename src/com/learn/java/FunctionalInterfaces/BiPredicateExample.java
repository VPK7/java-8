package com.learn.java.FunctionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BiPredicateExample {

    BiPredicate<Integer,Double> biPredicate=(gradelevel,gpa)->gradelevel>=3 &&gpa>=3.9;
    BiConsumer<String, List<String>> studentBiConsumer=(name, activies)-> System.out.println(name+" : "+activies);

    Consumer<Student> studentConsumer=(student -> {
        if (biPredicate.test(student.getGradeLevel(),student.getGpa())){
            studentBiConsumer.accept(student.getName(),student.getActivities());
        }
    });
    public void printNameAndActivites(List<Student> students){
        students.forEach(studentConsumer);
    }
    public static void main(String[] args) {
        List<Student> studentList= StudentDataBase.getAllStudents();
        new BiPredicateExample().printNameAndActivites(studentList);
    }
}
