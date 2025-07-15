package com.vetias.java.workshop.TempData.Beans;

import java.time.LocalDate;

public record Organization(String name,
String description,
String website,
String email,
String contactNumber,
long registrationNumber,
LocalDate registrationDate) {

    
}
