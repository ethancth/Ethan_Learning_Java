package com.learningjava.methods;


import java.util.Arrays;

public class PassByValueDemo {

    public static void main(String[] args) {
        int i = 10;
        changeIntValue(i);
        System.out.println("i after changeIntValue : "+i);

        i = changeInt(i);
        System.out.println("i after changeInt : "+i);

        int[] array = {1,2,3};

        System.out.println("array before changeArrays : "+ Arrays.toString(array));
        changeArray(array);
        System.out.println("array after changeArrays : "+ Arrays.toString(array));
        clearArray(array);
        System.out.println("array after clearArray : "+ Arrays.toString(array));

    }

    private static void changeIntValue(int i) {
        i += 100;
    }

    private static int changeInt(int i) {
        i += 100;
        return i;
    }

    private static void changeArray(int[] array){
        array[1]=200;
    }
    private static void clearArray(int[] array){
        array[1] = 0;
    }
}
