package com.learn.java.lambda;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        /**
         * prior to java 8
         */
        Comparator<Integer> comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Legacy "+comparator.compare(3,2));

        /**
         * using lambda
         */
        Comparator<Integer> comparatorLambda=(Integer a, Integer b)->a.compareTo(b);
        System.out.println("Lambda1 "+comparatorLambda.compare(3,2));

        Comparator<Integer> comparatorLambda1=(a, b)->a.compareTo(b);
        System.out.println("lambda2 "+comparatorLambda1.compare(3,2));

        /**
         * Method reference operator
         */
        Comparator<Integer> comparatorLambda3= Integer::compareTo;
        System.out.println("Lambda1 "+comparatorLambda3.compare(3,2));

        /**
         * using Natural Order
         */
        Comparator<Integer> comparatorLambda4= Comparator.naturalOrder();
        System.out.println("Lambda1 "+comparatorLambda.compare(3,2));
    }
}
