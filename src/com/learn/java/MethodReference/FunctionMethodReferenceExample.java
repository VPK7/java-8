package com.learn.java.MethodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
    static Function<String,String> methodRef=String::toUpperCase;
    public static void main(String[] args) {
        System.out.println(methodRef.apply("java8"));
    }
}
