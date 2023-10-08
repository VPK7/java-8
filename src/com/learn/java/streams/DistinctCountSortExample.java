package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctCountSortExample {

    public static List<String> printStudentActivitiesDistinct(){
        return StudentDataBase.getAllStudents().stream()//stream of Students
                .map(Student::getActivities)// stream of list of strings
                .flatMap(List::stream)//stream of strings
                .distinct() // distinct stream of strings
                .collect(Collectors.toList());
    }
    public static List<String> printStudentActivitiesDistinctSorted(){
        return StudentDataBase.getAllStudents().stream()//stream of Students
                .map(Student::getActivities)// stream of list of strings
                .flatMap(List::stream)//stream of strings
                .distinct() // distinct stream of strings
                .sorted()
                .collect(Collectors.toList());
    }
    public static long printStudentActivitiesCount(){
        return StudentDataBase.getAllStudents().stream()//stream of Students
                .map(Student::getActivities)// stream of list of strings
                .flatMap(List::stream)//stream of strings
                .distinct() // distinct stream of strings
                .count(); //count
    }
    public static void main(String[] args) {
        System.out.println("printStudentActivitiesDistinct : "+printStudentActivitiesDistinct());
        System.out.println("printStudentActivitiesDistinctSorted : "+printStudentActivitiesDistinctSorted());
        System.out.println("printStudentActivitiesCount : "+printStudentActivitiesCount());
    }
}
