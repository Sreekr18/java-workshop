package com.vetias.java.workshop.basics;

public class Words {
    public static void main(String[] args) {
        String text= "This program showshow can we split a"+ "string into multiple strings. We need to find sentence,"+"word and letter count";
        String[] sentences = text.split("[.]");
        String[] words = text.split(" ");
        String[] chr = text.split("");
        System.out.println("Number of sentences: " + sentences.length);
        System.out.println("Number of words: " + words.length);
        //since "text" is a string, we can use the length() method to get the number of characters but not "text.length"
        System.out.println("Number of characters:"+text.length());
        //here we used "chr.length" to get the number of characters in the string "text" after splitting it into individual arrays.Because of making it array. we used the "chr.length" to get the number of characters.
        System.out.println("Number of characters: " + chr.length); 
        
       


    
}
}