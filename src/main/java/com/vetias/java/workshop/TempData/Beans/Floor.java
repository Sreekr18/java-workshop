package com.vetias.java.workshop.TempData.Beans;
public class Floor {
    private String name;
    private int number;
    private Zone[] zone;

    public Floor(String name, int number) {
        this.name = name;
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
   
    public void setZone(Zone[] zone) {
        this.zone = zone;
    }
    @Override
    public String toString() {
        return "Floors{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", zone=" + java.util.Arrays.toString(zone) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Floor floors = (Floor) o;
        return number == floors.number &&
                java.util.Objects.equals(name, floors.name) &&
                java.util.Arrays.equals(zone, floors.zone);
    }
    

    
    
}