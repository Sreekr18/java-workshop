package com.vetias.java.workshop.TempData.Beans;

import java.time.LocalDate;

public record Organization(String name,
String completeAddress,
String website,
String email,
String contactNumber,
long registrationNumber,
String description,
LocalDate registrationDate) {

    
}
