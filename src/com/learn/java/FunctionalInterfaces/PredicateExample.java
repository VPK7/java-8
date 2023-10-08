package com.learn.java.FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> p=(i)->{
        return i%2==0;
    };
    static Predicate<Integer> p1=(i)-> i%2==0;
    static Predicate<Integer> p2=(i)->i%5==0;
    public static void predicateAnd(){
        System.out.println("predicate And result "+p1.and(p2).test(10));
        System.out.println("predicate And result "+p1.and(p2).test(9));
    }
    public static void predicateOr(){
        System.out.println("predicate OR result "+p1.or(p2).test(10));
        System.out.println("predicate OR result "+p1.or(p2).test(9));
    }
    public static void predicateNegate(){
        System.out.println("predicate Negate result "+p1.or(p2).negate().test(10));
        System.out.println("predicate Negate result "+p1.or(p2).negate().test(9));
    }
    public static void main(String[] args) {
        System.out.println(p.test(4));
        System.out.println(p1.test(4));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
