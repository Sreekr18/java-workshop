package com.vetias.java.workshop.TempData.Beans;

import java.time.LocalDate;

public record Organization(String name,
String completeAddress,
String Website,
String email,
String contactNumeber,
long registrationNumber,
LocalDate registrationDate) {

    
}
