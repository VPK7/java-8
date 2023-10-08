package com.learn.java.lambda;

import java.util.function.Consumer;

public class LambdaVariable2 {

    static int val=4;//instance variable
    public static void main(String[] args) {
        int value=4;//local variable
        Consumer<Integer> c1=(i)->{
            //value++; not allowed to reassign a value to a local variable i.e variable used in lambda is final or effectively final
            val++;// no issues for instance variables
            System.out.println(value+i);
            System.out.println(val);
        };

        c1.accept(4);
    }
}
