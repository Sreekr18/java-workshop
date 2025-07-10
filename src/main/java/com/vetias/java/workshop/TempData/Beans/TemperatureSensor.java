package com.vetias.java.workshop.TempData.Beans;
public class TemperatureSensor implements Sensor {
     private float temprature;
     public TemperatureSensor(float addTemprature){
        temprature=addTemprature;
     }
     @Override
     public float getReading()
     {
        return temprature;
     }
      

}