package com.learn.java.FunctionalInterfaces;

public class FunctionInterfaceExample1 {

    public static String performConcat(String str){
        return FunctionInterfaceExample.addSomeString.apply(str);
    }
    public static void main(String[] args) {
        String result=performConcat("Hello");
        System.out.println("Result : "+result);
    }
}
