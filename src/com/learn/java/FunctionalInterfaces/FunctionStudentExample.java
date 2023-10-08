package com.learn.java.FunctionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static com.learn.java.FunctionalInterfaces.PredicateStudentExample.p1;
import static com.learn.java.FunctionalInterfaces.PredicateStudentExample.p2;

public class FunctionStudentExample {
    static Function<List<Student>, Map<String,Double>> studentfunction=(students -> {
        Map<String,Double> studentGradeMap=new HashMap<>();
        students.forEach(student -> {
            if(p2.test(student)){
            studentGradeMap.put(student.getName(),student.getGpa());
        }
        });
        return studentGradeMap;
    });

    public static void main(String[] args) {
        System.out.println(studentfunction.apply(StudentDataBase.getAllStudents()));
    }
}
