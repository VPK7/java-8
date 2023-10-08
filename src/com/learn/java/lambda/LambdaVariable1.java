package com.learn.java.lambda;

import java.util.function.Consumer;

public class LambdaVariable1 {
    public static void main(String[] args) {
        int i=0;//local variable
        Consumer<Integer> c1=(i1)->{
            // int i=2 cannot use same variale i which is local in main method inside lambda body or as a param
            System.out.println("Value is "+i1);
        };
        c1.accept(4);
    }
}
