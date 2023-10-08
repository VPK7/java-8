package com.learn.java.FunctionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> c2=(student -> System.out.println(student));
    static Consumer<Student> c3=(student -> System.out.print(student.getName()));
    static Consumer<Student> c4=(student -> System.out.println(student.getActivities()));
    
    public static void printStudents(){
        System.out.println("printStudents");
        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }
    public static void printNameAndActivites(){
        System.out.println("printNameAndActivites");
        List<Student> studentList=StudentDataBase.getAllStudents();
        studentList.forEach(c3.andThen(c4));//consumer chaining

    }
    public static void printNameAndActivitesUsingCondition(){
        System.out.println("printNameAndActivitesUsingCondition");
        List<Student> studentList=StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(student.getGradeLevel()>=3 && student.getGpa()>=3.9){
                c3.andThen(c4).accept(student);
            }
        }));

    }
    public static void main(String[] args) {
        Consumer<String> c1=(s -> System.out.println(s.toUpperCase()));
        c1.accept("java8");
        printStudents();
        printNameAndActivites();
        printNameAndActivitesUsingCondition();
    }
}
