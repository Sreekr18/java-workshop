package com.vetias.java.workshop.basics;

import java.util.Arrays;

public class MarksArraySplitCRFN {

    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88};

        int[] firstThreeMarks = Arrays.copyOfRange(marks, 0, 3);

        int[] lastTwoMarks = Arrays.copyOfRange(marks, 3, marks.length);

        System.out.println("Original Marks: " + Arrays.toString(marks));

        System.out.println("First 3 Marks: " + Arrays.toString(firstThreeMarks));
        System.out.println("Last 2 Marks: " + Arrays.toString(lastTwoMarks));
    }
}
