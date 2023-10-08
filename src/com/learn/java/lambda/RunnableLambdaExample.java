package com.learn.java.lambda;

public class RunnableLambdaExample  {
    public static void main(String[] args) {
        /**
         * prior to java 8
         */
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable1");
            }
        };
        new Thread(runnable).start();
        /**
         * using lambda
         */
        Runnable runnablelambda =() ->{
            System.out.println("Inside Runnable2");
        };
        new Thread(runnablelambda).start();
        /**
         * 2
         */
        Runnable runnablelambda1 =() -> System.out.println("Inside Runnable3");
        new Thread(runnablelambda1).start();
        /**
         * 3
         */
        new Thread(()-> System.out.println("Inside Runnable4")).start();

        /**
         * more than 1 statement then use {} braces
         */
        new Thread(()->{
            System.out.println(" Runnable lambda1");
            System.out.println(" Runnable lambda2");
        }).start();
    }
}
