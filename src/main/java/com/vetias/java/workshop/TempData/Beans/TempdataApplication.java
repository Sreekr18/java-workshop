package com.vetias.java.workshop.TempData.Beans;

import java.time.LocalDate;

public class TempdataApplication {

    public static void main(String[] args) {
        Organization vet=new Organization("VET", 
        "Thindal",
         "www.vet.com", 
         "Contact@vet.com", 
         "+91-123456788",
         12356, LocalDate.of(1960, 03, 22));
         System.out.println(vet);

    }
}
