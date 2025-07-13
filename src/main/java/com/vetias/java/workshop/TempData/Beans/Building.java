package com.vetias.java.workshop.temperaturedata.beans;

import java.time.LocalDateTime;

public class Building {
    private String name;
    private double area;
    private  int floors;
    private LocalDateTime opendatetime;
    private LocalDateTime closedatetime;
    public void setName(String aName){
        name=aName;

    }
    public String getName()
    {
        return name;
    }
    public void setArea(double aArea){
        area=aArea;

    }
    public double getArea()
    {
        return area;
    }
    public void setFloors(int aFloors){
        floors=aFloors;

    }
    public int getFloors(){
        return floors;
    }
    public void setOpenDateTime(LocalDateTime aOpDateTime){
        opendatetime=aOpDateTime;

    }
    public LocalDateTime getaOpDateTime(){
        return opendatetime;
    }
    public void setCloseDateTime(LocalDateTime aCloseDateTime){
        closedatetime=aCloseDateTime;

    }
    public LocalDateTime getaCloseDateTime(){
        return closedatetime;
    }


    
    
}
