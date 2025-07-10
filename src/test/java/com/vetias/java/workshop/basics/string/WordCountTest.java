package com.vetias.java.workshop.basics.string;
import org.junit.jupiter.api.Assertions;
import com.vetias.java.workshop.basics.string.WordCount;
import org.junit.jupiter.api.Test;

public class WordCountTest {
    @Test
    public void testWordcount(){
        WordCount wordCount=new WordCount();
        int count = wordCount.count("this program shows");
        Assertions.assertEquals(12, count);
    }

}