package com.vetias.java.workshop.basics;

public class HighestBreadPrice {

    public static void main(String[] args) {
        int[] breadPrices = {85, 90, 95, 100, 105};
        int highestPrice = breadPrices[0];

        for (int i = 1; i < breadPrices.length; i++) {
            if (breadPrices[i] > highestPrice) {
                highestPrice = breadPrices[i];
            }
        }
        System.out.println("The highest price of bread is: " + highestPrice);
    }
}
