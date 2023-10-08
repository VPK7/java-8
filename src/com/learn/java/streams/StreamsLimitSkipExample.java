package com.learn.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integers){
        return integers.stream()
                //6
                //7
                //8
                //9
                //10
                .limit(3) //6,7,8
                .reduce((x,y)->x+y);
    }

    public static Optional<Integer> skip(List<Integer> integers){
        return integers.stream()
                //6
                //7
                //8
                //9
                //10
                .skip(3)//9,10
                .reduce((x,y)->x+y);
    }

    public  static List<Integer> skipAndLimitList(List<Integer> integers){
        return integers.stream()
                .skip(2)
                .limit(2)
                .collect(Collectors.toList());

    }

    public  static Optional<Integer> skipAndLimit(List<Integer> integers){
        return integers.stream()
                .skip(2)
                .limit(2)
                .reduce(Integer::sum);
    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(6,7,8,9,10);
        /*Optional<Integer> limitResult = limit(integers);
        if(limitResult.isPresent()){
            System.out.println("The limit result is :" + limitResult.get());
        }else{
            System.out.println("No input is passed");
        }
*/
        /*Optional<Integer> skipResult = skip(integers);
        if(skipResult.isPresent()){
            System.out.println("The skip result is :" + skipResult.get());
        }else{
            System.out.println("No input is passed");
        }*/
        List<Integer> list=skipAndLimitList(integers);
        System.out.println("list of elements after skip and limit is : "+list);
        Optional<Integer> result = skipAndLimit(integers);
        if(result.isPresent()){
            System.out.println("The result is :" + result.get());
        }else{
            System.out.println("No input is passed");
        }

    }
}
