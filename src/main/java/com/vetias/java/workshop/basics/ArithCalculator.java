package com.vetias.java.workshop.basics;

public class ArithCalculator {
 
    public static void main(String[] args) {
           int a=3,b=0;{

    
     try{
            if (b==0) 
            {
                throw new ArithmeticException("0 cant be a divisor");
            }
        }
        catch(ArithmeticException e)
        {
                System.out.println(e.getMessage());
        }
    }

        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a/b);

    }
}
