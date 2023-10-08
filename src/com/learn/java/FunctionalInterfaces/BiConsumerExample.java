package com.learn.java.FunctionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){
        BiConsumer<String, List<String>> biConsumer=(name,activities)-> System.out.println(name +" : "+activities);
        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach(student -> biConsumer.accept(student.getName(),student.getActivities()));
    }
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> multiply=(a,b)->{
            System.out.println("multiply: "+a*b);
        };
        BiConsumer<Integer,Integer> division=(a,b)->{
            System.out.println("division: "+a/b);
        };
        multiply.andThen(division).accept(10,5);
        nameAndActivities();
    }
}
