package com.Bridgelabz.Day23Assignments;

import java.util.ArrayList;

    interface MyInterface{
        void arithmeticOperation(int num1, int num2);
//void findSum(int num3,int num5, int num4);
    }
    public class LambdaExprnDemo {
        public void simpleMethod(){
            System.out.println(5);
//return 5;
        }

        public void storeLambdaDemo(){
//int num = 0;
            ArrayList<Integer> integerArrayList = new ArrayList<>();
            integerArrayList.forEach(num -> System.out.println(num));
// Store the lambda expression in a variable of type interface
            MyInterface varToStoreLambdaExpn = (num1,num2) -> System.out.println(num1 * num2);
            MyInterface varToStoreSum = (num3, num5) -> System.out.println(num3 + num5);
            MyInterface varToStoreDiff = (num1, num2) -> System.out.println(num1 - num2);

//To evaluate the lambda expression,
// we need to call the abstract method defined inside the interface
            varToStoreLambdaExpn.arithmeticOperation(3,7);
            varToStoreSum.arithmeticOperation(3,7);
            varToStoreDiff.arithmeticOperation(3,7);
        }

        public static void main(String[] args) {
            LambdaExprnDemo led = new LambdaExprnDemo();
            led.storeLambdaDemo();
        }
    }

