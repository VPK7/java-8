package com.learn.java.NumericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {

    public static List<Integer> boxing(){

       return IntStream.rangeClosed(1,10) // intstream of 10 elements
                //int
                .boxed()
                //Integer
                .collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> integerList){
            //wrapper to primitive
        return integerList.stream()
                //Wrapper Integer Values
                .mapToInt(Integer::intValue) // intstream(intValue of the Wrapper class)
                .sum();


    }

    public static int[] unBoxingtointArray(List<Integer> integerList){
        //wrapper to primitive
        return integerList.stream()
                //Wrapper Integer Values
                .mapToInt(Integer::intValue) // intstream(intValue of the Wrapper class)
                .toArray();

    }

    public static IntStream unBoxingtointArray1(List<Integer> integerList){
        //wrapper to primitive
        return integerList.stream()
                //Wrapper Integer Values
                .mapToInt(Integer::intValue); // intstream(intValue of the Wrapper class)

    }

    public static void main(String[] args) {

        System.out.println("Boxing : " + boxing());

        List<Integer> integerList = boxing();
        System.out.println("Unboxing : " + unBoxing(integerList));

        int[] a =unBoxingtointArray(integerList);
        Arrays.stream(a).forEach(System.out::print);
        System.out.println();
        IntStream intStream=unBoxingtointArray1(integerList);
        intStream.forEach(System.out::print);

        String s= "Thiis iss a Test !";
        StringBuilder s1=new StringBuilder();
        s1.append(s.charAt(0));//T
        System.out.println("s1 "+s1);
        System.out.println("s1 "+s.charAt(2));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1))
                s1.append(i);//This is

        }
        System.out.println("S " + s1);
    }
}
