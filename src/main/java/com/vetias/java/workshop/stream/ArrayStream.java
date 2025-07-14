package com.vetias.java.workshop.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayStream {
    public static void main(String[] args) {
        int[] marks ={90,98,55,22,40,44};
        long  subjectsPassed= Arrays.stream(marks).filter(mark->mark>=40).count();
        System.out.println(subjectsPassed);
        
    }

}
