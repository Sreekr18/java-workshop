package com.vetias.java.workshop.basics;

import java.util.Arrays;

public class MarksArraySplitUsingCopyOf {

    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88};

        int[] firstThreeMarks = Arrays.copyOf(marks, 3); 

        int[] lastTwoMarks = Arrays.copyOfRange(marks, 3, marks.length);

        System.out.println("Original Marks: " + Arrays.toString(marks));
        System.out.println("First 3 Marks (using copyOf): " + Arrays.toString(firstThreeMarks));
        System.out.println("Last 2 Marks (using copyOfRange): " + Arrays.toString(lastTwoMarks));
    }
}
