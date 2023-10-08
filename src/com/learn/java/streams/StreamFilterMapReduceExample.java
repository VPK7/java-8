package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamFilterMapReduceExample {

    public static int noOfNoteBooks(){
       return StudentDataBase.getAllStudents().stream()
               .filter(student -> student.getGradeLevel()>=3)
               .filter(student -> student.getGender().equals("female"))
                .map(Student::getNoteBooks)
                //.reduce(0,(a,b)->a+b);
                .reduce(0,Integer::sum);
    }
    public static void main(String[] args) {
        System.out.println("noOfNoteBooks : "+noOfNoteBooks());
    }
}
